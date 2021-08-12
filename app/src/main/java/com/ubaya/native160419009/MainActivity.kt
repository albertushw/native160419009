package com.ubaya.native160419009

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var nama:String = "Albert"
    private var phone:String = "081225267657"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Welcome to Android $nama",Toast.LENGTH_SHORT).show()
    }
}