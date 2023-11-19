package com.banksy.app.modules.moneyexchange.`data`.model

import com.banksy.app.R
import com.banksy.app.appcomponents.di.MyApp
import kotlin.String

data class MoneyExchangeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMoneyexchange: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_money_exchange2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrom: String? = MyApp.getInstance().resources.getString(R.string.lbl_from)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTo: String? = MyApp.getInstance().resources.getString(R.string.lbl_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExchangerate: String? = MyApp.getInstance().resources.getString(R.string.lbl_exchange_rate)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUsa: String? = MyApp.getInstance().resources.getString(R.string.lbl_usa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.lbl_country)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_usd)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCr: String? = MyApp.getInstance().resources.getString(R.string.lbl_cr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVietnamese: String? = MyApp.getInstance().resources.getString(R.string.lbl_vietnamese)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOnethousandfour: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOnethousandseve: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_746)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVietnameseOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_england)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOnethousandfour1: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOnethousandseve1: String? = MyApp.getInstance().resources.getString(R.string.lbl_34_56)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVietnameseTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_france)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOnethousandfour2: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOnethousandseve2: String? = MyApp.getInstance().resources.getString(R.string.lbl_12_09)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVietnamese1: String? = MyApp.getInstance().resources.getString(R.string.lbl_afghanistan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOnethousandfour3: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOnethousandseve3: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_746)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVietnameseFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_japan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOnethousandfour4: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOnethousandseve4: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_234)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVietnameseFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_korea)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOnethousandfour5: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOnethousandseve5: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_746)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVietnameseSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_china)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOnethousandfour6: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOnethousandseve6: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_746)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etPriceValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPrice1Value: String? = null
)
