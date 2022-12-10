package com.raihansapplication.app.modules.listpegawai.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.raihansapplication.app.modules.listpegawai.`data`.model.ListPegawaiModel
import org.koin.core.KoinComponent

class ListPegawaiVM : ViewModel(), KoinComponent {
  val listPegawaiModel: MutableLiveData<ListPegawaiModel> = MutableLiveData(ListPegawaiModel())

  var navArguments: Bundle? = null
}
