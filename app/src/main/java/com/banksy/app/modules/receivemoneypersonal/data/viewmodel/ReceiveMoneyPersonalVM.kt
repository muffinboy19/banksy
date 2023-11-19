package com.banksy.app.modules.receivemoneypersonal.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.banksy.app.modules.receivemoneypersonal.`data`.model.ReceiveMoneyPersonalModel
import org.koin.core.KoinComponent

class ReceiveMoneyPersonalVM : ViewModel(), KoinComponent {
  val receiveMoneyPersonalModel: MutableLiveData<ReceiveMoneyPersonalModel> =
      MutableLiveData(ReceiveMoneyPersonalModel())

  var navArguments: Bundle? = null
}
