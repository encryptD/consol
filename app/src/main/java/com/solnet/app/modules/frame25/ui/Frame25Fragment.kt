package com.solnet.app.modules.frame25.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.solnet.app.R
import com.solnet.app.appcomponents.base.BaseFragment
import com.solnet.app.databinding.FragmentFrame25Binding
import com.solnet.app.modules.frame15.ui.Frame15Activity
import com.solnet.app.modules.frame20.ui.Frame20Activity
import com.solnet.app.modules.frame25.`data`.model.Frame26RowModel
import com.solnet.app.modules.frame25.`data`.viewmodel.Frame25VM
import com.solnet.app.modules.frame27.ui.Frame27Activity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class Frame25Fragment : BaseFragment<FragmentFrame25Binding>(R.layout.fragment_frame_25) {
  private val viewModel: Frame25VM by viewModels<Frame25VM>()

  public override fun setUpClicks(): Unit {
    binding.image9.setOnClickListener {

      val destIntent = Frame20Activity.getIntent(requireActivity(), null)
      startActivity(destIntent)

    }
    binding.image8.setOnClickListener {

      val destIntent = Frame15Activity.getIntent(requireActivity(), null)
      startActivity(destIntent)

    }
    binding.image12.setOnClickListener {

      val destIntent = Frame27Activity.getIntent(requireActivity(), null)
      startActivity(destIntent)

    }
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: Frame26RowModel
  ): Unit {
    when(view.id) {


    }
  }

  public override fun onInitialized(): Unit {
    val recyclerViewAdapter =
                    RecyclerViewAdapter(viewModel.recyclerViewList.value?:mutableListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
            object : RecyclerViewAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item : Frame26RowModel) {
                    onClickRecyclerView(view, position, item)
                }
            }
            )
    viewModel.recyclerViewList.observe(requireActivity()) {
                recyclerViewAdapter.updateData(it)
            }
    binding.frame25VM = viewModel
  }

  public companion object {
    public const val TAG: String = "FRAME25FRAGMENT"
  }
}
