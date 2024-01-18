package com.example.mediapembelajaran

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView


class daskbord : AppCompatActivity(){
    private lateinit var quizdaskbord : ImageView
    private lateinit var latihandaskbord : ImageView
    private lateinit var materidaskbord : ImageView
    private lateinit var quizlv1 : ImageView
    private lateinit var quizlv2 : ImageView
    private lateinit var subs : ImageView
    private lateinit var eli : ImageView
    private lateinit var berlatih : ImageView
    private lateinit var vidio : ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daskbord)
        quizdaskbord = findViewById(R.id.quizdaskbord)
        latihandaskbord = findViewById(R.id.latihandaskbord)
        materidaskbord = findViewById(R.id.materidaskbord)
        quizlv1 = findViewById(R.id.quizlv1)
        quizlv2 = findViewById(R.id.quizlv2)
        subs = findViewById(R.id.subs)
        eli = findViewById(R.id.eli)
        berlatih = findViewById(R.id.berlatih)
        vidio = findViewById(R.id.vidio)


        quizdaskbord.setOnClickListener {
            startActivity(Intent(this, quiz::class.java))
        }

        latihandaskbord.setOnClickListener{
            startActivity(Intent(this, latihan::class.java))
        }

        materidaskbord.setOnClickListener{
            startActivity(Intent(this, materi::class.java))
        }
        quizlv1.setOnClickListener {
            startActivity(Intent(this, quiz1::class.java))
        }
        quizlv2.setOnClickListener {
            startActivity(Intent(this, quiz6::class.java))
        }
        subs.setOnClickListener {
            startActivity(Intent(this, metodesubstitusi::class.java))
        }
        eli.setOnClickListener {
            startActivity(Intent(this, metodeeliminasi::class.java))
        }
        berlatih.setOnClickListener {
            startActivity(Intent(this, latihan1::class.java))
        }
        vidio.setOnClickListener {
            startActivity(Intent(this, videopembelajaran::class.java))
        }

    }

}