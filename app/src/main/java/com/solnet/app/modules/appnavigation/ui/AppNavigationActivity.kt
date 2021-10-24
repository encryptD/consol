package com.solnet.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.solnet.app.R
import com.solnet.app.appcomponents.base.BaseActivity
import com.solnet.app.databinding.ActivityAppNavigationBinding
import com.solnet.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.solnet.app.modules.frame14.ui.Frame14Activity
import com.solnet.app.modules.frame15.ui.Frame15Activity
import com.solnet.app.modules.frame17.ui.Frame17Activity
import com.solnet.app.modules.frame18.ui.Frame18Activity
import com.solnet.app.modules.frame19.ui.Frame19Activity
import com.solnet.app.modules.frame2.ui.Frame2Activity
import com.solnet.app.modules.frame20.ui.Frame20Activity
import com.solnet.app.modules.frame27.ui.Frame27Activity
import com.solnet.app.modules.frame28.ui.Frame28Activity
import com.solnet.app.modules.frame29.ui.Frame29Activity
import com.solnet.app.modules.splash.ui.SplashActivity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun setUpClicks(): Unit {
    binding.linear7.setOnClickListener {

      val destIntent = Frame20Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear4.setOnClickListener {

      val destIntent = Frame18Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear8.setOnClickListener {

      val destIntent = Frame14Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear9.setOnClickListener {

      val destIntent = SplashActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear11.setOnClickListener {

      val destIntent = Frame27Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear5.setOnClickListener {

      val destIntent = Frame17Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear13.setOnClickListener {

      val destIntent = Frame29Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear3.setOnClickListener {

      val destIntent = Frame15Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear6.setOnClickListener {

      val destIntent = Frame19Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear12.setOnClickListener {

      val destIntent = Frame28Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear10.setOnClickListener {

      val destIntent = Frame2Activity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public override fun onInitialized(): Unit {
    binding.appNavigationVM = viewModel
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
