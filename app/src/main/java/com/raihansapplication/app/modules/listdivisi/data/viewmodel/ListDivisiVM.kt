package com.raihansapplication.app.modules.listdivisi.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.raihansapplication.app.modules.listdivisi.`data`.model.ListDivisiModel
import com.raihansapplication.app.modules.listdivisi.`data`.model.ListDivisiRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ListDivisiVM : ViewModel(), KoinComponent {
  val listDivisiModel: MutableLiveData<ListDivisiModel> = MutableLiveData(ListDivisiModel())

  var navArguments: Bundle? = null

  val listDivisiList: MutableLiveData<MutableList<ListDivisiRowModel>> =
      MutableLiveData(mutableListOf())
}
