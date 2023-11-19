package com.banksy.app.modules.login.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import com.banksy.app.R
import com.banksy.app.appcomponents.base.BaseActivity
import com.banksy.app.appcomponents.di.MyApp
import com.banksy.app.appcomponents.googleauth.GoogleHelper
import com.banksy.app.databinding.ActivityLogInBinding
import com.banksy.app.extensions.NoInternetConnection
import com.banksy.app.extensions.isJSONObject
import com.banksy.app.extensions.showProgressDialog
import com.banksy.app.modules.homecontainer.ui.HomeContainerActivity
import com.banksy.app.modules.login.`data`.viewmodel.LogInVM
import com.banksy.app.modules.signup.ui.SignUpActivity
import com.banksy.app.network.models.createlogin.CreateLoginResponse
import com.banksy.app.network.resources.ErrorResponse
import com.banksy.app.network.resources.SuccessResponse
import com.google.android.material.snackbar.Snackbar
import com.google.gson.Gson
import java.lang.Exception
import kotlin.String
import kotlin.Unit
import org.json.JSONObject
import retrofit2.HttpException

class LogInActivity : BaseActivity<ActivityLogInBinding>(R.layout.activity_log_in) {
  private val viewModel: LogInVM by viewModels<LogInVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.logInVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error ->

      })
    }

    override fun setUpClicks(): Unit {
      binding.btnSignInWith.setOnClickListener {
        googleLogin.login()
      }
      binding.txtSignup.setOnClickListener {
        val destIntent = SignUpActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    override fun addObservers(): Unit {
      var progressDialog : AlertDialog? = null
      viewModel.progressLiveData.observe(this@LogInActivity) {
        if(it) {
          progressDialog?.dismiss()
          progressDialog = null
          progressDialog = this@LogInActivity.showProgressDialog()
        } else {
          progressDialog?.dismiss()
        }
      }
      viewModel.createLoginLiveData.observe(this@LogInActivity) {
        if(it is SuccessResponse) {
          val response = it.getContentIfNotHandled()
          onSuccessCreateLogin(it)
        } else if(it is ErrorResponse) {
          onErrorCreateLogin(it.data ?:Exception())
        }
      }
    }

    private fun onSuccessCreateLogin(response: SuccessResponse<CreateLoginResponse>): Unit {
      viewModel.bindCreateLoginResponse(response.data)
      val destBundle = Bundle()
      destBundle.putString("id",Gson().toJson(viewModel.createLoginLiveData.value?.getSuccessResponse()?.))
      val destIntent = HomeContainerActivity.getIntent(this, destBundle)
      destIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
      startActivity(destIntent)
    }

    private fun onErrorCreateLogin(exception: Exception): Unit {
      when(exception) {
        is NoInternetConnection -> {
          Snackbar.make(binding.root, exception.message?:"", Snackbar.LENGTH_LONG).show()
        }
        is HttpException -> {
          val errorBody = exception.response()?.errorBody()?.string()
          val errorObject = if (errorBody != null  && errorBody.isJSONObject())
          JSONObject(errorBody) else JSONObject()
          Toast.makeText(this@LogInActivity,MyApp.getInstance().getString(R.string.msg_invalid_username_or_pa),Toast.LENGTH_LONG).show()
        }
      }
    }

    companion object {
      const val TAG: String = "LOG_IN_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, LogInActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
