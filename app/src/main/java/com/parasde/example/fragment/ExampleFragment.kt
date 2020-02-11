package com.parasde.example.fragment

import android.util.Log
import com.parasde.example.R

class ExampleFragment: BaseFragment() {
    private val TAG = "[BaseFragment]"

    override fun layoutId(): Int {
        Log.i(TAG, "Layout Id")
        return R.layout.activity_example
    }

    override fun attach(): Boolean {
        Log.i(TAG, "attach")
        return false
    }

    override fun init() {
        Log.i(TAG, "Initialize")
        /**
         * Initialize
         */
    }

    override fun stop() {
        Log.i(TAG, "Stop")
        /**
         * Service stop
         */
    }

}