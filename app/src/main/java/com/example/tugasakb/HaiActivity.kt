package com.example.tugasakb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HaiActivity : AppCompatActivity() {
    private lateinit var buttonk: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hai)

        buttonk = findViewById(R.id.buttonOke)
        buttonk.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
