package com.example.mvrxapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.airbnb.mvrx.BaseMvRxFragment
import com.airbnb.mvrx.activityViewModel
import com.airbnb.mvrx.withState
import com.example.mvrxapp.states.DashboardState
import com.example.mvrxapp.tables_orderSummary.DashboardFloorPlanFragment
import com.example.mvrxapp.tables_orderSummary.DashboardOrderSummaryFragment
import kotlinx.android.synthetic.main.fragment_dashboard.*

//sealed class MyState(val title: String = "Hello World") : MvRxState
//data class TableOrderSummaryState(val currentOrderCounter: Int = 0) : MyState()
//
//class MyViewModel(initialState: TableOrderSummaryState) :
//    BaseMvRxViewModel<TableOrderSummaryState>(initialState, debugMode = BuildConfig.DEBUG) {
//    fun updateTitle(newTitle: String) = setState { copy() }
//}

class DashboardFragment : BaseMvRxFragment() {

    private var splitScreen = false
        get() = content_holder != null

    private val dashboardViewModel: DashboardViewModel by activityViewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    override fun invalidate() = withState(dashboardViewModel) {
        when (it) {
            is DashboardState.TablesOrderSummaryState -> {
                showTableOrderSummaryFragments()
            }
            is DashboardState.ReceiptsListReceiptDetailState -> {

            }
        }
    }

    private fun showTableOrderSummaryFragments() {
        fragmentManager?.apply {
            beginTransaction()
                .replace(main_holder.id, DashboardFloorPlanFragment.newInstance())
                .commit()

            if (splitScreen) {
                beginTransaction()
                    .replace(content_holder.id, DashboardOrderSummaryFragment.newInstance())
                    .commit()
            }
        }
    }


}
