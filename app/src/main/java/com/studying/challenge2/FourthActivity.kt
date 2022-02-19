package com.studying.challenge2

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        val nextActivity: Button = findViewById(R.id.loginButton)
        nextActivity.setOnClickListener {
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show()

        }
    }
}