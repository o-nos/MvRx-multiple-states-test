package com.example.mvrxapp.tables_orderSummary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.airbnb.mvrx.activityViewModel
import com.airbnb.mvrx.withState
import com.example.mvrxapp.DashboardViewModel
import com.example.mvrxapp.R
import com.example.mvrxapp.base.BaseFragment
import com.example.mvrxapp.states.DashboardState
import kotlinx.android.synthetic.main.fragment_order_summary.*

class DashboardOrderSummaryFragment : BaseFragment() {

    companion object {
        fun newInstance() = DashboardOrderSummaryFragment()
    }

    private val dashboardViewModel: DashboardViewModel by activityViewModel()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_order_summary, container, false)
    }

    override fun invalidate() = withState(dashboardViewModel) {
        when (it) {
            is DashboardState.TablesOrderSummaryState -> {
                chosen_table_text.text = it.chosenTableTitle
            }
        }
    }

}