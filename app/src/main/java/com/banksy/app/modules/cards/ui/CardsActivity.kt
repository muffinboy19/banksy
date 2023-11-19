package com.banksy.app.modules.cards.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.banksy.app.R
import com.banksy.app.appcomponents.base.BaseActivity
import com.banksy.app.databinding.ActivityCardsBinding
import com.banksy.app.modules.addcardone.ui.AddCardOneActivity
import com.banksy.app.modules.carddetails.ui.CardDetailsActivity
import com.banksy.app.modules.cards.`data`.viewmodel.CardsVM
import kotlin.String
import kotlin.Unit

class CardsActivity : BaseActivity<ActivityCardsBinding>(R.layout.activity_cards) {
  private val viewModel: CardsVM by viewModels<CardsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.cardsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnPlusOne.setOnClickListener {
      val destIntent = AddCardOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearWalletmastercar.setOnClickListener {
      val destIntent = CardDetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CARDS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CardsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
