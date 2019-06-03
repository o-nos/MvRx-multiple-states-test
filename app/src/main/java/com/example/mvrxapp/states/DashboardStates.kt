package com.example.mvrxapp.states

import com.airbnb.mvrx.MvRxState

sealed class DashboardState(val waiterRole: String = "Servis") : MvRxState {
    data class TablesOrderSummaryState(val chosenTableTitle: String? = "") : DashboardState()
    data class ReceiptsListReceiptDetailState(val chosenReceiptNumber: String? = "") : DashboardState()
}
