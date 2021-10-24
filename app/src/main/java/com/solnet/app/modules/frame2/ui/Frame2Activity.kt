package com.solnet.app.modules.frame2.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.solnet.app.R
import com.solnet.app.appcomponents.base.BaseActivity
import com.solnet.app.databinding.ActivityFrame2Binding
import com.solnet.app.modules.frame15.ui.Frame15Activity
import com.solnet.app.modules.frame18.ui.Frame18Activity
import com.solnet.app.modules.frame2.`data`.viewmodel.Frame2VM
import com.solnet.app.modules.frame20.ui.Frame20Activity
import com.solnet.app.modules.frame27.ui.Frame27Activity
import kotlin.String
import kotlin.Unit

public class Frame2Activity : BaseActivity<ActivityFrame2Binding>(R.layout.activity_frame_2) {
  private val viewModel: Frame2VM by viewModels<Frame2VM>()

  public override fun setUpClicks(): Unit {
    binding.image11.setOnClickListener {

      val destIntent = Frame27Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.image8.setOnClickListener {

      val destIntent = Frame20Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.image7.setOnClickListener {

      val destIntent = Frame15Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.txtSolaireNetwork.setOnClickListener {

      val destIntent = Frame15Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.image10.setOnClickListener {

      val destIntent = Frame18Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.image.setOnClickListener {

      val destIntent = Frame15Activity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public override fun onInitialized(): Unit {
    binding.frame2VM = viewModel
  }

  public companion object {
    public const val TAG: String = "FRAME2ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Frame2Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
