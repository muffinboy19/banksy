package com.banksy.app.modules.rechargesuccess.`data`.model

import com.banksy.app.R
import com.banksy.app.appcomponents.di.MyApp
import kotlin.String

data class RechargeSuccessModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCongratsorder: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recharge_done_successfully)

)
