package com.example.services_example

import android.app.IntentService
import android.content.Intent
import android.util.Log

class MyService : IntentService("MyIntentService") {

    init {
        instance = this
    }

    companion object {
        private lateinit var instance: MyService
        var isRunning = false

        fun stopService(){
            Log.d("MyService", "Service is Stopping...")
            isRunning = false
            instance.stopSelf()
        }
    }

    override fun onHandleIntent(p0: Intent?) {
        try {
            isRunning = true
            while(isRunning){
                Log.d("MyService", "Service is Running...")
                Thread.sleep(1000)
            }
        } catch (E: InterruptedException) {
            Thread.currentThread().interrupt()
        }
    }
}


























