package com.banksy.app.modules.sendmoneyenterpassword.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.banksy.app.modules.sendmoneyenterpassword.`data`.model.SendMoneyEnterPasswordModel
import org.koin.core.KoinComponent

class SendMoneyEnterPasswordVM : ViewModel(), KoinComponent {
  val sendMoneyEnterPasswordModel: MutableLiveData<SendMoneyEnterPasswordModel> =
      MutableLiveData(SendMoneyEnterPasswordModel())

  var navArguments: Bundle? = null
}
