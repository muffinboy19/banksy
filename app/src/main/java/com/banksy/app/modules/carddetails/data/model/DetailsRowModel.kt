package com.banksy.app.modules.carddetails.`data`.model

import com.banksy.app.R
import com.banksy.app.appcomponents.di.MyApp
import kotlin.String

data class DetailsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtShopping: String? = MyApp.getInstance().resources.getString(R.string.lbl_shopping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_41_pm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_50_35)

)
