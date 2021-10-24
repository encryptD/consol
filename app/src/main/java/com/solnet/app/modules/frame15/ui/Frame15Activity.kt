package com.solnet.app.modules.frame15.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.solnet.app.R
import com.solnet.app.appcomponents.base.BaseActivity
import com.solnet.app.databinding.ActivityFrame15Binding
import com.solnet.app.modules.frame15.`data`.model.Frame16RowModel
import com.solnet.app.modules.frame15.`data`.viewmodel.Frame15VM
import com.solnet.app.modules.frame18.ui.Frame18Activity
import com.solnet.app.modules.frame19.ui.Frame19Activity
import com.solnet.app.modules.frame20.ui.Frame20Activity
import com.solnet.app.modules.frame27.ui.Frame27Activity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class Frame15Activity : BaseActivity<ActivityFrame15Binding>(R.layout.activity_frame_15) {
  private val viewModel: Frame15VM by viewModels<Frame15VM>()

  public override fun setUpClicks(): Unit {
    binding.image2.setOnClickListener {

                                      val destIntent = Frame19Activity.getIntent(this, null)
                                      startActivity(destIntent)

                                    }
    binding.image17.setOnClickListener {

                                      val destIntent = Frame18Activity.getIntent(this, null)
                                      startActivity(destIntent)

                                    }
    binding.image18.setOnClickListener {

                                      val destIntent = Frame27Activity.getIntent(this, null)
                                      startActivity(destIntent)

                                    }
    binding.image15.setOnClickListener {

                                      val destIntent = Frame20Activity.getIntent(this, null)
                                      startActivity(destIntent)

                                    }
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: Frame16RowModel
  ): Unit {
    when(view.id) {


                                    }
  }

  public override fun onInitialized(): Unit {
    val recyclerViewAdapter =
                                                                               
                                                       
                               
        RecyclerViewAdapter(viewModel.recyclerViewList.value?:mutableListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
                                                                        object :
                        RecyclerViewAdapter.OnItemClickListener
                            {
                                                                            override fun
                onItemClick(view:View,
                                position:Int,
                                    item :
                                                        Frame16RowModel) {
                                                                               
            onClickRecyclerView(view,
                    position,
                            item)
                                                                            }
                                                                        }
                                                                        )
    viewModel.recyclerViewList.observe(this) {
                                                                           
                recyclerViewAdapter.updateData(it)
                                                                        }
    binding.frame15VM = viewModel
  }

  public companion object {
    public const val TAG: String = "FRAME15ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Frame15Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
