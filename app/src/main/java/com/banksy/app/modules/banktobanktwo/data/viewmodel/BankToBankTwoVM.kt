package com.banksy.app.modules.banktobanktwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.banksy.app.modules.banktobanktwo.`data`.model.BankToBankTwoModel
import org.koin.core.KoinComponent

class BankToBankTwoVM : ViewModel(), KoinComponent {
  val bankToBankTwoModel: MutableLiveData<BankToBankTwoModel> =
      MutableLiveData(BankToBankTwoModel())

  var navArguments: Bundle? = null
}
