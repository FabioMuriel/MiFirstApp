package com.example.fabiomaster

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.fabiomaster.firstapp.FisrtAppActivity
import com.example.fabiomaster.imccalculator.imcCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaluApp = findViewById<Button>(R.id.btnSaluApp)
        val btnImcApp = findViewById<Button>(R.id.btnImcApp)

        btnSaluApp.setOnClickListener { navigateToSaludaApp() }
        btnImcApp.setOnClickListener { navigateTobtnImcApp() }
    }

    private fun navigateTobtnImcApp() {
        val intent = Intent(this, imcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludaApp() {
        val intent = Intent(this, FisrtAppActivity::class.java)
        startActivity(intent)
    }
}