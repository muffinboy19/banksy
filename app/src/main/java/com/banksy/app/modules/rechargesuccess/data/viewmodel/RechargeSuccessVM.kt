package com.banksy.app.modules.rechargesuccess.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.banksy.app.modules.rechargesuccess.`data`.model.RechargeSuccessModel
import org.koin.core.KoinComponent

class RechargeSuccessVM : ViewModel(), KoinComponent {
  val rechargeSuccessModel: MutableLiveData<RechargeSuccessModel> =
      MutableLiveData(RechargeSuccessModel())

  var navArguments: Bundle? = null
}
