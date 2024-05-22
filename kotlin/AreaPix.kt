package com.example.a2024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AreaPix : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_pix)
    }
    fun abrirTransferir(view: View){
        var intent = Intent(this,Transferir::class.java)
        startActivity(intent)
    }
}