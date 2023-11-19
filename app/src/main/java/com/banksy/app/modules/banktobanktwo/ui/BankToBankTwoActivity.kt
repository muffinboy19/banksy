package com.banksy.app.modules.banktobanktwo.ui

import androidx.activity.viewModels
import com.banksy.app.R
import com.banksy.app.appcomponents.base.BaseActivity
import com.banksy.app.databinding.ActivityBankToBankTwoBinding
import com.banksy.app.modules.banktobankthree.ui.BankToBankThreeActivity
import com.banksy.app.modules.banktobanktwo.`data`.viewmodel.BankToBankTwoVM
import kotlin.String
import kotlin.Unit

class BankToBankTwoActivity :
    BaseActivity<ActivityBankToBankTwoBinding>(R.layout.activity_bank_to_bank_two) {
  private val viewModel: BankToBankTwoVM by viewModels<BankToBankTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.bankToBankTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnContinue.setOnClickListener {
      val destIntent = BankToBankThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "BANK_TO_BANK_TWO_ACTIVITY"

  }
}
