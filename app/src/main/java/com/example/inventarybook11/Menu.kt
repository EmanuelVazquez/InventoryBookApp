package com.example.inventarybook11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

    }

    fun newPaper(view: View) {
        val intent = Intent(this,NuevaHoja::class.java)
        startActivity(intent)
    }
}