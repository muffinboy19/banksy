package com.banksy.app.modules.notifications.`data`.model

import com.banksy.app.R
import com.banksy.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNotifications: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notifications)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDiscountssales: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_money_receive)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBuythestuffyou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_if_anyone_sent_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDiscountssales1: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_card_activation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBuythestuffyou1: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_if_card_active)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDiscountssales2: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_update_feature)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBuythestuffyou2: String? =
      MyApp.getInstance().resources.getString(R.string.msg_if_any_new_update)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDiscountssales3: String? = MyApp.getInstance().resources.getString(R.string.lbl_cash_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBuythestuffyou3: String? =
      MyApp.getInstance().resources.getString(R.string.msg_if_any_cash_in_your)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDiscountssales4: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_money_request)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBuythestuffyou4: String? =
      MyApp.getInstance().resources.getString(R.string.msg_if_anyone_sent_you2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDiscountssales5: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_money_trasfer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBuythestuffyou5: String? =
      MyApp.getInstance().resources.getString(R.string.msg_if_you_sent_money)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDiscountssales6: String? =
      MyApp.getInstance().resources.getString(R.string.msg_number_notification)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBuythestuffyou6: String? =
      MyApp.getInstance().resources.getString(R.string.msg_send_notification)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDiscountssales7: String? =
      MyApp.getInstance().resources.getString(R.string.msg_email_notification)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBuythestuffyou7: String? =
      MyApp.getInstance().resources.getString(R.string.msg_send_notification2)

)
