package com.example.pc.myapplication.feature

import android.content.Intent
import android.content.Intent.ACTION_CALL
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val CallButton = findViewById<Button>(R.id.CallButton)
        val PakuNo = "18408041180691"

        CallButton.setOnClickListener {

            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$PakuNo"))
            startActivity(intent)

        }
    }
}
