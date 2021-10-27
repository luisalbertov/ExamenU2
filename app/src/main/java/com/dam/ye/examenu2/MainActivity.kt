package com.dam.ye.examenu2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dam.ye.examenu2.adapter.MovieAdapter
import com.dam.ye.examenu2.data.Datasource
import com.dam.ye.examenu2.databinding.ActivityMainBinding
import com.dam.ye.examenu2.model.Movie

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: MovieAdapter
    private lateinit var linearLayout: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = MovieAdapter(Datasource().cargarPeliculas()){
            onClick(it)
        }

        linearLayout = LinearLayoutManager(this)

        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.layoutManager = linearLayout
        binding.recyclerView.adapter = adapter
    }
    private fun onClick(it: Movie){
        val intent = Intent(this,DetalleActivity::class.java)
        intent.putExtra("Genero",it.genre)
        intent.putExtra("Name",it.name)
        startActivity(intent)
    }
}