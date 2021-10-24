package com.solnet.app.modules.frame22.ui

import androidx.fragment.app.viewModels
import com.solnet.app.R
import com.solnet.app.appcomponents.base.BaseFragment
import com.solnet.app.databinding.FragmentFrame22Binding
import com.solnet.app.modules.frame15.ui.Frame15Activity
import com.solnet.app.modules.frame20.ui.Frame20Activity
import com.solnet.app.modules.frame22.`data`.viewmodel.Frame22VM
import com.solnet.app.modules.frame27.ui.Frame27Activity
import kotlin.String
import kotlin.Unit

public class Frame22Fragment : BaseFragment<FragmentFrame22Binding>(R.layout.fragment_frame_22) {
  private val viewModel: Frame22VM by viewModels<Frame22VM>()

  public override fun setUpClicks(): Unit {
    binding.image2.setOnClickListener {

      val destIntent = Frame15Activity.getIntent(requireActivity(), null)
      startActivity(destIntent)

    }
    binding.image3.setOnClickListener {

      val destIntent = Frame20Activity.getIntent(requireActivity(), null)
      startActivity(destIntent)

    }
    binding.image1.setOnClickListener {

      val destIntent = Frame27Activity.getIntent(requireActivity(), null)
      startActivity(destIntent)

    }
  }

  public override fun onInitialized(): Unit {
    binding.frame22VM = viewModel
  }

  public companion object {
    public const val TAG: String = "FRAME22FRAGMENT"
  }
}
