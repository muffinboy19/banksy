package com.banksy.app.modules.signup.`data`.model

import com.banksy.app.R
import com.banksy.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPhoneoremail: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_phone_or_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSetpassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_set_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmpassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_confirm_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHaveaccount: String? = MyApp.getInstance().resources.getString(R.string.lbl_have_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignin: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etPhoneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etConfirmpasswordValue: String? = null
)
