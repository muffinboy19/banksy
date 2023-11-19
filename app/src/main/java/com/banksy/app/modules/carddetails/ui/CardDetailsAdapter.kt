package com.banksy.app.modules.carddetails.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.banksy.app.R
import com.banksy.app.databinding.RowDetailsBinding
import com.banksy.app.modules.carddetails.`data`.model.DetailsRowModel
import kotlin.Int
import kotlin.collections.List

class CardDetailsAdapter(
  var list: List<DetailsRowModel>
) : RecyclerView.Adapter<CardDetailsAdapter.RowDetailsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDetailsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_details,parent,false)
    return RowDetailsVH(view)
  }

  override fun onBindViewHolder(holder: RowDetailsVH, position: Int) {
    val detailsRowModel = DetailsRowModel()
    // TODO uncomment following line after integration with data source
    // val detailsRowModel = list[position]
    holder.binding.detailsRowModel = detailsRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<DetailsRowModel>) {
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
      item: DetailsRowModel
    ) {
    }
  }

  inner class RowDetailsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowDetailsBinding = RowDetailsBinding.bind(itemView)
  }
}
