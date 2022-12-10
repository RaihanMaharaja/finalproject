package com.raihansapplication.app.modules.listproject.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.raihansapplication.app.R
import com.raihansapplication.app.appcomponents.base.BaseActivity
import com.raihansapplication.app.databinding.ActivityListProjectBinding
import com.raihansapplication.app.modules.dashboard.ui.DashboardActivity
import com.raihansapplication.app.modules.detailproject.ui.DetailProjectActivity
import com.raihansapplication.app.modules.listproject.`data`.model.ListProjectRowModel
import com.raihansapplication.app.modules.listproject.`data`.viewmodel.ListProjectVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ListProjectActivity : BaseActivity<ActivityListProjectBinding>(R.layout.activity_list_project)
    {
  private val viewModel: ListProjectVM by viewModels<ListProjectVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listProjectAdapter =
    ListProjectAdapter(viewModel.listProjectList.value?:mutableListOf())
    binding.recyclerListProject.adapter = listProjectAdapter
    listProjectAdapter.setOnItemClickListener(
    object : ListProjectAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListProjectRowModel) {
        onClickRecyclerListProject(view, position, item)
      }
    }
    )
    viewModel.listProjectList.observe(this) {
      listProjectAdapter.updateData(it)
    }
    binding.listProjectVM = viewModel
    setUpSearchViewSearchBarListener()
  }

  override fun setUpClicks(): Unit {
    binding.linearHomeButton.setOnClickListener {
      val destIntent = DashboardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListProject(
    view: View,
    position: Int,
    item: ListProjectRowModel
  ): Unit {
    when(view.id) {
      R.id.linearListItem -> {
        onClickRecyclerListProjectLinearListItem(view, position, item)
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

    fun onClickRecyclerListProjectLinearListItem(
      view: View,
      position: Int,
      item: ListProjectRowModel
    ): Unit {
      /** TODO As per your logic, Add constant type for item click.*/
      when(0) {
        0 -> {
          val destIntent = DetailProjectActivity.getIntent(this, null)
          startActivity(destIntent)
        }
        1 -> {
          val destIntent = DetailProjectActivity.getIntent(this, null)
          startActivity(destIntent)
        }
      }
    }

    companion object {
      const val TAG: String = "LIST_PROJECT_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, ListProjectActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
