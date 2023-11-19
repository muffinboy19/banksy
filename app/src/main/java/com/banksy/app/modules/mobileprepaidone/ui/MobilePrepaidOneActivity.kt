package com.banksy.app.modules.mobileprepaidone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.banksy.app.R
import com.banksy.app.appcomponents.base.BaseActivity
import com.banksy.app.databinding.ActivityMobilePrepaidOneBinding
import com.banksy.app.modules.entermoney.ui.EnterMoneyActivity
import com.banksy.app.modules.mobileprepaidone.`data`.model.Profile1RowModel
import com.banksy.app.modules.mobileprepaidone.`data`.viewmodel.MobilePrepaidOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MobilePrepaidOneActivity :
    BaseActivity<ActivityMobilePrepaidOneBinding>(R.layout.activity_mobile_prepaid_one) {
  private val viewModel: MobilePrepaidOneVM by viewModels<MobilePrepaidOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val profileAdapter = ProfileAdapter(viewModel.profileList.value?:mutableListOf())
    binding.recyclerProfile.adapter = profileAdapter
    profileAdapter.setOnItemClickListener(
    object : ProfileAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Profile1RowModel) {
        onClickRecyclerProfile(view, position, item)
      }
    }
    )
    viewModel.profileList.observe(this) {
      profileAdapter.updateData(it)
    }
    binding.mobilePrepaidOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowovalOne.setOnClickListener {
      val destIntent = EnterMoneyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerProfile(
    view: View,
    position: Int,
    item: Profile1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MOBILE_PREPAID_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MobilePrepaidOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
