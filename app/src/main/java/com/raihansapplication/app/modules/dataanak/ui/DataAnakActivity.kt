package com.raihansapplication.app.modules.dataanak.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.raihansapplication.app.R
import com.raihansapplication.app.appcomponents.base.BaseActivity
import com.raihansapplication.app.databinding.ActivityDataAnakBinding
import com.raihansapplication.app.modules.dashboard.ui.DashboardActivity
import com.raihansapplication.app.modules.dataanak.`data`.viewmodel.DataAnakVM
import kotlin.String
import kotlin.Unit

class DataAnakActivity : BaseActivity<ActivityDataAnakBinding>(R.layout.activity_data_anak) {
  private val viewModel: DataAnakVM by viewModels<DataAnakVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.dataAnakVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearHomeButton.setOnClickListener {
      val destIntent = DashboardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "DATA_ANAK_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DataAnakActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
