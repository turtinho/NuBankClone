package com.example.a2024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Comprovante : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comprovante)
    }
    fun abrirMain(view: View){
        var intent = Intent(this,NubankMain::class.java)
        startActivity(intent)
    }
}