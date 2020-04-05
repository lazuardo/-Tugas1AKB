package com.example.tugasakb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.text.HtmlCompat
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    private lateinit var button2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        button2 = findViewById(R.id.buttonmasuk)
        button2.setOnClickListener {
            startActivity(Intent(this, BioActivity::class.java))}
        val html = "Dengan menekan tombol masuk berarti Anda menyetujui<b> Ketentuan Pengguna</b> dan<b> Kebijakan Data</b> kami"
        textView4.text = HtmlCompat.fromHtml(html,HtmlCompat.FROM_HTML_MODE_LEGACY)
    }

}
