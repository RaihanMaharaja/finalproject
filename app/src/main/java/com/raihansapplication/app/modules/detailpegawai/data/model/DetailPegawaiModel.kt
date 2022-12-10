package com.raihansapplication.app.modules.detailpegawai.`data`.model

import com.raihansapplication.app.R
import com.raihansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DetailPegawaiModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRightButton: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPageTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_detail_pegawai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNamaPegawai: String? = MyApp.getInstance().resources.getString(R.string.lbl_nama_pegawai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHaleyJames: String? = MyApp.getInstance().resources.getString(R.string.lbl_haley_james)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_tanggal_lahir)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_04_januari_1990)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_tanggal_masuk)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_04_maret_2022)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_no_telp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_0882_3221_2343)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_divisi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_marketing)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_pasangan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_alice)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_status)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_aktif)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTabName: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)

)
