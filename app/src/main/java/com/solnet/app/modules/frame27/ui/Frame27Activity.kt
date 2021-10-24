package com.solnet.app.modules.frame27.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.solnet.app.R
import com.solnet.app.appcomponents.base.BaseActivity
import com.solnet.app.databinding.ActivityFrame27Binding
import com.solnet.app.modules.frame15.ui.Frame15Activity
import com.solnet.app.modules.frame20.ui.Frame20Activity
import com.solnet.app.modules.frame27.`data`.viewmodel.Frame27VM
import kotlin.String
import kotlin.Unit

public class Frame27Activity : BaseActivity<ActivityFrame27Binding>(R.layout.activity_frame_27) {
  private val viewModel: Frame27VM by viewModels<Frame27VM>()

  public override fun setUpClicks(): Unit {
    binding.image2.setOnClickListener {

                                                              val destIntent =
                Frame20Activity.getIntent(this,
                    null)
                                                              startActivity(destIntent)

                                                            }
    binding.image1.setOnClickListener {

                                                              val destIntent =
                Frame15Activity.getIntent(this,
                    null)
                                                              startActivity(destIntent)

                                                            }
  }

  public override fun onInitialized(): Unit {
    binding.frame27VM = viewModel
  }

  public companion object {
    public const val TAG: String = "FRAME27ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Frame27Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
