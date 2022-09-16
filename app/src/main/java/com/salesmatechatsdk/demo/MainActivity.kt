package com.salesmatechatsdk.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.rapidops.salesmatechatsdk.core.SalesmateChatSDK

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStartChat = findViewById<TextView>(R.id.btnStartChat)
        btnStartChat.setOnClickListener {
            SalesmateChatSDK.getInstance().startMessenger()
        }

        
    }
}