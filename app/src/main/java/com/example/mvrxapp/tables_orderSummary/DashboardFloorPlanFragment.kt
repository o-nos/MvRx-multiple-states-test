package com.example.mvrxapp.tables_orderSummary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.airbnb.mvrx.activityViewModel
import com.example.mvrxapp.DashboardViewModel
import com.example.mvrxapp.R
import com.example.mvrxapp.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_floor_plan.*

class DashboardFloorPlanFragment : BaseFragment(), View.OnClickListener {

    companion object {
        fun newInstance() = DashboardFloorPlanFragment()
    }

    private val dashboardViewModel: DashboardViewModel by activityViewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_floor_plan, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        table_1.setOnClickListener(this)
        table_2.setOnClickListener(this)
        table_3.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if (v != null) {
            dashboardViewModel.onTableChosen((v as Button).text.toString())
        }
    }

    override fun invalidate() {

    }

}