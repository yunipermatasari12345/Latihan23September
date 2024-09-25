package com.mobile.ltihan23september

import adapter.GaleryAdapter
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import model.ModelGalery

class GaleryActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var movieAdapter: GaleryAdapter? = null
    private var movieList = mutableListOf<ModelGalery>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_galery)

        movieList = ArrayList()
        recyclerView = findViewById(R.id.rv_galery)
        movieAdapter = GaleryAdapter(this,movieList)

        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager (
            this,2
        )

        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = movieAdapter

        prepareMovieList()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.rv_galery)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun prepareMovieList(){
        var movie = ModelGalery("PNP", R.drawable.d1)
        movieList.add(movie)

        movie = ModelGalery("PNP2", R.drawable.d2)
        movieList.add(movie)

        movie = ModelGalery("PNP3", R.drawable.d3)
        movieList.add(movie)

        movie = ModelGalery("Diklat", R.drawable.d4)
        movieList.add(movie)

        movie = ModelGalery("Penerimaan", R.drawable.d5)
        movieList.add(movie)

    }
}