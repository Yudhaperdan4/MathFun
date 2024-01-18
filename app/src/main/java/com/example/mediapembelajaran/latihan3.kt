package com.example.mediapembelajaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class latihan3 : AppCompatActivity() {
    private lateinit var latihan2a : ImageView
    private lateinit var latihan2b : ImageView
    private lateinit var latihan2c : ImageView
    private lateinit var latihan2d : ImageView
    private lateinit var kembali : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan3)
        latihan2a = findViewById(R.id.latihan2a)
        latihan2b = findViewById(R.id.latihan2b)
        latihan2c = findViewById(R.id.latihan2c)
        latihan2d = findViewById(R.id.latihan2d)
        kembali = findViewById(R.id.back)

        latihan2a.setOnClickListener {
            startActivity(Intent(this, wrong17::class.java))
        }
        latihan2b.setOnClickListener {
            startActivity(Intent(this, correct17::class.java))
        }
        latihan2c.setOnClickListener {
            startActivity(Intent(this, wrong17::class.java))
        }
        latihan2d.setOnClickListener {
            startActivity(Intent(this, wrong17::class.java))
        }
        kembali.setOnClickListener {
            startActivity(Intent(this, latihan::class.java))
        }
    }
}