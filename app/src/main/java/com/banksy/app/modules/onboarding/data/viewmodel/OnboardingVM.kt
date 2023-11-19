package com.banksy.app.modules.onboarding.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.banksy.app.modules.onboarding.`data`.model.OnboardingModel
import org.koin.core.KoinComponent

class OnboardingVM : ViewModel(), KoinComponent {
  val onboardingModel: MutableLiveData<OnboardingModel> = MutableLiveData(OnboardingModel())

  var navArguments: Bundle? = null
}
