package com.raihansapplication.app.modules.appnavigation.`data`.model

import com.raihansapplication.app.R
import com.raihansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBaganLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_bagan_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDashboard: String? = MyApp.getInstance().resources.getString(R.string.lbl_dashboard)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtListPegawai: String? = MyApp.getInstance().resources.getString(R.string.lbl_list_pegawai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDetailPegawaiOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_detail_pegawai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDetailPegawai: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_detail_pegawai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDataPasangan: String? = MyApp.getInstance().resources.getString(R.string.lbl_data_pasangan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDetailDivisi: String? = MyApp.getInstance().resources.getString(R.string.lbl_detail_divisi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDetailProject: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_detail_project)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtListDivisi: String? = MyApp.getInstance().resources.getString(R.string.lbl_list_divisi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtListProject: String? = MyApp.getInstance().resources.getString(R.string.lbl_list_project)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDataAnak: String? = MyApp.getInstance().resources.getString(R.string.lbl_data_anak)

)
