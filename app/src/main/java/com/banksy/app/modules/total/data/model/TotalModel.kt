package com.banksy.app.modules.total.`data`.model

import com.banksy.app.R
import com.banksy.app.appcomponents.di.MyApp
import kotlin.String

data class TotalModel(
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
  var txtTotal: String? = MyApp.getInstance().resources.getString(R.string.lbl_total)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_60_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVat: String? = MyApp.getInstance().resources.getString(R.string.lbl_vat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice1: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardnewbalance: String? =
      MyApp.getInstance().resources.getString(R.string.msg_card_new_balance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice2: String? = MyApp.getInstance().resources.getString(R.string.lbl_1168_25)

)
