package com.banksy.app.modules.home.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.banksy.app.modules.home.`data`.model.HomeModel
import com.banksy.app.modules.home.`data`.model.OptionsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomeVM : ViewModel(), KoinComponent {
  val homeModel: MutableLiveData<HomeModel> = MutableLiveData(HomeModel())

  var navArguments: Bundle? = null

  val optionsList: MutableLiveData<MutableList<OptionsRowModel>> = MutableLiveData(mutableListOf())
}
