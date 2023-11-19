package com.banksy.app.modules.carddetails.`data`.model

import com.banksy.app.R
import com.banksy.app.appcomponents.di.MyApp
import kotlin.String

data class CardDetailsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCarddetails: String? = MyApp.getInstance().resources.getString(R.string.lbl_card_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJonathan: String? = MyApp.getInstance().resources.getString(R.string.msg_jonathan_anderson)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.msg_1222_3443_9881_1222)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBalance: String? = MyApp.getInstance().resources.getString(R.string.lbl_balance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_31_250)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtToday: String? = MyApp.getInstance().resources.getString(R.string.lbl_today)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJanCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_25_jan)

)
