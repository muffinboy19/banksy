package com.banksy.app.modules.banktobankthree.`data`.model

import com.banksy.app.R
import com.banksy.app.appcomponents.di.MyApp
import kotlin.String

data class BankToBankThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBanktobank: String? = MyApp.getInstance().resources.getString(R.string.lbl_bank_to_bank2)
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
