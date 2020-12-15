package com.example.movie

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(), FragmentMoviesList.MoviesListListener, FragmentMoviesDetails.MovieDetailListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState==null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_main, FragmentMoviesList())
                .commit()
        }
    }

    override fun toMovieDetail() {
        supportFragmentManager.beginTransaction()
            .addToBackStack(null)
            .add(R.id.fragment_main, FragmentMoviesDetails())
            .commit()
    }

    override fun toMoviesList() {
        supportFragmentManager.popBackStack()
    }

}


