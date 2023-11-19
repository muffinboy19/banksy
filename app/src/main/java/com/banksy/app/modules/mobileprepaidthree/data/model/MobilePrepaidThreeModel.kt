package com.banksy.app.modules.mobileprepaidthree.`data`.model

import com.banksy.app.R
import com.banksy.app.appcomponents.di.MyApp
import kotlin.String

data class MobilePrepaidThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMobileprepaid: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_mobile_prepaid2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteryouraccoun: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_your_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteryoursend: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_your_send)

)
