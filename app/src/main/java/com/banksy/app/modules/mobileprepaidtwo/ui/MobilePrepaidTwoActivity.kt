package com.banksy.app.modules.mobileprepaidtwo.ui

import androidx.activity.viewModels
import com.banksy.app.R
import com.banksy.app.appcomponents.base.BaseActivity
import com.banksy.app.databinding.ActivityMobilePrepaidTwoBinding
import com.banksy.app.modules.mobileprepaidthree.ui.MobilePrepaidThreeActivity
import com.banksy.app.modules.mobileprepaidtwo.`data`.viewmodel.MobilePrepaidTwoVM
import kotlin.String
import kotlin.Unit

class MobilePrepaidTwoActivity :
    BaseActivity<ActivityMobilePrepaidTwoBinding>(R.layout.activity_mobile_prepaid_two) {
  private val viewModel: MobilePrepaidTwoVM by viewModels<MobilePrepaidTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.mobilePrepaidTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnContinue.setOnClickListener {
      val destIntent = MobilePrepaidThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "MOBILE_PREPAID_TWO_ACTIVITY"

  }
}
