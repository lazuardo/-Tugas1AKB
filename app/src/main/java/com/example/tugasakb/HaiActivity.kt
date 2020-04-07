package com.example.tugasakb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HaiActivity : AppCompatActivity() {
    private lateinit var buttonk: Button
    lateinit var myTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hai)
        myTextView = findViewById(R.id.textView7)
        val name = intent.getStringExtra("username")
        myTextView.text = "Beres! Sekarang " + name + " udah bisa ngecek penggunaan HP " + name + " tiap hari buat bantu " + name + " ngatur waktu :)"

        buttonk = findViewById(R.id.buttonOke)
        buttonk.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
