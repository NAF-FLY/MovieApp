package com.example.movie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MovieDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)

        val button: TextView = findViewById(R.id.btn_back)

        button.setOnClickListener { moveToMainScreen(button) }
    }

    fun moveToMainScreen(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}