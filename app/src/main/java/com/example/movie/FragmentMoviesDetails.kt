package com.example.movie

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentMoviesDetails : Fragment() {

    private var listener : MovieDetailListener? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_movies_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.btn_back).setOnClickListener {
            listener?.toMoviesList()
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as? MovieDetailListener
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    interface MovieDetailListener {
        fun toMoviesList()
    }
}