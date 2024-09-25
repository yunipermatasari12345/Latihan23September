package com.mobile.ltihan23september

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ManajemenInformatika : AppCompatActivity() {
    private lateinit var  btnBackMI : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_manajemen_informatika)
        btnBackMI = findViewById(R.id.btnBack)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnBackMI.setOnClickListener(){
            val intentPassingData = Intent(this@ManajemenInformatika,MainActivity::class.java)
            startActivity(intentPassingData)
        }

    }
}