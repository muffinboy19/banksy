package com.banksy.app.modules.banktobankone.`data`.model

import com.banksy.app.R
import com.banksy.app.appcomponents.di.MyApp
import kotlin.String

data class BankToBankOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBanktobank: String? = MyApp.getInstance().resources.getString(R.string.lbl_bank_to_bank2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectbanktosen: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_bank_to_send)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectaaccount: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_a_account)
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

)
