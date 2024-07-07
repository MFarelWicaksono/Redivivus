package com.example.redivivus

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    // Declare UI elements
    private var emailEditText: EditText? = null
    private var passwordEditText: EditText? = null
    private var loginButton: Button? = null
    private var registerTextView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Initialize UI elements
        emailEditText = findViewById(R.id.emailEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        loginButton = findViewById(R.id.loginButton)
        registerTextView = findViewById(R.id.registerTextView)

        // Set up listeners
        loginButton?.setOnClickListener(View.OnClickListener { // Handle login button click
            val email = emailEditText?.getText().toString()
            val password = passwordEditText?.getText().toString()

            // Implement login logic here

            // Navigate to DashboardActivity
            val intent = Intent(
                this@MainActivity,
                DashboardActivity::class.java
            )
            startActivity(intent)
        })

        registerTextView?.setOnClickListener(View.OnClickListener { // Handle register text view click
            // Navigate to RegisterActivity
            val intent = Intent(
                this@MainActivity,
                RegisterActivity::class.java
            )
            startActivity(intent)
        })
    }
}