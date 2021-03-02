package com.bandtec.simplify

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginEstudante : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_estudante)
        val btnHome = findViewById<Button>(R.id.btnLogin)


        btnHome.setOnClickListener(){
            startActivity(Intent(this@LoginEstudante,HomeEstudante::class.java))
        }
    }

}