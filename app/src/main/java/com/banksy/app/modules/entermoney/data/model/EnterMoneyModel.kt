package com.banksy.app.modules.entermoney.`data`.model

import com.banksy.app.R
import com.banksy.app.appcomponents.di.MyApp
import kotlin.String

data class EnterMoneyModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMoneytransfer: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_money_transfer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKatemorgan: String? = MyApp.getInstance().resources.getString(R.string.lbl_kate_morgan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOnehundredthirt: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_159_107_1365)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_60_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectcard: String? = MyApp.getInstance().resources.getString(R.string.lbl_select_card)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddcard: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_card)
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
  var txtPrice1: String? = MyApp.getInstance().resources.getString(R.string.lbl_31_250)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJonathan1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_jonathan_anderson)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_1222_3443_0881_1222)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBalanceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_balance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice2: String? = MyApp.getInstance().resources.getString(R.string.lbl_31_250)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etMassageboxOneValue: String? = null
)
