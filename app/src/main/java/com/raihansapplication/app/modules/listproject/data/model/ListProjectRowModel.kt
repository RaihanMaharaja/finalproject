package com.raihansapplication.app.modules.listproject.`data`.model

import com.raihansapplication.app.R
import com.raihansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListProjectRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_service_desk)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPegawaiCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_pegawai)

)
