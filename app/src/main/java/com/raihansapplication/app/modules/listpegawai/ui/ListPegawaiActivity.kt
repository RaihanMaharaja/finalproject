package com.raihansapplication.app.modules.listpegawai.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.raihansapplication.app.R
import com.raihansapplication.app.appcomponents.base.BaseActivity
import com.raihansapplication.app.databinding.ActivityListPegawaiBinding
import com.raihansapplication.app.modules.dashboard.ui.DashboardActivity
import com.raihansapplication.app.modules.detailpegawaione.ui.DetailPegawaiOneActivity
import com.raihansapplication.app.modules.listpegawai.`data`.viewmodel.ListPegawaiVM
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class ListPegawaiActivity : BaseActivity<ActivityListPegawaiBinding>(R.layout.activity_list_pegawai)
    {
  private val viewModel: ListPegawaiVM by viewModels<ListPegawaiVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.listPegawaiVM = viewModel
    setUpSearchViewSearchBarListener()
  }

  override fun setUpClicks(): Unit {
    binding.recyclerList.setOnClickListener {
      val destIntent = DetailPegawaiOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearHomeButton.setOnClickListener {
      val destIntent = DashboardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  private fun setUpSearchViewSearchBarListener(): Unit {
    binding.searchViewSearchBar.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
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
      const val TAG: String = "LIST_PEGAWAI_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, ListPegawaiActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
