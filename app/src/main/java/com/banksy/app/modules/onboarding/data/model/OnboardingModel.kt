package com.banksy.app.modules.onboarding.`data`.model

import com.banksy.app.R
import com.banksy.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOnlinedigital: String? =
      MyApp.getInstance().resources.getString(R.string.msg_online_digital)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBanking: String? = MyApp.getInstance().resources.getString(R.string.lbl_banking)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWehelpouruser: String? =
      MyApp.getInstance().resources.getString(R.string.msg_we_help_our_user)

)
