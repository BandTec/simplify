package com.bandtec.simplify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        Handler().postDelayed({

            //criando a intent


            //redireciona para a login/mainActivity
            startActivity(Intent(this@SplashActivity,MainActivity::class.java))

            finish()

        },3000)
    }
}