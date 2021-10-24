package com.solnet.app.modules.frame24.ui

import androidx.fragment.app.viewModels
import com.solnet.app.R
import com.solnet.app.appcomponents.base.BaseFragment
import com.solnet.app.databinding.FragmentFrame24Binding
import com.solnet.app.modules.frame15.ui.Frame15Activity
import com.solnet.app.modules.frame20.ui.Frame20Activity
import com.solnet.app.modules.frame24.`data`.viewmodel.Frame24VM
import com.solnet.app.modules.frame27.ui.Frame27Activity
import kotlin.String
import kotlin.Unit

public class Frame24Fragment : BaseFragment<FragmentFrame24Binding>(R.layout.fragment_frame_24) {
  private val viewModel: Frame24VM by viewModels<Frame24VM>()

  public override fun setUpClicks(): Unit {
    binding.image23.setOnClickListener {

      val destIntent = Frame15Activity.getIntent(requireActivity(), null)
      startActivity(destIntent)

    }
    binding.image24.setOnClickListener {

      val destIntent = Frame20Activity.getIntent(requireActivity(), null)
      startActivity(destIntent)

    }
    binding.image22.setOnClickListener {

      val destIntent = Frame27Activity.getIntent(requireActivity(), null)
      startActivity(destIntent)

    }
  }

  public override fun onInitialized(): Unit {
    binding.frame24VM = viewModel
  }

  public companion object {
    public const val TAG: String = "FRAME24FRAGMENT"
  }
}
