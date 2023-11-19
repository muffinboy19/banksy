package com.banksy.app.modules.banktobanktwo.`data`.model

import com.banksy.app.R
import com.banksy.app.appcomponents.di.MyApp
import kotlin.String

data class BankToBankTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBanktobank: String? = MyApp.getInstance().resources.getString(R.string.lbl_bank_to_bank2)
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
