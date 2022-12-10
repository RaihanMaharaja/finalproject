package com.raihansapplication.app.modules.detailpegawaione.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.raihansapplication.app.modules.detailpegawaione.`data`.model.DetailPegawaiOneModel
import org.koin.core.KoinComponent

class DetailPegawaiOneVM : ViewModel(), KoinComponent {
  val detailPegawaiOneModel: MutableLiveData<DetailPegawaiOneModel> =
      MutableLiveData(DetailPegawaiOneModel())

  var navArguments: Bundle? = null
}
