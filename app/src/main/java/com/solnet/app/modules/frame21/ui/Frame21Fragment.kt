package com.solnet.app.modules.frame21.ui

import androidx.fragment.app.viewModels
import com.solnet.app.R
import com.solnet.app.appcomponents.base.BaseFragment
import com.solnet.app.databinding.FragmentFrame21Binding
import com.solnet.app.modules.frame15.ui.Frame15Activity
import com.solnet.app.modules.frame18.ui.Frame18Activity
import com.solnet.app.modules.frame20.ui.Frame20Activity
import com.solnet.app.modules.frame21.`data`.viewmodel.Frame21VM
import com.solnet.app.modules.frame27.ui.Frame27Activity
import kotlin.String
import kotlin.Unit

public class Frame21Fragment : BaseFragment<FragmentFrame21Binding>(R.layout.fragment_frame_21) {
  private val viewModel: Frame21VM by viewModels<Frame21VM>()

  public override fun setUpClicks(): Unit {
    binding.image15.setOnClickListener {

      val destIntent = Frame27Activity.getIntent(requireActivity(), null)
      startActivity(destIntent)

    }
    binding.image12.setOnClickListener {

      val destIntent = Frame20Activity.getIntent(requireActivity(), null)
      startActivity(destIntent)

    }
    binding.image11.setOnClickListener {

      val destIntent = Frame15Activity.getIntent(requireActivity(), null)
      startActivity(destIntent)

    }
    binding.image14.setOnClickListener {

      val destIntent = Frame18Activity.getIntent(requireActivity(), null)
      startActivity(destIntent)

    }
  }

  public override fun onInitialized(): Unit {
    binding.frame21VM = viewModel
  }

  public companion object {
    public const val TAG: String = "FRAME21FRAGMENT"
  }
}
