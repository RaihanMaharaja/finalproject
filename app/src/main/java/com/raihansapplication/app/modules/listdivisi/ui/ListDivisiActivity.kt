package com.raihansapplication.app.modules.listdivisi.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.raihansapplication.app.R
import com.raihansapplication.app.appcomponents.base.BaseActivity
import com.raihansapplication.app.databinding.ActivityListDivisiBinding
import com.raihansapplication.app.modules.dashboard.ui.DashboardActivity
import com.raihansapplication.app.modules.detaildivisi.ui.DetailDivisiActivity
import com.raihansapplication.app.modules.listdivisi.`data`.model.ListDivisiRowModel
import com.raihansapplication.app.modules.listdivisi.`data`.viewmodel.ListDivisiVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ListDivisiActivity : BaseActivity<ActivityListDivisiBinding>(R.layout.activity_list_divisi) {
  private val viewModel: ListDivisiVM by viewModels<ListDivisiVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listDivisiAdapter = ListDivisiAdapter(viewModel.listDivisiList.value?:mutableListOf())
    binding.recyclerListDivisi.adapter = listDivisiAdapter
    listDivisiAdapter.setOnItemClickListener(
    object : ListDivisiAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListDivisiRowModel) {
        onClickRecyclerListDivisi(view, position, item)
      }
    }
    )
    viewModel.listDivisiList.observe(this) {
      listDivisiAdapter.updateData(it)
    }
    binding.listDivisiVM = viewModel
    setUpSearchViewSearchBarListener()
  }

  override fun setUpClicks(): Unit {
    binding.linearHomeButton.setOnClickListener {
      val destIntent = DashboardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListDivisi(
    view: View,
    position: Int,
    item: ListDivisiRowModel
  ): Unit {
    when(view.id) {
      R.id.linearListItem -> {
        onClickRecyclerListDivisiLinearListItem(view, position, item)
      }
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

    fun onClickRecyclerListDivisiLinearListItem(
      view: View,
      position: Int,
      item: ListDivisiRowModel
    ): Unit {
      /** TODO As per your logic, Add constant type for item click.*/
      when(0) {
        0 -> {
          val destIntent = DetailDivisiActivity.getIntent(this, null)
          startActivity(destIntent)
        }
        1 -> {
          val destIntent = DetailDivisiActivity.getIntent(this, null)
          startActivity(destIntent)
        }
        2 -> {
          val destIntent = DetailDivisiActivity.getIntent(this, null)
          startActivity(destIntent)
        }
        3 -> {
          val destIntent = DetailDivisiActivity.getIntent(this, null)
          startActivity(destIntent)
        }
        4 -> {
          val destIntent = DetailDivisiActivity.getIntent(this, null)
          startActivity(destIntent)
        }
      }
    }

    companion object {
      const val TAG: String = "LIST_DIVISI_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, ListDivisiActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
