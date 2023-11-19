package com.banksy.app.modules.history.`data`.model

import com.banksy.app.R
import com.banksy.app.appcomponents.di.MyApp
import kotlin.String

data class HistoryRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOctober: String? = MyApp.getInstance().resources.getString(R.string.lbl_october)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_30_10_2020)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAmount: String? = MyApp.getInstance().resources.getString(R.string.lbl_amount)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_480)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUnpaid: String? = MyApp.getInstance().resources.getString(R.string.lbl_paid)

)
