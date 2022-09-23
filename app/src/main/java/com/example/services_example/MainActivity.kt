package com.example.services_example

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStart.setOnClickListener {
            Intent(this, MyService::class.java).also {
                startService(it)
                txtServiceStatus.text = "Service Running..."
            }
        }

        btnStop.setOnClickListener {
            MyService.stopService()
            txtServiceStatus.text = "Service Stopped..."
        }
    }
}



















