package com.banksy.app.modules.cards.`data`.model

import com.banksy.app.R
import com.banksy.app.appcomponents.di.MyApp
import kotlin.String

data class CardsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtYourcards: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_cards)
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
  var txtPrice1: String? = MyApp.getInstance().resources.getString(R.string.lbl_31_250)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_card)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtActivityTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_activity)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfileTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
