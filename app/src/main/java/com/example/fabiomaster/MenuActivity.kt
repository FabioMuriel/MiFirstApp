package com.example.fabiomaster

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.fabiomaster.firstapp.FisrtAppActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaluApp = findViewById<Button>(R.id.btnSaluApp)

        btnSaluApp.setOnClickListener { navigateToSaludaApp() }
    }

    private fun navigateToSaludaApp() {
        val intent = Intent(this, FisrtAppActivity::class.java)
        startActivity(intent)
    }
}