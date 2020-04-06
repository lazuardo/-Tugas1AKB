package com.example.tugasakb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputFilter
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import androidx.core.text.HtmlCompat
import kotlinx.android.synthetic.main.activity_login.*
import android.text.Editable
import android.text.TextWatcher
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T


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

        // Force CAPS Edit Text
        editText5.addTextChangedListener(object : TextWatcher {

            override fun onTextChanged(arg0: CharSequence, arg1: Int, arg2: Int, arg3: Int) {

            }

            override fun beforeTextChanged(
                arg0: CharSequence, arg1: Int, arg2: Int,
                arg3: Int
            ) {
            }

            override fun afterTextChanged(et: Editable) {
                var s = et.toString()
                if (s != s.toUpperCase()) {
                    s = s.toUpperCase()
                    editText5.setText(s)
                    editText5.setSelection(editText5.length()) //fix reverse texting
                }
            }
        })
    }



}
