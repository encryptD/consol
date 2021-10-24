package com.solnet.app.modules.frame23.ui

import androidx.fragment.app.viewModels
import com.solnet.app.R
import com.solnet.app.appcomponents.base.BaseFragment
import com.solnet.app.databinding.FragmentFrame23Binding
import com.solnet.app.modules.frame15.ui.Frame15Activity
import com.solnet.app.modules.frame20.ui.Frame20Activity
import com.solnet.app.modules.frame23.`data`.viewmodel.Frame23VM
import com.solnet.app.modules.frame27.ui.Frame27Activity
import kotlin.String
import kotlin.Unit

public class Frame23Fragment : BaseFragment<FragmentFrame23Binding>(R.layout.fragment_frame_23) {
  private val viewModel: Frame23VM by viewModels<Frame23VM>()

  public override fun setUpClicks(): Unit {
    binding.image8.setOnClickListener {

      val destIntent = Frame27Activity.getIntent(requireActivity(), null)
      startActivity(destIntent)

    }
    binding.image11.setOnClickListener {

      val destIntent = Frame15Activity.getIntent(requireActivity(), null)
      startActivity(destIntent)

    }
    binding.image12.setOnClickListener {

      val destIntent = Frame20Activity.getIntent(requireActivity(), null)
      startActivity(destIntent)

    }
  }

  public override fun onInitialized(): Unit {
    binding.frame23VM = viewModel
  }

  public companion object {
    public const val TAG: String = "FRAME23FRAGMENT"
  }
}
