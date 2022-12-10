package com.raihansapplication.app.modules.datapasangan.`data`.model

import com.raihansapplication.app.R
import com.raihansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DataPasanganModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRightButton: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPageTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_data_pasangan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_nama_pasangan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.lbl_alice)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_no_telp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_0882_3221_2343)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_status_pasangan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_bekerja)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_anak)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_andre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTabName: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)

)
