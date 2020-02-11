package com.parasde.example.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

abstract class BaseFragment: Fragment() {
    protected abstract fun layoutId(): Int
    protected abstract fun attach(): Boolean
    // view 가 생성되고 난 후 호출
    protected abstract fun init()
    // Fragment 가 종료될 때 호출
    protected abstract fun stop()

    override fun onDetach() {
        super.onDetach()
        stop()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(layoutId(), container, attach())
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        init()
    }
}
