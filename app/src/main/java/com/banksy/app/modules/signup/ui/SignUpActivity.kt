package com.banksy.app.modules.signup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import com.banksy.app.R
import com.banksy.app.appcomponents.base.BaseActivity
import com.banksy.app.appcomponents.googleauth.GoogleHelper
import com.banksy.app.databinding.ActivitySignUpBinding
import com.banksy.app.extensions.NoInternetConnection
import com.banksy.app.extensions.isJSONObject
import com.banksy.app.extensions.showProgressDialog
import com.banksy.app.modules.homecontainer.ui.HomeContainerActivity
import com.banksy.app.modules.login.ui.LogInActivity
import com.banksy.app.modules.signup.`data`.viewmodel.SignUpVM
import com.banksy.app.network.models.createregister.CreateRegisterResponse
import com.banksy.app.network.resources.ErrorResponse
import com.banksy.app.network.resources.SuccessResponse
import com.google.android.material.snackbar.Snackbar
import java.lang.Exception
import kotlin.String
import kotlin.Unit
import org.json.JSONObject
import retrofit2.HttpException

class SignUpActivity : BaseActivity<ActivitySignUpBinding>(R.layout.activity_sign_up) {
  private val viewModel: SignUpVM by viewModels<SignUpVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error -> 

      })
    }

    override fun setUpClicks(): Unit {
      binding.btnSignUpWith.setOnClickListener {
        googleLogin.login()
      }
      binding.txtSignin.setOnClickListener {
        val destIntent = LogInActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    override fun addObservers() {
      var progressDialog : AlertDialog? = null
      viewModel.progressLiveData.observe(this@SignUpActivity) {
        if(it) {
          progressDialog?.dismiss()
          progressDialog = null
          progressDialog = this@SignUpActivity.showProgressDialog()
        } else  {
          progressDialog?.dismiss()
        }
      }
      viewModel.createRegisterLiveData.observe(this@SignUpActivity) {
        if(it is SuccessResponse) {
          val response = it.getContentIfNotHandled()
          onSuccessCreateRegister(it)
        } else if(it is ErrorResponse)  {
          onErrorCreateRegister(it.data ?:Exception())
        }
      }
    }

    private fun onSuccessCreateRegister(response: SuccessResponse<CreateRegisterResponse>) {
      viewModel.bindCreateRegisterResponse(response.data)
      val destIntent = HomeContainerActivity.getIntent(this, null)
      destIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
      startActivity(destIntent)
    }

    private fun onErrorCreateRegister(exception: Exception) {
      when(exception) {
        is NoInternetConnection -> {
          Snackbar.make(binding.root, exception.message?:"", Snackbar.LENGTH_LONG).show()
        }
        is HttpException -> {
          val errorBody = exception.response()?.errorBody()?.string()
          val errorObject = if (errorBody != null  && errorBody.isJSONObject())
              JSONObject(errorBody) else JSONObject()
          val errMessage = if(!errorObject.optString("message").isNullOrEmpty()) {
            errorObject.optString("message").toString()
          } else {
             exception.response()?.message()?:""
          }
          Toast.makeText(this@SignUpActivity,errMessage,Toast.LENGTH_LONG).show()
        }
      }
    }

    companion object {
      const val TAG: String = "SIGN_UP_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, SignUpActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
