package com.banksy.app.modules.homecontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.banksy.app.R
import com.banksy.app.appcomponents.base.BaseActivity
import com.banksy.app.databinding.ActivityHomeContainerBinding
import com.banksy.app.extensions.loadFragment
import com.banksy.app.modules.activity.ui.ActivityActivity
import com.banksy.app.modules.cards.ui.CardsActivity
import com.banksy.app.modules.home.ui.HomeFragment
import com.banksy.app.modules.homecontainer.`data`.viewmodel.HomeContainerVM
import com.banksy.app.modules.profile.ui.ProfileActivity
import kotlin.String
import kotlin.Unit

class HomeContainerActivity :
    BaseActivity<ActivityHomeContainerBinding>(R.layout.activity_home_container) {
  private val viewModel: HomeContainerVM by viewModels<HomeContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeContainerVM = viewModel
    val destFragment = HomeFragment.getInstance(null)
    this.loadFragment(
        R.id.fragmentContainer,
        destFragment,
        bundle = destFragment.arguments, 
        tag = HomeFragment.TAG, 
        addToBackStack = false, 
        add = false, 
        enter = null, 
        exit = null, 
        )
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnprofile.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnactivity.setOnClickListener {
      val destIntent = ActivityActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumncardOne.setOnClickListener {
      val destIntent = CardsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnhomeOne.setOnClickListener {
      val destFragment = HomeFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = HomeFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
  }

  companion object {
    const val TAG: String = "HOME_CONTAINER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeContainerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
