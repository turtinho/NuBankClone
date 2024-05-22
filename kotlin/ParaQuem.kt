package com.example.a2024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ParaQuem : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_para_quem)
    }
    fun abrirTransferirindo(view: View){
        var intent = Intent(this,Transferindo::class.java)
        startActivity(intent)
    }
}