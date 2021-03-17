package com.bandtec.simplify.ApiUpload

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bandtec.simplify.R

class DetailsActivity : AppCompatActivity() {

    lateinit var tvUrl: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upload_url)
        val imgurUrl = intent.getStringExtra("details_link")
        tvUrl = findViewById(R.id.imgur_url_textview)
        tvUrl.text = imgurUrl
    }
}