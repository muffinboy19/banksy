package com.banksy.app.modules.receivemoneyrequesttabcontainer.ui

import androidx.activity.viewModels
import com.banksy.app.R
import com.banksy.app.appcomponents.base.BaseActivity
import com.banksy.app.databinding.ActivityReceiveMoneyRequestTabContainerBinding
import com.banksy.app.modules.receivemoneyrequesttabcontainer.`data`.viewmodel.ReceiveMoneyRequestTabContainerVM
import com.google.android.material.tabs.TabLayoutMediator
import kotlin.String
import kotlin.Unit

class ReceiveMoneyRequestTabContainerActivity :
    BaseActivity<ActivityReceiveMoneyRequestTabContainerBinding>(R.layout.activity_receive_money_request_tab_container)
    {
  private val viewModel: ReceiveMoneyRequestTabContainerVM by
      viewModels<ReceiveMoneyRequestTabContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.receiveMoneyRequestTabContainerVM = viewModel
    val adapter =
    ReceiveMoneyRequestTabContainerActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerTabbarview.adapter = adapter
    TabLayoutMediator(binding.tabLayoutTabview,binding.viewPagerTabbarview) { tab, position ->
      tab.text = ReceiveMoneyRequestTabContainerActivityPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "RECEIVE_MONEY_REQUEST_TAB_CONTAINER_ACTIVITY"

    }
  }
