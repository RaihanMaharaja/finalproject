package com.raihansapplication.app.modules.listdivisi.`data`.model

import com.raihansapplication.app.R
import com.raihansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListDivisiRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_marketing)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPegawaiCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_pegawai)

)
