package com.banksy.app.modules.receivemoneyrequesttabcontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.banksy.app.modules.receivemoneyrequesttabcontainer.`data`.model.ReceiveMoneyRequestTabContainerModel
import org.koin.core.KoinComponent

class ReceiveMoneyRequestTabContainerVM : ViewModel(), KoinComponent {
  val receiveMoneyRequestTabContainerModel: MutableLiveData<ReceiveMoneyRequestTabContainerModel> =
      MutableLiveData(ReceiveMoneyRequestTabContainerModel())

  var navArguments: Bundle? = null
}
