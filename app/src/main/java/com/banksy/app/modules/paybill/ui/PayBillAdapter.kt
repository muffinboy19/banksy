package com.banksy.app.modules.paybill.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.banksy.app.R
import com.banksy.app.databinding.RowBillBinding
import com.banksy.app.modules.paybill.`data`.model.BillRowModel
import kotlin.Int
import kotlin.collections.List

class PayBillAdapter(
  var list: List<BillRowModel>
) : RecyclerView.Adapter<PayBillAdapter.RowBillVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowBillVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_bill,parent,false)
    return RowBillVH(view)
  }

  override fun onBindViewHolder(holder: RowBillVH, position: Int) {
    val billRowModel = BillRowModel()
    // TODO uncomment following line after integration with data source
    // val billRowModel = list[position]
    holder.binding.billRowModel = billRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<BillRowModel>) {
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
      item: BillRowModel
    ) {
    }
  }

  inner class RowBillVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowBillBinding = RowBillBinding.bind(itemView)
    init {
      binding.linearOne.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, BillRowModel())
      }
    }
  }
}
