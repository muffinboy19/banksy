package com.banksy.app.modules.entermoney.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.banksy.app.modules.entermoney.`data`.model.EnterMoneyModel
import org.koin.core.KoinComponent

class EnterMoneyVM : ViewModel(), KoinComponent {
  val enterMoneyModel: MutableLiveData<EnterMoneyModel> = MutableLiveData(EnterMoneyModel())

  var navArguments: Bundle? = null
}
