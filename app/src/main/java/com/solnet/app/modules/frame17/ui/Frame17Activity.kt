package com.solnet.app.modules.frame17.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.solnet.app.R
import com.solnet.app.appcomponents.base.BaseActivity
import com.solnet.app.databinding.ActivityFrame17Binding
import com.solnet.app.modules.frame15.ui.Frame15Activity
import com.solnet.app.modules.frame17.`data`.viewmodel.Frame17VM
import com.solnet.app.modules.frame18.ui.Frame18Activity
import com.solnet.app.modules.frame19.ui.Frame19Activity
import com.solnet.app.modules.frame2.ui.Frame2Activity
import com.solnet.app.modules.frame20.ui.Frame20Activity
import com.solnet.app.modules.frame27.ui.Frame27Activity
import kotlin.String
import kotlin.Unit

public class Frame17Activity : BaseActivity<ActivityFrame17Binding>(R.layout.activity_frame_17) {
  private val viewModel: Frame17VM by viewModels<Frame17VM>()

  public override fun setUpClicks(): Unit {
    binding.image7.setOnClickListener {

      val destIntent = Frame2Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear3.setOnClickListener {

      val destIntent = Frame19Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.image5.setOnClickListener {

      val destIntent = Frame2Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.image13.setOnClickListener {

      val destIntent = Frame15Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.image17.setOnClickListener {

      val destIntent = Frame27Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.image11.setOnClickListener {

      val destIntent = Frame2Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.image16.setOnClickListener {

      val destIntent = Frame18Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.image14.setOnClickListener {

      val destIntent = Frame20Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.image12.setOnClickListener {

      val destIntent = Frame2Activity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public override fun onInitialized(): Unit {
    binding.frame17VM = viewModel
  }

  public companion object {
    public const val TAG: String = "FRAME17ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Frame17Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
