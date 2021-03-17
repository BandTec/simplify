package com.bandtec.simplify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.bandtec.simplify.ApiUpload.Upload

class HomeEstudante : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_estudante)

        val btnSubirArquivo = findViewById<Button>(R.id.btnUpload)

        btnSubirArquivo.setOnClickListener{
            startActivity(Intent(this@HomeEstudante, Upload::class.java))
        }
    }
}