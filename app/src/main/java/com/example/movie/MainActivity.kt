package com.example.movie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.btn_first)
        button.setOnClickListener { moveToMovieDetailScreen() }
    }

    private fun moveToMovieDetailScreen() {
        val intent = Intent(this, MovieDetailsActivity::class.java)
        startActivity(intent)
    }
}