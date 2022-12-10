package com.raihansapplication.app.modules.detailpegawaione.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.raihansapplication.app.R
import com.raihansapplication.app.appcomponents.base.BaseActivity
import com.raihansapplication.app.databinding.ActivityDetailPegawaiOneBinding
import com.raihansapplication.app.modules.dashboard.ui.DashboardActivity
import com.raihansapplication.app.modules.datapasangan.ui.DataPasanganActivity
import com.raihansapplication.app.modules.detaildivisi.ui.DetailDivisiActivity
import com.raihansapplication.app.modules.detailpegawaione.`data`.viewmodel.DetailPegawaiOneVM
import kotlin.String
import kotlin.Unit

class DetailPegawaiOneActivity :
    BaseActivity<ActivityDetailPegawaiOneBinding>(R.layout.activity_detail_pegawai_one) {
  private val viewModel: DetailPegawaiOneVM by viewModels<DetailPegawaiOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.detailPegawaiOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearListItem1.setOnClickListener {
      val destIntent = DataPasanganActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearHomeButton.setOnClickListener {
      val destIntent = DashboardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearListItem.setOnClickListener {
      val destIntent = DetailDivisiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "DETAIL_PEGAWAI_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DetailPegawaiOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
