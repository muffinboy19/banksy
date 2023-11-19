package com.banksy.app.modules.homecontainer.`data`.model

import com.banksy.app.R
import com.banksy.app.appcomponents.di.MyApp
import kotlin.String

data class HomeContainerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_card)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtActivityTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_activity)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfileTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
