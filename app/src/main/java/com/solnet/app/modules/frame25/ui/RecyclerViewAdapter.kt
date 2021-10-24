package com.solnet.app.modules.frame25.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.solnet.app.R
import com.solnet.app.databinding.RowFrame26Binding
import com.solnet.app.modules.frame25.`data`.model.Frame26RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<Frame26RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowFrame26VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Frame26RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowFrame26VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_frame_26,parent,false)
    return RowFrame26VH(view)
  }

  public override fun onBindViewHolder(holder: RowFrame26VH, position: Int): Unit {
    val frame26RowModel = Frame26RowModel()
    // TODO uncomment following line after integration with data source
    // val frame26RowModel = list[position]
    holder.binding.frame26RowModel = frame26RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Frame26RowModel
    ): Unit {
    }
  }

  public inner class RowFrame26VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowFrame26Binding = RowFrame26Binding.bind(itemView)
  }
}
