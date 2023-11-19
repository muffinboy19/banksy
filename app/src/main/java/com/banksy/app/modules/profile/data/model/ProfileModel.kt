package com.banksy.app.modules.profile.`data`.model

import com.banksy.app.R
import com.banksy.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSuzanejobs: String? = MyApp.getInstance().resources.getString(R.string.lbl_suzane_jobs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_user_gmail_com)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPasswordOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_touch_id)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPasswordTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_languages)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPasswordThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_information)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPasswordFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_support)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMobileNo: String? = MyApp.getInstance().resources.getString(R.string.lbl_5156446981)
  ,
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
  var txtProfileThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
