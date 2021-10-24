package com.solnet.app.modules.frame14.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.solnet.app.R
import com.solnet.app.appcomponents.base.BaseActivity
import com.solnet.app.databinding.ActivityFrame14Binding
import com.solnet.app.modules.frame14.`data`.viewmodel.Frame14VM
import com.solnet.app.modules.frame27.ui.Frame27Activity
import kotlin.String
import kotlin.Unit

public class Frame14Activity : BaseActivity<ActivityFrame14Binding>(R.layout.activity_frame_14) {
  private val viewModel: Frame14VM by viewModels<Frame14VM>()

  public override fun setUpClicks(): Unit {
    binding.image1.setOnClickListener {

      val destIntent = Frame27Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.txtSolaireNetwork.setOnClickListener {

      val destIntent = Frame27Activity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public override fun onInitialized(): Unit {
    binding.frame14VM = viewModel
  }

  public companion object {
    public const val TAG: String = "FRAME14ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Frame14Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
