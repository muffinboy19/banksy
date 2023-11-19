package com.banksy.app.modules.banktobankone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.banksy.app.modules.banktobankone.`data`.model.BankToBankOneModel
import org.koin.core.KoinComponent

class BankToBankOneVM : ViewModel(), KoinComponent {
  val bankToBankOneModel: MutableLiveData<BankToBankOneModel> =
      MutableLiveData(BankToBankOneModel())

  var navArguments: Bundle? = null
}
