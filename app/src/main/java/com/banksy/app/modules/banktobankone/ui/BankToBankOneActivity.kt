package com.banksy.app.modules.banktobankone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.banksy.app.R
import com.banksy.app.appcomponents.base.BaseActivity
import com.banksy.app.databinding.ActivityBankToBankOneBinding
import com.banksy.app.modules.banktobankone.`data`.viewmodel.BankToBankOneVM
import kotlin.String
import kotlin.Unit

class BankToBankOneActivity :
    BaseActivity<ActivityBankToBankOneBinding>(R.layout.activity_bank_to_bank_one) {
  private val viewModel: BankToBankOneVM by viewModels<BankToBankOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.bankToBankOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "BANK_TO_BANK_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BankToBankOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
