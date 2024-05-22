package com.example.a2024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Transferindo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transferindo)
    }
    fun abrirComo(view: View){
        var intent = Intent(this,Como::class.java)
        startActivity(intent)
    }
}