package com.parasde.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.parasde.example.fragment.ExampleFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.mContainer, ExampleFragment(), "example").commit()
    }
}
