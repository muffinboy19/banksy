package com.banksy.app.modules.addcardone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.banksy.app.modules.addcardone.`data`.model.AddCardOneModel
import org.koin.core.KoinComponent

class AddCardOneVM : ViewModel(), KoinComponent {
  val addCardOneModel: MutableLiveData<AddCardOneModel> = MutableLiveData(AddCardOneModel())

  var navArguments: Bundle? = null
}
