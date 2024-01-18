package com.example.mediapembelajaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class materi : AppCompatActivity() {
    private lateinit var grafik : ImageView
    private lateinit var substitusi : ImageView
    private lateinit var eliminasi : ImageView
    private lateinit var campuran : ImageView
    private lateinit var back : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi)
        grafik = findViewById(R.id.grafik)
        substitusi = findViewById(R.id.substitusi)
        eliminasi = findViewById(R.id.eliminasi)
        campuran = findViewById(R.id.campuran)
        back = findViewById(R.id.back)

        grafik.setOnClickListener {
            startActivity(Intent(this, metodegrafik::class.java))
        }

        substitusi.setOnClickListener {
            startActivity(Intent(this, metodesubstitusi::class.java))
        }

        eliminasi.setOnClickListener {
            startActivity(Intent(this, metodeeliminasi::class.java))
        }

        campuran.setOnClickListener {
            startActivity(Intent(this, metodecampuran::class.java))
        }
        back.setOnClickListener {
            startActivity(Intent(this, daskbord::class.java))
        }
    }
}