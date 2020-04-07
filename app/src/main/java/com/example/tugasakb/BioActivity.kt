package com.example.tugasakb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_bio.*


class BioActivity : AppCompatActivity() {
    lateinit var buttonljt: Button
    lateinit var editText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bio)

        buttonljt = findViewById(R.id.buttonlanjut)
        editText = findViewById(R.id.editTextNama)
        buttonljt.setOnClickListener {
            val intent = Intent(this, HaiActivity::class.java)
            intent.putExtra("username", editText.text.toString())
            startActivity(intent)
        }
    }
}
