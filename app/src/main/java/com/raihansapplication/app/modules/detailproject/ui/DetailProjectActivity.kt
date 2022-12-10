package com.raihansapplication.app.modules.detailproject.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.raihansapplication.app.R
import com.raihansapplication.app.appcomponents.base.BaseActivity
import com.raihansapplication.app.databinding.ActivityDetailProjectBinding
import com.raihansapplication.app.modules.dashboard.ui.DashboardActivity
import com.raihansapplication.app.modules.detailproject.`data`.model.ChatsRowModel
import com.raihansapplication.app.modules.detailproject.`data`.viewmodel.DetailProjectVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DetailProjectActivity :
    BaseActivity<ActivityDetailProjectBinding>(R.layout.activity_detail_project) {
  private val viewModel: DetailProjectVM by viewModels<DetailProjectVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val chatsAdapter = ChatsAdapter(viewModel.chatsList.value?:mutableListOf())
    binding.recyclerChats.adapter = chatsAdapter
    chatsAdapter.setOnItemClickListener(
    object : ChatsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ChatsRowModel) {
        onClickRecyclerChats(view, position, item)
      }
    }
    )
    viewModel.chatsList.observe(this) {
      chatsAdapter.updateData(it)
    }
    binding.detailProjectVM = viewModel
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

  fun onClickRecyclerChats(
    view: View,
    position: Int,
    item: ChatsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DETAIL_PROJECT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DetailProjectActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
