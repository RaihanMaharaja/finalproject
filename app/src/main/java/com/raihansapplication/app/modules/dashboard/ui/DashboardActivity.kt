package com.raihansapplication.app.modules.dashboard.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.raihansapplication.app.R
import com.raihansapplication.app.appcomponents.base.BaseActivity
import com.raihansapplication.app.databinding.ActivityDashboardBinding
import com.raihansapplication.app.modules.dashboard.`data`.viewmodel.DashboardVM
import com.raihansapplication.app.modules.listdivisi.ui.ListDivisiActivity
import com.raihansapplication.app.modules.listpegawai.ui.ListPegawaiActivity
import com.raihansapplication.app.modules.listproject.ui.ListProjectActivity
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class DashboardActivity : BaseActivity<ActivityDashboardBinding>(R.layout.activity_dashboard) {
  private val viewModel: DashboardVM by viewModels<DashboardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.dashboardVM = viewModel
    setUpSearchViewSearchListener()
  }

  override fun setUpClicks(): Unit {
    binding.linearHorizontalCard1.setOnClickListener {
      val destIntent = ListDivisiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearHorizontalCard.setOnClickListener {
      val destIntent = ListPegawaiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearHorizontalCard2.setOnClickListener {
      val destIntent = ListProjectActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  private fun setUpSearchViewSearchListener(): Unit {
    binding.searchViewSearch.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "DASHBOARD_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, DashboardActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
