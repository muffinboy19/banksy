package com.banksy.app.modules.editprofile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.banksy.app.modules.editprofile.`data`.model.EditProfileModel
import com.banksy.app.network.models.fetchme.FetchMeResponse
import com.banksy.app.network.repository.NetworkRepository
import com.banksy.app.network.resources.Response
import kotlin.Boolean
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent
import org.koin.core.inject

class EditProfileVM : ViewModel(), KoinComponent {
  val editProfileModel: MutableLiveData<EditProfileModel> = MutableLiveData(EditProfileModel())


  var navArguments: Bundle? = null


  val progressLiveData: MutableLiveData<Boolean> = MutableLiveData<Boolean>()

  private val networkRepository: NetworkRepository by inject()

  val fetchMeLiveData: MutableLiveData<Response<FetchMeResponse>> =
      MutableLiveData<Response<FetchMeResponse>>()

  fun callFetchMeApi() {
    viewModelScope.launch {
      progressLiveData.postValue(true)
      fetchMeLiveData.postValue(
      networkRepository.fetchMe()
      )
      progressLiveData.postValue(false)
    }
  }

  fun bindFetchMeResponse(response: FetchMeResponse) {
    val editProfileModelValue = editProfileModel.value ?:EditProfileModel()
    editProfileModelValue.etPhoneValue = response.data?.username.toString()
    editProfileModelValue.etEmailValue = response.data?.email.toString()
    editProfileModelValue.etNameValue = response.data?.name.toString()
    editProfileModel.value = editProfileModelValue
  }
}
