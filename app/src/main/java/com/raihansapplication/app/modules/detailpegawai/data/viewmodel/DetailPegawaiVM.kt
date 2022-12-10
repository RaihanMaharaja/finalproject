package com.raihansapplication.app.modules.detailpegawai.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.raihansapplication.app.modules.detailpegawai.`data`.model.DetailPegawaiModel
import org.koin.core.KoinComponent

class DetailPegawaiVM : ViewModel(), KoinComponent {
  val detailPegawaiModel: MutableLiveData<DetailPegawaiModel> =
      MutableLiveData(DetailPegawaiModel())

  var navArguments: Bundle? = null
}
