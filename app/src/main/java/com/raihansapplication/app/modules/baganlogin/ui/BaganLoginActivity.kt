package com.raihansapplication.app.modules.baganlogin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.raihansapplication.app.R
import com.raihansapplication.app.appcomponents.base.BaseActivity
import com.raihansapplication.app.databinding.ActivityBaganLoginBinding
import com.raihansapplication.app.modules.baganlogin.`data`.viewmodel.BaganLoginVM
import com.raihansapplication.app.modules.dashboard.ui.DashboardActivity
import kotlin.String
import kotlin.Unit

class BaganLoginActivity : BaseActivity<ActivityBaganLoginBinding>(R.layout.activity_bagan_login) {
  private val viewModel: BaganLoginVM by viewModels<BaganLoginVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.baganLoginVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = DashboardActivity.getIntent(this, null)
      startActivity(destIntent)
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.btnMasuk.setOnClickListener {
        val destIntent = DashboardActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "BAGAN_LOGIN_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, BaganLoginActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
