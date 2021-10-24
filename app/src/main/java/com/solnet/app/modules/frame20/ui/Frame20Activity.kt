package com.solnet.app.modules.frame20.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.solnet.app.R
import com.solnet.app.appcomponents.base.BaseActivity
import com.solnet.app.databinding.ActivityFrame20Binding
import com.solnet.app.modules.frame15.ui.Frame15Activity
import com.solnet.app.modules.frame20.`data`.viewmodel.Frame20VM
import com.solnet.app.modules.frame27.ui.Frame27Activity
import kotlin.String
import kotlin.Unit

public class Frame20Activity : BaseActivity<ActivityFrame20Binding>(R.layout.activity_frame_20) {
  private val viewModel: Frame20VM by viewModels<Frame20VM>()

  public override fun setUpClicks(): Unit {
    binding.image7.setOnClickListener {

                  val destIntent = Frame27Activity.getIntent(this, null)
                  startActivity(destIntent)

                }
    binding.image10.setOnClickListener {

                  val destIntent = Frame15Activity.getIntent(this, null)
                  startActivity(destIntent)

                }
  }

  public override fun onInitialized(): Unit {
    binding.frame20VM = viewModel
  }

  public companion object {
    public const val TAG: String = "FRAME20ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Frame20Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
