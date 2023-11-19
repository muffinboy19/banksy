package com.banksy.app.modules.moneysentsuccess.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.banksy.app.modules.moneysentsuccess.`data`.model.MoneySentSuccessModel
import org.koin.core.KoinComponent

class MoneySentSuccessVM : ViewModel(), KoinComponent {
  val moneySentSuccessModel: MutableLiveData<MoneySentSuccessModel> =
      MutableLiveData(MoneySentSuccessModel())

  var navArguments: Bundle? = null
}
