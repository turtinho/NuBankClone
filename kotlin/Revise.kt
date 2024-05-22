package com.example.a2024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Revise : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_revise)
    }
        fun abrirContinuar(view: View){
        var intent = Intent(this,Continuar::class.java)
        startActivity(intent)
    }
}