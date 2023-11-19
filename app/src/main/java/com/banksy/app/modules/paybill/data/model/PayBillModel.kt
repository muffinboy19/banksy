package com.banksy.app.modules.paybill.`data`.model

import com.banksy.app.R
import com.banksy.app.appcomponents.di.MyApp
import kotlin.String

data class PayBillModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPaybill: String? = MyApp.getInstance().resources.getString(R.string.lbl_pay_bill)

)
