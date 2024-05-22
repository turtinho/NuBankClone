package com.example.a2024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Como : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_como)
    }
        fun abrirRevise(view: View){
        var intent = Intent(this,Revise::class.java)
        startActivity(intent)
    }
}