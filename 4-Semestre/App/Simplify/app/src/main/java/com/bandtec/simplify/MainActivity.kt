package com.bandtec.simplify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnEstudante = findViewById<Button>(R.id.btnStudent)

        btnEstudante.setOnClickListener{
           startActivity(Intent(this@MainActivity, LoginEstudante::class.java))
       }

    }


}