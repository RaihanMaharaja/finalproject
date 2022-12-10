package com.raihansapplication.app.modules.detaildivisi.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.raihansapplication.app.R
import com.raihansapplication.app.appcomponents.base.BaseActivity
import com.raihansapplication.app.databinding.ActivityDetailDivisiBinding
import com.raihansapplication.app.modules.dashboard.ui.DashboardActivity
import com.raihansapplication.app.modules.detaildivisi.`data`.viewmodel.DetailDivisiVM
import kotlin.String
import kotlin.Unit

class DetailDivisiActivity :
    BaseActivity<ActivityDetailDivisiBinding>(R.layout.activity_detail_divisi) {
  private val viewModel: DetailDivisiVM by viewModels<DetailDivisiVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.detailDivisiVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearHomeButton.setOnClickListener {
      val destIntent = DashboardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "DETAIL_DIVISI_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DetailDivisiActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
