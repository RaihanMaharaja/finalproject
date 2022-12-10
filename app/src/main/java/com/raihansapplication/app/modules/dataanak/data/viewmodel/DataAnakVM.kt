package com.raihansapplication.app.modules.dataanak.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.raihansapplication.app.modules.dataanak.`data`.model.DataAnakModel
import org.koin.core.KoinComponent

class DataAnakVM : ViewModel(), KoinComponent {
  val dataAnakModel: MutableLiveData<DataAnakModel> = MutableLiveData(DataAnakModel())

  var navArguments: Bundle? = null
}
