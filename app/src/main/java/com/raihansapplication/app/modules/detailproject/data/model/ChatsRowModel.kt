package com.raihansapplication.app.modules.detailproject.`data`.model

import com.raihansapplication.app.R
import com.raihansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ChatsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_haley_james)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_marketing)

)
