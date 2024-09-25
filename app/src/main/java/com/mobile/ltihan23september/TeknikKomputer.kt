package com.mobile.ltihan23september

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TeknikKomputer : AppCompatActivity() {
    private lateinit var  btnBackTK : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_teknik_komputer)
        btnBackTK = findViewById(R.id.btnBack2)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnBackTK.setOnClickListener(){
            val intentPassingData = Intent(this@TeknikKomputer,MainActivity::class.java)
            startActivity(intentPassingData)
        }
    }
}