package com.banksy.app.modules.paybill.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.banksy.app.R
import com.banksy.app.appcomponents.base.BaseActivity
import com.banksy.app.databinding.ActivityPayBillBinding
import com.banksy.app.modules.electricbill.ui.ElectricBillActivity
import com.banksy.app.modules.paybill.`data`.model.BillRowModel
import com.banksy.app.modules.paybill.`data`.viewmodel.PayBillVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PayBillActivity : BaseActivity<ActivityPayBillBinding>(R.layout.activity_pay_bill) {
  private val viewModel: PayBillVM by viewModels<PayBillVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val payBillAdapter = PayBillAdapter(viewModel.payBillList.value?:mutableListOf())
    binding.recyclerPayBill.adapter = payBillAdapter
    payBillAdapter.setOnItemClickListener(
    object : PayBillAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : BillRowModel) {
        onClickRecyclerPayBill(view, position, item)
      }
    }
    )
    viewModel.payBillList.observe(this) {
      payBillAdapter.updateData(it)
    }
    binding.payBillVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerPayBill(
    view: View,
    position: Int,
    item: BillRowModel
  ): Unit {
    when(view.id) {
      R.id.linearOne ->  {
        val destIntent = ElectricBillActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "PAY_BILL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PayBillActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
