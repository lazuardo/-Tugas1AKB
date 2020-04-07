package com.example.tugasakb

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

/*
 NIM    : 10117160
 Nama   : Juan Lazuardo
 Kelas  : AKB-4 / IF-4
 Tugas  : AKB Pemananasan 1

 Update :
    - 4 April 2020 = Membuat Tampilan Awal ( Welcome)

    - 5 April 2020 = - Membuat Tampilan 2 ( Login )
                     - Upload github

    - 6 April 2020 = - Membuat Tampilan 3 (Biodata)
                     - Membuat EditText pada pengisian Kode Keluarga menjadi CAPSLOCK
                     - Membuat Tampilan 4 ( Say Hai)
                     - Merubah Icon Apikasi
                     - Update Github

    - 7 April 2020 = - Membuat GetText dan SetText untuk textView di halaman Say Hai agar kata " Kamu "
                       terganti dengan inout text di halaman biodata.
                     - Merilis APK dengan Generate Signed APK

*/
class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.buttonmulai)
        button.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}
