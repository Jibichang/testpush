package com.example.aura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val str: String = "commit 2"
        val str2: String = "commit 3"
        val str3: String = "commit 4"
        val str4: String = "commit 5"
    }
}