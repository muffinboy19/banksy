package com.banksy.app.modules.mobileprepaidtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.banksy.app.modules.mobileprepaidtwo.`data`.model.MobilePrepaidTwoModel
import org.koin.core.KoinComponent

class MobilePrepaidTwoVM : ViewModel(), KoinComponent {
  val mobilePrepaidTwoModel: MutableLiveData<MobilePrepaidTwoModel> =
      MutableLiveData(MobilePrepaidTwoModel())

  var navArguments: Bundle? = null
}
