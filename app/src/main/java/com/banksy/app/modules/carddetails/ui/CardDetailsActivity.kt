package com.banksy.app.modules.carddetails.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.banksy.app.R
import com.banksy.app.appcomponents.base.BaseActivity
import com.banksy.app.databinding.ActivityCardDetailsBinding
import com.banksy.app.modules.carddetails.`data`.model.DetailsRowModel
import com.banksy.app.modules.carddetails.`data`.viewmodel.CardDetailsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CardDetailsActivity : BaseActivity<ActivityCardDetailsBinding>(R.layout.activity_card_details)
    {
  private val viewModel: CardDetailsVM by viewModels<CardDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val cardDetailsAdapter =
    CardDetailsAdapter(viewModel.cardDetailsList.value?:mutableListOf())
    binding.recyclerCardDetails.adapter = cardDetailsAdapter
    cardDetailsAdapter.setOnItemClickListener(
    object : CardDetailsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DetailsRowModel) {
        onClickRecyclerCardDetails(view, position, item)
      }
    }
    )
    viewModel.cardDetailsList.observe(this) {
      cardDetailsAdapter.updateData(it)
    }
    binding.cardDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerCardDetails(
    view: View,
    position: Int,
    item: DetailsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CARD_DETAILS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CardDetailsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
