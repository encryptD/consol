package com.solnet.app.modules.frame28.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.solnet.app.R
import com.solnet.app.appcomponents.base.BaseActivity
import com.solnet.app.databinding.ActivityFrame28Binding
import com.solnet.app.modules.frame28.`data`.viewmodel.Frame28VM
import kotlin.String
import kotlin.Unit

public class Frame28Activity : BaseActivity<ActivityFrame28Binding>(R.layout.activity_frame_28) {
  private val viewModel: Frame28VM by viewModels<Frame28VM>()

  public override fun setUpClicks(): Unit {
  }

  public override fun onInitialized(): Unit {
    binding.frame28VM = viewModel
    val adapter = Frame28ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPager.adapter = adapter
    TabLayoutMediator(binding.tabLayout,binding.viewPager) { tab, position ->
                tab.text = Frame28ActivityPagerAdapter.title[position]
                }.attach()
  }

  public companion object {
    public const val TAG: String = "FRAME28ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Frame28Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
