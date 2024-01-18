package com.example.mediapembelajaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.widget.ImageView

class videopembelajaran : AppCompatActivity() {
    private lateinit var back : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_videopembelajaran)
        back = findViewById(R.id.back)
        val webView : WebView = findViewById<WebView>(R.id.web_view)
        val webView2 : WebView = findViewById<WebView>(R.id.web_view2)
        val webView3 : WebView = findViewById<WebView>(R.id.web_view3)
        val webView4 : WebView = findViewById<WebView>(R.id.web_view4)
        val webView5 : WebView = findViewById<WebView>(R.id.web_view5)


        val video : String = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/954FEN7d5HI?si=Z9jUean25wRjYyd9\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>"
        val video2 : String = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/kA4VSbTW-NE?si=rdWSvqhZPF4t_G5X\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>"
        val video3 : String = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/85gLsvtxzbQ?si=t-0NZoGgGXy-Kp-o\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>"
        val video4 : String = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Sd6QQLYR4l4?si=PJk8ZbQrzIMa_leW\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>"
        val video5 : String = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/kyYgFIbAtA0?si=BRi1Z99QUhyqakau\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>"

        webView.loadData(video,"text/html","utf-8")
        webView.getSettings().javaScriptEnabled = true
        webView.webChromeClient = WebChromeClient()

        webView2.loadData(video2,"text/html","utf-8")
        webView2.getSettings().javaScriptEnabled = true
        webView2.webChromeClient = WebChromeClient()

        webView3.loadData(video3,"text/html","utf-8")
        webView3.getSettings().javaScriptEnabled = true
        webView3.webChromeClient = WebChromeClient()

        webView4.loadData(video4,"text/html","utf-8")
        webView4.getSettings().javaScriptEnabled = true
        webView4.webChromeClient = WebChromeClient()

        webView5.loadData(video5,"text/html","utf-8")
        webView5.getSettings().javaScriptEnabled = true
        webView5.webChromeClient = WebChromeClient()

        back.setOnClickListener {
            startActivity(Intent(this, daskbord::class.java))
        }
    }
}