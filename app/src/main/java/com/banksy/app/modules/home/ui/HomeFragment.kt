package com.banksy.app.modules.home.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.banksy.app.R
import com.banksy.app.appcomponents.base.BaseFragment
import com.banksy.app.databinding.FragmentHomeBinding
import com.banksy.app.modules.banktobankone.ui.BankToBankOneActivity
import com.banksy.app.modules.home.`data`.model.OptionsRowModel
import com.banksy.app.modules.home.`data`.viewmodel.HomeVM
import com.banksy.app.modules.mobileprepaidone.ui.MobilePrepaidOneActivity
import com.banksy.app.modules.moneyexchange.ui.MoneyExchangeActivity
import com.banksy.app.modules.paybill.ui.PayBillActivity
import com.banksy.app.modules.sendmoney.ui.SendMoneyActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {
  private val viewModel: HomeVM by viewModels<HomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val optionsAdapter = OptionsAdapter(viewModel.optionsList.value?:mutableListOf())
    binding.recyclerOptions.adapter = optionsAdapter
    optionsAdapter.setOnItemClickListener(
    object : OptionsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : OptionsRowModel) {
        onClickRecyclerOptions(view, position, item)
      }
    }
    )
    viewModel.optionsList.observe(requireActivity()) {
      optionsAdapter.updateData(it)
    }
    binding.homeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerOptions(
    view: View,
    position: Int,
    item: OptionsRowModel
  ): Unit {
    when(view.id) {
      R.id.linearOne -> {
        onClickRecyclerOptionsLinearOne(view, position, item)
      }
    }
  }

  fun onClickRecyclerOptionsLinearOne(
    view: View,
    position: Int,
    item: OptionsRowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = MobilePrepaidOneActivity.getIntent(requireActivity(), null)
        startActivity(destIntent)
        requireActivity().onBackPressed()
      }
      1 -> {
        val destIntent = MoneyExchangeActivity.getIntent(requireActivity(), null)
        startActivity(destIntent)
        requireActivity().onBackPressed()
      }
      2 -> {
        val destIntent = SendMoneyActivity.getIntent(requireActivity(), null)
        startActivity(destIntent)
        requireActivity().onBackPressed()
      }
      3 -> {
        val destIntent = PayBillActivity.getIntent(requireActivity(), null)
        startActivity(destIntent)
        requireActivity().onBackPressed()
      }
      4 -> {
        val destIntent = BankToBankOneActivity.getIntent(requireActivity(), null)
        startActivity(destIntent)
        requireActivity().onBackPressed()
      }
    }
  }

  companion object {
    const val TAG: String = "HOME_FRAGMENT"


    fun getInstance(bundle: Bundle?): HomeFragment {
      val fragment = HomeFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
