package com.banksy.app.modules.mobileprepaidtwo.`data`.model

import com.banksy.app.R
import com.banksy.app.appcomponents.di.MyApp
import kotlin.String

data class MobilePrepaidTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMobileprepaid: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_mobile_prepaid2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAdomshafi: String? = MyApp.getInstance().resources.getString(R.string.lbl_adom_shafi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwohundredfifty: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_01704889390)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEntertheammount: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_the_ammount)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterammountyou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_ammount_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etPriceValue: String? = null
)
