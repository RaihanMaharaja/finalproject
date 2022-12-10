package com.raihansapplication.app.modules.dashboard.`data`.model

import com.raihansapplication.app.R
import com.raihansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DashboardModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSafirCorp: String? = MyApp.getInstance().resources.getString(R.string.lbl_safir_corp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDashboard: String? = MyApp.getInstance().resources.getString(R.string.lbl_dashboard)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPegawai: String? = MyApp.getInstance().resources.getString(R.string.lbl_pegawai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPegawaiCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_100_pegawai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDivisi: String? = MyApp.getInstance().resources.getString(R.string.lbl_divisi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDivisiCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_divisi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProject: String? = MyApp.getInstance().resources.getString(R.string.lbl_project)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProjectCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_project)

)
