package com.banksy.app.modules.cards.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.banksy.app.modules.cards.`data`.model.CardsModel
import org.koin.core.KoinComponent

class CardsVM : ViewModel(), KoinComponent {
  val cardsModel: MutableLiveData<CardsModel> = MutableLiveData(CardsModel())

  var navArguments: Bundle? = null
}
