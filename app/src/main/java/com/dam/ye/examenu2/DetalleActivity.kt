
package com.dam.ye.examenu2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetalleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle)

        val name = findViewById<TextView>(R.id.txtName)
        val letrag = findViewById<TextView>(R.id.txtLetraGenero)
        val genre = findViewById<TextView>(R.id.txtNombreGenero)
        val txtgen = findViewById<TextView>(R.id.txtGenre)

        var nombre = ""
        var genero = ""
        txtgen.text = "Genre"

        intent.extras?.let {
            nombre = it.getString("Name").toString()
            genero = it.getString("Genero").toString()
        }

        name.text = nombre
        letrag.text = genero

        when (genero){
            "a" -> genre.text = "Action"
            "c" -> genre.text = "Comedy"
            "d" -> genre.text = "Drama"
            "f" -> genre.text = "Fantasy"
        }


    }
}