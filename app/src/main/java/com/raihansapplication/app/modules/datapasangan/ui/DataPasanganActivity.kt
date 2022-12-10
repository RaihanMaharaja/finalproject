package com.raihansapplication.app.modules.datapasangan.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.raihansapplication.app.R
import com.raihansapplication.app.appcomponents.base.BaseActivity
import com.raihansapplication.app.databinding.ActivityDataPasanganBinding
import com.raihansapplication.app.modules.dashboard.ui.DashboardActivity
import com.raihansapplication.app.modules.dataanak.ui.DataAnakActivity
import com.raihansapplication.app.modules.datapasangan.`data`.viewmodel.DataPasanganVM
import kotlin.String
import kotlin.Unit

class DataPasanganActivity :
    BaseActivity<ActivityDataPasanganBinding>(R.layout.activity_data_pasangan) {
  private val viewModel: DataPasanganVM by viewModels<DataPasanganVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.dataPasanganVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearListItem.setOnClickListener {
      val destIntent = DataAnakActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearHomeButton.setOnClickListener {
      val destIntent = DashboardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "DATA_PASANGAN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DataPasanganActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
