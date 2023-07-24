package com.example.cexme_sdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sdkcexme.CexmeSDK

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sdk = CexmeSDK()

    }
}