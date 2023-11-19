package com.banksy.app.modules.bilpaymentsuccess.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.banksy.app.modules.bilpaymentsuccess.`data`.model.BilPaymentSuccessModel
import org.koin.core.KoinComponent

class BilPaymentSuccessVM : ViewModel(), KoinComponent {
  val bilPaymentSuccessModel: MutableLiveData<BilPaymentSuccessModel> =
      MutableLiveData(BilPaymentSuccessModel())

  var navArguments: Bundle? = null
}
