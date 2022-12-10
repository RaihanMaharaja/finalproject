package com.raihansapplication.app.modules.baganlogin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.raihansapplication.app.modules.baganlogin.`data`.model.BaganLoginModel
import org.koin.core.KoinComponent

class BaganLoginVM : ViewModel(), KoinComponent {
  val baganLoginModel: MutableLiveData<BaganLoginModel> = MutableLiveData(BaganLoginModel())

  var navArguments: Bundle? = null
}
