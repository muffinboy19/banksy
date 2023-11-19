package com.banksy.app.modules.mobileprepaidone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.banksy.app.modules.mobileprepaidone.`data`.model.MobilePrepaidOneModel
import com.banksy.app.modules.mobileprepaidone.`data`.model.Profile1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MobilePrepaidOneVM : ViewModel(), KoinComponent {
  val mobilePrepaidOneModel: MutableLiveData<MobilePrepaidOneModel> =
      MutableLiveData(MobilePrepaidOneModel())

  var navArguments: Bundle? = null

  val profileList: MutableLiveData<MutableList<Profile1RowModel>> = MutableLiveData(mutableListOf())
}
