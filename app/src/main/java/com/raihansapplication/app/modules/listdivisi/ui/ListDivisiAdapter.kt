package com.raihansapplication.app.modules.listdivisi.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.raihansapplication.app.R
import com.raihansapplication.app.databinding.RowListDivisiBinding
import com.raihansapplication.app.modules.listdivisi.`data`.model.ListDivisiRowModel
import kotlin.Int
import kotlin.collections.List

class ListDivisiAdapter(
  var list: List<ListDivisiRowModel>
) : RecyclerView.Adapter<ListDivisiAdapter.RowListDivisiVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListDivisiVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_list_divisi,parent,false)
    return RowListDivisiVH(view)
  }

  override fun onBindViewHolder(holder: RowListDivisiVH, position: Int) {
    val listDivisiRowModel = ListDivisiRowModel()
    // TODO uncomment following line after integration with data source
    // val listDivisiRowModel = list[position]
    holder.binding.listDivisiRowModel = listDivisiRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListDivisiRowModel>) {
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
      item: ListDivisiRowModel
    ) {
    }
  }

  inner class RowListDivisiVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListDivisiBinding = RowListDivisiBinding.bind(itemView)
    init {
      binding.linearListItem.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListDivisiRowModel())
      }
    }
  }
}
