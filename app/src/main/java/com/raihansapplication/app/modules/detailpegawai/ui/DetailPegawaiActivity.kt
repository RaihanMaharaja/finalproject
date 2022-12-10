package com.raihansapplication.app.modules.detailpegawai.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.raihansapplication.app.R
import com.raihansapplication.app.appcomponents.base.BaseActivity
import com.raihansapplication.app.databinding.ActivityDetailPegawaiBinding
import com.raihansapplication.app.modules.dashboard.ui.DashboardActivity
import com.raihansapplication.app.modules.datapasangan.ui.DataPasanganActivity
import com.raihansapplication.app.modules.detailpegawai.`data`.viewmodel.DetailPegawaiVM
import kotlin.String
import kotlin.Unit

class DetailPegawaiActivity :
    BaseActivity<ActivityDetailPegawaiBinding>(R.layout.activity_detail_pegawai) {
  private val viewModel: DetailPegawaiVM by viewModels<DetailPegawaiVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.detailPegawaiVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearHomeButton.setOnClickListener {
      val destIntent = DashboardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearListItem.setOnClickListener {
      val destIntent = DataPasanganActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "DETAIL_PEGAWAI_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DetailPegawaiActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
