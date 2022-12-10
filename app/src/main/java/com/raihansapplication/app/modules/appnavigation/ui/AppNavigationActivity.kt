package com.raihansapplication.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.raihansapplication.app.R
import com.raihansapplication.app.appcomponents.base.BaseActivity
import com.raihansapplication.app.databinding.ActivityAppNavigationBinding
import com.raihansapplication.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.raihansapplication.app.modules.baganlogin.ui.BaganLoginActivity
import com.raihansapplication.app.modules.dashboard.ui.DashboardActivity
import com.raihansapplication.app.modules.dataanak.ui.DataAnakActivity
import com.raihansapplication.app.modules.datapasangan.ui.DataPasanganActivity
import com.raihansapplication.app.modules.detaildivisi.ui.DetailDivisiActivity
import com.raihansapplication.app.modules.detailpegawai.ui.DetailPegawaiActivity
import com.raihansapplication.app.modules.detailpegawaione.ui.DetailPegawaiOneActivity
import com.raihansapplication.app.modules.detailproject.ui.DetailProjectActivity
import com.raihansapplication.app.modules.listdivisi.ui.ListDivisiActivity
import com.raihansapplication.app.modules.listpegawai.ui.ListPegawaiActivity
import com.raihansapplication.app.modules.listproject.ui.ListProjectActivity
import kotlin.String
import kotlin.Unit

class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearDataAnak.setOnClickListener {
      val destIntent = DataAnakActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearListPegawai.setOnClickListener {
      val destIntent = ListPegawaiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDetailPegawai.setOnClickListener {
      val destIntent = DetailPegawaiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearListProject.setOnClickListener {
      val destIntent = ListProjectActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDetailProject.setOnClickListener {
      val destIntent = DetailProjectActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearBaganLogin.setOnClickListener {
      val destIntent = BaganLoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDashboard.setOnClickListener {
      val destIntent = DashboardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearListDivisi.setOnClickListener {
      val destIntent = ListDivisiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDetailPegawaiOne.setOnClickListener {
      val destIntent = DetailPegawaiOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDetailDivisi.setOnClickListener {
      val destIntent = DetailDivisiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDataPasangan.setOnClickListener {
      val destIntent = DataPasanganActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "APP_NAVIGATION_ACTIVITY"

  }
}
