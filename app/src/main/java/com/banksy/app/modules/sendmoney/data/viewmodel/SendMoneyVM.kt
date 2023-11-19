package com.banksy.app.modules.sendmoney.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.banksy.app.modules.sendmoney.`data`.model.ProfileRowModel
import com.banksy.app.modules.sendmoney.`data`.model.SendMoneyModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SendMoneyVM : ViewModel(), KoinComponent {
  val sendMoneyModel: MutableLiveData<SendMoneyModel> = MutableLiveData(SendMoneyModel())

  var navArguments: Bundle? = null

  val profileList: MutableLiveData<MutableList<ProfileRowModel>> = MutableLiveData(mutableListOf())
}
