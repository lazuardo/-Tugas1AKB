package com.example.tugasakb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_bio.*


class BioActivity : AppCompatActivity() {
    private lateinit var buttonljt: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bio)
        buttonljt = findViewById(R.id.buttonlanjut)
        buttonljt.setOnClickListener {
            startActivity(Intent(this, HaiActivity::class.java))
        }
    }
}
