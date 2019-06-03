package com.example.mvrxapp

import android.os.Bundle
import com.example.mvrxapp.base.BaseActivity
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        supportFragmentManager.beginTransaction()
            .add(dashboard_activity_root_layout.id, DashboardFragment())
            .commit()
    }

}