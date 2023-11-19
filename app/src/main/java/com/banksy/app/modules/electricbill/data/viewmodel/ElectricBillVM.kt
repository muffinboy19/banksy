package com.banksy.app.modules.electricbill.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.banksy.app.modules.electricbill.`data`.model.ElectricBillModel
import org.koin.core.KoinComponent

class ElectricBillVM : ViewModel(), KoinComponent {
  val electricBillModel: MutableLiveData<ElectricBillModel> = MutableLiveData(ElectricBillModel())

  var navArguments: Bundle? = null
}
