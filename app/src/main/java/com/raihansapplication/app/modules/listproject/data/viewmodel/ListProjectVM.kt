package com.raihansapplication.app.modules.listproject.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.raihansapplication.app.modules.listproject.`data`.model.ListProjectModel
import com.raihansapplication.app.modules.listproject.`data`.model.ListProjectRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ListProjectVM : ViewModel(), KoinComponent {
  val listProjectModel: MutableLiveData<ListProjectModel> = MutableLiveData(ListProjectModel())

  var navArguments: Bundle? = null

  val listProjectList: MutableLiveData<MutableList<ListProjectRowModel>> =
      MutableLiveData(mutableListOf())
}
