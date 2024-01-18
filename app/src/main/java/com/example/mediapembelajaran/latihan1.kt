package com.example.mediapembelajaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class latihan1 : AppCompatActivity() {
    private lateinit var latihan1a : ImageView
    private lateinit var latihan1b : ImageView
    private lateinit var latihan1c : ImageView
    private lateinit var latihan1d : ImageView
    private lateinit var kembali : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan1)
        latihan1a = findViewById(R.id.latihan1a)
        latihan1b = findViewById(R.id.latihan1b)
        latihan1c = findViewById(R.id.latihan1c)
        latihan1d = findViewById(R.id.latihan1d)
        kembali = findViewById(R.id.back)

        latihan1a.setOnClickListener {
            startActivity(Intent(this, wrong16::class.java))
        }
        latihan1b.setOnClickListener {
            startActivity(Intent(this, wrong16::class.java))
        }
        latihan1c.setOnClickListener {
            startActivity(Intent(this, correct16::class.java))
        }
        latihan1d.setOnClickListener {
            startActivity(Intent(this, wrong16::class.java))
        }
        kembali.setOnClickListener {
            startActivity(Intent(this, latihan::class.java))
        }
    }
}