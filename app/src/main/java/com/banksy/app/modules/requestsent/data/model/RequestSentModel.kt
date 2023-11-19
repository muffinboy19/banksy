package com.banksy.app.modules.requestsent.`data`.model

import com.banksy.app.R
import com.banksy.app.appcomponents.di.MyApp
import kotlin.String

data class RequestSentModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCongratsorder: String? =
      MyApp.getInstance().resources.getString(R.string.msg_request_sent_successfully)

)
