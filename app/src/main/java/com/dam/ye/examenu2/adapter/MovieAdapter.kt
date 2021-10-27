package com.dam.ye.examenu2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dam.ye.examenu2.R
import com.dam.ye.examenu2.databinding.ItemMovieBinding
import com.dam.ye.examenu2.model.Movie

class MovieAdapter(private val dataset: List<Movie>, private val listener: (Movie) -> Unit ) : RecyclerView.Adapter<MovieAdapter.ViewHolder>(){

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
         val binding = ItemMovieBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_movie, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movie = dataset[position]

        with(holder) {
            binding.root.setOnClickListener {
                listener(movie)
            }
            binding.txtMovieName.text = movie.name
            binding.txtMovieGenre.text = movie.genre
            binding.txtMovieInfo.text = movie.information
        }
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}