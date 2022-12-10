package com.raihansapplication.app.modules.datapasangan.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.raihansapplication.app.modules.datapasangan.`data`.model.DataPasanganModel
import org.koin.core.KoinComponent

class DataPasanganVM : ViewModel(), KoinComponent {
  val dataPasanganModel: MutableLiveData<DataPasanganModel> = MutableLiveData(DataPasanganModel())

  var navArguments: Bundle? = null
}
