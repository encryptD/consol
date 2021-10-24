package com.solnet.app.modules.frame18.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.solnet.app.R
import com.solnet.app.appcomponents.base.BaseActivity
import com.solnet.app.databinding.ActivityFrame18Binding
import com.solnet.app.modules.frame15.ui.Frame15Activity
import com.solnet.app.modules.frame18.`data`.viewmodel.Frame18VM
import com.solnet.app.modules.frame2.ui.Frame2Activity
import com.solnet.app.modules.frame20.ui.Frame20Activity
import com.solnet.app.modules.frame27.ui.Frame27Activity
import kotlin.String
import kotlin.Unit

public class Frame18Activity : BaseActivity<ActivityFrame18Binding>(R.layout.activity_frame_18) {
  private val viewModel: Frame18VM by viewModels<Frame18VM>()

  public override fun setUpClicks(): Unit {
    binding.image14.setOnClickListener {

                      val destIntent = Frame27Activity.getIntent(this, null)
                      startActivity(destIntent)

                    }
    binding.image4.setOnClickListener {

                      val destIntent = Frame20Activity.getIntent(this, null)
                      startActivity(destIntent)

                    }
    binding.image6.setOnClickListener {

                      val destIntent = Frame2Activity.getIntent(this, null)
                      startActivity(destIntent)

                    }
    binding.image3.setOnClickListener {

                      val destIntent = Frame15Activity.getIntent(this, null)
                      startActivity(destIntent)

                    }
  }

  public override fun onInitialized(): Unit {
    binding.frame18VM = viewModel
  }

  public companion object {
    public const val TAG: String = "FRAME18ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Frame18Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
