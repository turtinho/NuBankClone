package com.example.a2024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Continuar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_continuar)
    }
        fun abrirComprovante(view: View){
        var intent = Intent(this,Comprovante::class.java)
        startActivity(intent)
    }
}