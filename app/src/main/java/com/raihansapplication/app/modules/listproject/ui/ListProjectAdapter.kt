package com.raihansapplication.app.modules.listproject.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.raihansapplication.app.R
import com.raihansapplication.app.databinding.RowListProjectBinding
import com.raihansapplication.app.modules.listproject.`data`.model.ListProjectRowModel
import kotlin.Int
import kotlin.collections.List

class ListProjectAdapter(
  var list: List<ListProjectRowModel>
) : RecyclerView.Adapter<ListProjectAdapter.RowListProjectVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListProjectVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_list_project,parent,false)
    return RowListProjectVH(view)
  }

  override fun onBindViewHolder(holder: RowListProjectVH, position: Int) {
    val listProjectRowModel = ListProjectRowModel()
    // TODO uncomment following line after integration with data source
    // val listProjectRowModel = list[position]
    holder.binding.listProjectRowModel = listProjectRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListProjectRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListProjectRowModel
    ) {
    }
  }

  inner class RowListProjectVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListProjectBinding = RowListProjectBinding.bind(itemView)
    init {
      binding.linearListItem.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListProjectRowModel())
      }
    }
  }
}
