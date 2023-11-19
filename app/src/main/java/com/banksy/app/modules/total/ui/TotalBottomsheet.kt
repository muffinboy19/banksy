package com.banksy.app.modules.total.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.banksy.app.R
import com.banksy.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.banksy.app.databinding.BottomsheetTotalBinding
import com.banksy.app.modules.total.`data`.viewmodel.TotalVM
import kotlin.String
import kotlin.Unit

class TotalBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetTotalBinding>(R.layout.bottomsheet_total) {
  private val viewModel: TotalVM by viewModels<TotalVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.totalVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TOTAL_BOTTOMSHEET"


    fun getInstance(bundle: Bundle?): TotalBottomsheet {
      val fragment = TotalBottomsheet()
      fragment.arguments = bundle
      return fragment
    }
  }
}
