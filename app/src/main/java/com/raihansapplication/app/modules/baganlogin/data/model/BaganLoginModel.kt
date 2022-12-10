package com.raihansapplication.app.modules.baganlogin.`data`.model

import com.raihansapplication.app.R
import com.raihansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BaganLoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSafirCorp: String? = MyApp.getInstance().resources.getString(R.string.lbl_safir_corp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_username)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPasswordOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)

)
