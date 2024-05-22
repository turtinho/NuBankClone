package com.example.a2024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Transferir : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transferir)
    }
    fun ParaQuem(view: View){
        var intent = Intent(this,ParaQuem::class.java)
        startActivity(intent)
    }
}