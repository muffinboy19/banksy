package com.banksy.app.modules.receivemoneyrequest.ui

import androidx.fragment.app.viewModels
import com.banksy.app.R
import com.banksy.app.appcomponents.base.BaseFragment
import com.banksy.app.databinding.FragmentReceiveMoneyRequestBinding
import com.banksy.app.modules.receivemoneyrequest.`data`.viewmodel.ReceiveMoneyRequestVM
import com.banksy.app.modules.requestsent.ui.RequestSentActivity
import kotlin.String
import kotlin.Unit

class ReceiveMoneyRequestFragment :
    BaseFragment<FragmentReceiveMoneyRequestBinding>(R.layout.fragment_receive_money_request) {
  private val viewModel: ReceiveMoneyRequestVM by viewModels<ReceiveMoneyRequestVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.receiveMoneyRequestVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSend.setOnClickListener {
      val destIntent = RequestSentActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "RECEIVE_MONEY_REQUEST_FRAGMENT"

  }
}
