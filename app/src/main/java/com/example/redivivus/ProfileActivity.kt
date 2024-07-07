package com.example.redivivus

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Handle back button click
        val backButton: ImageView = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            finish()
        }

        // Handle edit profile image click
        val editProfileImage: ImageView = findViewById(R.id.editProfileImage)
        editProfileImage.setOnClickListener {
            // Handle edit profile picture logic here
        }

        // Handle other options clicks
        // Add similar listeners for other options if needed
    }
}