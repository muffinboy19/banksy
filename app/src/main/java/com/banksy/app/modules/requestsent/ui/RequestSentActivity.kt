package com.banksy.app.modules.requestsent.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.banksy.app.R
import com.banksy.app.appcomponents.base.BaseActivity
import com.banksy.app.databinding.ActivityRequestSentBinding
import com.banksy.app.modules.requestsent.`data`.viewmodel.RequestSentVM
import kotlin.String
import kotlin.Unit

class RequestSentActivity : BaseActivity<ActivityRequestSentBinding>(R.layout.activity_request_sent)
    {
  private val viewModel: RequestSentVM by viewModels<RequestSentVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.requestSentVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "REQUEST_SENT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RequestSentActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
