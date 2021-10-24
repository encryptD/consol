package com.solnet.app.modules.frame15.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.solnet.app.R
import com.solnet.app.databinding.RowFrame16Binding
import com.solnet.app.modules.frame15.`data`.model.Frame16RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<Frame16RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowFrame16VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Frame16RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowFrame16VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_frame_16,parent,false)
    return RowFrame16VH(view)
  }

  public override fun onBindViewHolder(holder: RowFrame16VH, position: Int): Unit {
    val frame16RowModel = Frame16RowModel()
    // TODO uncomment following line after integration with data source
    // val frame16RowModel = list[position]
    holder.binding.frame16RowModel = frame16RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Frame16RowModel
    ): Unit {
    }
  }

  public inner class RowFrame16VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowFrame16Binding = RowFrame16Binding.bind(itemView)
  }
}
