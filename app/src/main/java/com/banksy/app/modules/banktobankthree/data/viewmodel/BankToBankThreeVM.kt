package com.banksy.app.modules.banktobankthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.banksy.app.modules.banktobankthree.`data`.model.BankToBankThreeModel
import org.koin.core.KoinComponent

class BankToBankThreeVM : ViewModel(), KoinComponent {
  val bankToBankThreeModel: MutableLiveData<BankToBankThreeModel> =
      MutableLiveData(BankToBankThreeModel())

  var navArguments: Bundle? = null
}
