package com.solnet.app.modules.frame29.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.solnet.app.R
import com.solnet.app.appcomponents.base.BaseActivity
import com.solnet.app.databinding.ActivityFrame29Binding
import com.solnet.app.modules.frame29.`data`.viewmodel.Frame29VM
import kotlin.String
import kotlin.Unit

public class Frame29Activity : BaseActivity<ActivityFrame29Binding>(R.layout.activity_frame_29) {
  private val viewModel: Frame29VM by viewModels<Frame29VM>()

  public override fun setUpClicks(): Unit {
  }

  public override fun onInitialized(): Unit {
    binding.frame29VM = viewModel
    val adapter = Frame29ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPager.adapter = adapter
    TabLayoutMediator(binding.tabLayout,binding.viewPager) { tab, position ->
                tab.text = Frame29ActivityPagerAdapter.title[position]
                }.attach()
  }

  public companion object {
    public const val TAG: String = "FRAME29ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Frame29Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
