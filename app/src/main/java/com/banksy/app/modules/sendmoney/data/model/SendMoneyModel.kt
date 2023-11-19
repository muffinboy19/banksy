package com.banksy.app.modules.sendmoney.`data`.model

import com.banksy.app.R
import com.banksy.app.appcomponents.di.MyApp
import kotlin.String

data class SendMoneyModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMoneytransfer: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_money_transfer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFavorite: String? = MyApp.getInstance().resources.getString(R.string.lbl_favorite)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAllcontact: String? = MyApp.getInstance().resources.getString(R.string.lbl_all_contact)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtA: String? = MyApp.getInstance().resources.getString(R.string.lbl_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJenningschampli: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_angelina_druff)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJenningschampli1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ac_159_107_1396)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJenningschampli2: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_angelina_lan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJenningschampli3: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ac_159_107_1396)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtB: String? = MyApp.getInstance().resources.getString(R.string.lbl_b)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJenningschampli4: String? = MyApp.getInstance().resources.getString(R.string.lbl_belgeman)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJenningschampli5: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ac_159_107_1396)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJenningschampli6: String? = MyApp.getInstance().resources.getString(R.string.lbl_brusly)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJenningschampli7: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ac_159_107_1396)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJenningschampli8: String? = MyApp.getInstance().resources.getString(R.string.lbl_baminu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJenningschampli9: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ac_159_107_1396)

)
