package com.raihansapplication.app.modules.detaildivisi.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.raihansapplication.app.modules.detaildivisi.`data`.model.DetailDivisiModel
import org.koin.core.KoinComponent

class DetailDivisiVM : ViewModel(), KoinComponent {
  val detailDivisiModel: MutableLiveData<DetailDivisiModel> = MutableLiveData(DetailDivisiModel())

  var navArguments: Bundle? = null
}
