package com.banksy.app.modules.paymentsuccess.`data`.model

import com.banksy.app.R
import com.banksy.app.appcomponents.di.MyApp
import kotlin.String

data class PaymentSuccessModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCongratsorder: String? =
      MyApp.getInstance().resources.getString(R.string.msg_payment_sent_successfully)

)
