package com.banksy.app.modules.history.`data`.model

import com.banksy.app.R
import com.banksy.app.appcomponents.di.MyApp
import kotlin.String

data class HistoryModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHistory: String? = MyApp.getInstance().resources.getString(R.string.lbl_history)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtElectricbill: String? = MyApp.getInstance().resources.getString(R.string.lbl_electric_bill)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlltime: String? = MyApp.getInstance().resources.getString(R.string.lbl_all_time)

)
