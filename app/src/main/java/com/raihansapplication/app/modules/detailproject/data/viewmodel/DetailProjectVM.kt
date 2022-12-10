package com.raihansapplication.app.modules.detailproject.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.raihansapplication.app.modules.detailproject.`data`.model.ChatsRowModel
import com.raihansapplication.app.modules.detailproject.`data`.model.DetailProjectModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DetailProjectVM : ViewModel(), KoinComponent {
  val detailProjectModel: MutableLiveData<DetailProjectModel> =
      MutableLiveData(DetailProjectModel())

  var navArguments: Bundle? = null

  val chatsList: MutableLiveData<MutableList<ChatsRowModel>> = MutableLiveData(mutableListOf())
}
