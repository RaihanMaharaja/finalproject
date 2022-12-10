package com.raihansapplication.app.modules.dataanak.`data`.model

import com.raihansapplication.app.R
import com.raihansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DataAnakModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRightButton: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPageTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_data_anak)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_nama_anak)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.lbl_andre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_keterangan_anak)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_anak_ke_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_status_anak)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_pelajar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTabName: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)

)
