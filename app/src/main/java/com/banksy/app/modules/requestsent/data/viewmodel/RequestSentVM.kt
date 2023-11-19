package com.banksy.app.modules.requestsent.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.banksy.app.modules.requestsent.`data`.model.RequestSentModel
import org.koin.core.KoinComponent

class RequestSentVM : ViewModel(), KoinComponent {
  val requestSentModel: MutableLiveData<RequestSentModel> = MutableLiveData(RequestSentModel())

  var navArguments: Bundle? = null
}
