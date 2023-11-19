package com.banksy.app.modules.addperson.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.banksy.app.modules.addperson.`data`.model.AddPersonModel
import org.koin.core.KoinComponent

class AddPersonVM : ViewModel(), KoinComponent {
  val addPersonModel: MutableLiveData<AddPersonModel> = MutableLiveData(AddPersonModel())

  var navArguments: Bundle? = null
}
