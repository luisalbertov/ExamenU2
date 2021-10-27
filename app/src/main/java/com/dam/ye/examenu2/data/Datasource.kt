package com.dam.ye.examenu2.data

import com.dam.ye.examenu2.model.Movie

class Datasource {
    fun cargarPeliculas() : List <Movie> {
        return listOf<Movie>(
            Movie("Pelicula 1","Luis Alberto","a","2019"),
            Movie("Pelicula 2","Rocio Sanchez","c","2018"),
            Movie("Pelicula 3","Jesus Millan","d","2020"),
            Movie("Pelicula 4","Oscar Nunez","f","2005"),
            Movie("Pelicula 5","Jessica Alvarez","c","2007"),
        )
    }
}