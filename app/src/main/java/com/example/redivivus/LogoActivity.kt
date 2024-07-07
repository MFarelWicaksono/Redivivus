package com.example.redivivus

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class LogoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logo)

        // Move to LoginActivity after 2 seconds
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}