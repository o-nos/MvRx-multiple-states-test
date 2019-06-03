package com.example.mvrxapp.base

import com.airbnb.mvrx.BaseMvRxViewModel
import com.airbnb.mvrx.MvRxState
import com.example.mvrxapp.BuildConfig

abstract class BaseViewModel<S : MvRxState>(state: S) : BaseMvRxViewModel<S>(state, debugMode = BuildConfig.DEBUG)