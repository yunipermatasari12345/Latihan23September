package com.mobile.ltihan23september

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var  btnMI : Button
    private lateinit var  btnTK : Button
    private lateinit var  btnGalery : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnMI = findViewById(R.id.btnMI)
        btnTK = findViewById(R.id.btnTK)
        btnGalery = findViewById(R.id.btnGP)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnMI.setOnClickListener(){
            val intentPassingData = Intent(this@MainActivity,ManajemenInformatika::class.java)
            startActivity(intentPassingData)
        }
        btnTK.setOnClickListener(){
            val intentPassingData = Intent(this@MainActivity,TeknikKomputer::class.java)
            startActivity(intentPassingData)
        }
        btnGalery.setOnClickListener(){
            val intentPassingData = Intent(this@MainActivity,GaleryActivity::class.java)
            startActivity(intentPassingData)
        }

    }
}