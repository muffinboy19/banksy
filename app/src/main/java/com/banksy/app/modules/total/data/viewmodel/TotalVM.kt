package com.banksy.app.modules.total.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.banksy.app.modules.total.`data`.model.TotalModel
import org.koin.core.KoinComponent

class TotalVM : ViewModel(), KoinComponent {
  val totalModel: MutableLiveData<TotalModel> = MutableLiveData(TotalModel())

  var navArguments: Bundle? = null
}
