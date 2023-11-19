package com.banksy.app.modules.paymentsuccess.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.banksy.app.modules.paymentsuccess.`data`.model.PaymentSuccessModel
import org.koin.core.KoinComponent

class PaymentSuccessVM : ViewModel(), KoinComponent {
  val paymentSuccessModel: MutableLiveData<PaymentSuccessModel> =
      MutableLiveData(PaymentSuccessModel())

  var navArguments: Bundle? = null
}
