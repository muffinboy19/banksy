package com.banksy.app.modules.receivemoneyrequest.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.banksy.app.modules.receivemoneyrequest.`data`.model.ReceiveMoneyRequestModel
import org.koin.core.KoinComponent

class ReceiveMoneyRequestVM : ViewModel(), KoinComponent {
  val receiveMoneyRequestModel: MutableLiveData<ReceiveMoneyRequestModel> =
      MutableLiveData(ReceiveMoneyRequestModel())

  var navArguments: Bundle? = null
}
