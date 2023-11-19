package com.banksy.app.modules.mobileprepaidthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.banksy.app.modules.mobileprepaidthree.`data`.model.MobilePrepaidThreeModel
import org.koin.core.KoinComponent

class MobilePrepaidThreeVM : ViewModel(), KoinComponent {
  val mobilePrepaidThreeModel: MutableLiveData<MobilePrepaidThreeModel> =
      MutableLiveData(MobilePrepaidThreeModel())

  var navArguments: Bundle? = null
}
