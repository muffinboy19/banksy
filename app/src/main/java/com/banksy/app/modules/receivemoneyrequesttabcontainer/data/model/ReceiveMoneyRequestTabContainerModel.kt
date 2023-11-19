package com.banksy.app.modules.receivemoneyrequesttabcontainer.`data`.model

import com.banksy.app.R
import com.banksy.app.appcomponents.di.MyApp
import kotlin.String

data class ReceiveMoneyRequestTabContainerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMoneyrequest: String? = MyApp.getInstance().resources.getString(R.string.lbl_money_request)

)
