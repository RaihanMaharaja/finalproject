package com.raihansapplication.app.modules.listproject.`data`.model

import com.raihansapplication.app.R
import com.raihansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListProjectModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPageTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_project)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTabName: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)

)
