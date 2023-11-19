package com.banksy.app.modules.receivemoneypersonal.ui

import androidx.fragment.app.viewModels
import com.banksy.app.R
import com.banksy.app.appcomponents.base.BaseFragment
import com.banksy.app.databinding.FragmentReceiveMoneyPersonalBinding
import com.banksy.app.modules.receivemoneypersonal.`data`.viewmodel.ReceiveMoneyPersonalVM
import com.banksy.app.modules.requestsent.ui.RequestSentActivity
import kotlin.String
import kotlin.Unit

class ReceiveMoneyPersonalFragment :
    BaseFragment<FragmentReceiveMoneyPersonalBinding>(R.layout.fragment_receive_money_personal) {
  private val viewModel: ReceiveMoneyPersonalVM by viewModels<ReceiveMoneyPersonalVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.receiveMoneyPersonalVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSend.setOnClickListener {
      val destIntent = RequestSentActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "RECEIVE_MONEY_PERSONAL_FRAGMENT"

  }
}
