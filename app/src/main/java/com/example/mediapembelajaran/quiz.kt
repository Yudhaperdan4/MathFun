package com.example.mediapembelajaran

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.mediapembelajaran.R.id.back
import com.example.mediapembelajaran.R.id.lv1

class quiz : AppCompatActivity() {
    private lateinit var lv1 : ImageView
    private lateinit var lv2 : ImageView
    private lateinit var back : ImageView
    private lateinit var lv3 : ImageView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        lv1 = findViewById(R.id.lv1)
        lv2 = findViewById(R.id.lv2)
        back = findViewById(R.id.back)
        lv3 = findViewById(R.id.lv3)

        lv1.setOnClickListener {
            startActivity(Intent(this, quiz1::class.java))
        }
        lv2.setOnClickListener {
            startActivity(Intent(this, quiz6::class.java))
        }
        back.setOnClickListener {
            startActivity(Intent(this, daskbord::class.java))
        }
        lv3.setOnClickListener {
            startActivity(Intent(this, quiz11::class.java))
        }
    }
}