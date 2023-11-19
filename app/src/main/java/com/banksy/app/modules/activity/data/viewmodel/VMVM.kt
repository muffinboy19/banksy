package com.banksy.app.modules.activity.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.banksy.app.modules.activity.`data`.model.ModelModel
import org.koin.core.KoinComponent

class VMVM : ViewModel(), KoinComponent {
  val modelModel: MutableLiveData<ModelModel> = MutableLiveData(ModelModel())

  var navArguments: Bundle? = null
}
