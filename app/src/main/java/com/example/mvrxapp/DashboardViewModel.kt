package com.example.mvrxapp

import com.airbnb.mvrx.MvRxViewModelFactory
import com.example.mvrxapp.base.BaseViewModel
import com.example.mvrxapp.states.DashboardState

class DashboardViewModel(private val initialState: DashboardState.TablesOrderSummaryState) : BaseViewModel<DashboardState>(initialState) {

//    companion object : MvRxViewModelFactory<DashboardViewModel, DashboardState> {
//
//        override fun create(viewModelContext: ViewModelContext, state: MyState): MyViewModel {
//            val dataStore = if (viewModelContext is FragmentViewModelContext) {
//                // If the ViewModel has a fragment scope it will be a FragmentViewModelContext, and you can access the fragment.
//                viewModelContext.fragment.inject()
//            } else {
//                // The activity owner will be available for both fragment and activity view models.
//                viewModelContext.activity.inject()
//            }
//            return MyViewModel(state, dataStore)
//        }
//
//    }

    fun onTableChosen(title: String) {
        setState { (this as DashboardState.TablesOrderSummaryState).copy(chosenTableTitle = title) }
    }

}