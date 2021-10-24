package com.solnet.app.modules.frame19.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.solnet.app.R
import com.solnet.app.appcomponents.base.BaseActivity
import com.solnet.app.databinding.ActivityFrame19Binding
import com.solnet.app.modules.frame15.ui.Frame15Activity
import com.solnet.app.modules.frame17.ui.Frame17Activity
import com.solnet.app.modules.frame18.ui.Frame18Activity
import com.solnet.app.modules.frame19.`data`.viewmodel.Frame19VM
import com.solnet.app.modules.frame20.ui.Frame20Activity
import com.solnet.app.modules.frame27.ui.Frame27Activity
import kotlin.String
import kotlin.Unit

public class Frame19Activity : BaseActivity<ActivityFrame19Binding>(R.layout.activity_frame_19) {
  private val viewModel: Frame19VM by viewModels<Frame19VM>()

  public override fun setUpClicks(): Unit {
    binding.linear11.setOnClickListener {

              val destIntent = Frame17Activity.getIntent(this, null)
              startActivity(destIntent)

            }
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
    binding.image10.setOnClickListener {

              val destIntent = Frame18Activity.getIntent(this, null)
              startActivity(destIntent)

            }
    binding.linear2.setOnClickListener {

              val destIntent = Frame15Activity.getIntent(this, null)
              startActivity(destIntent)

            }
  }

  public override fun onInitialized(): Unit {
    binding.frame19VM = viewModel
  }

  public companion object {
    public const val TAG: String = "FRAME19ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Frame19Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
