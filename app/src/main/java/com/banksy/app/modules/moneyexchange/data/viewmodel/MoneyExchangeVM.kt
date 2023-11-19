package com.banksy.app.modules.moneyexchange.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.banksy.app.modules.moneyexchange.`data`.model.MoneyExchangeModel
import org.koin.core.KoinComponent

class MoneyExchangeVM : ViewModel(), KoinComponent {
  val moneyExchangeModel: MutableLiveData<MoneyExchangeModel> =
      MutableLiveData(MoneyExchangeModel())

  var navArguments: Bundle? = null
}
