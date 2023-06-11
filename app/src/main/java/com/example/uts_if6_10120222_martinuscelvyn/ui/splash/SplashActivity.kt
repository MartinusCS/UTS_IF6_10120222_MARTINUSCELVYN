package com.example.uts_if6_10120222_martinuscelvyn.ui.splash

import android.content.Intent
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uts_if6_10120222_martinuscelvyn.MainActivity
import com.example.uts_if6_10120222_martinuscelvyn.R
import com.example.uts_if6_10120222_martinuscelvyn.ui.walktrought.walktroughActivity

class SplashActivity : AppCompatActivity() {

    private val splashScreenTimeout =
        1500L // Durasi splash screen dalam milidetik (di sini: 3 detik)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Handler untuk menunda pemindahan ke aktivitas berikutnya
        Handler().postDelayed({
            val intent = Intent(this, walktroughActivity::class.java)
            startActivity(intent)
            finish() // Menutup splash screen agar tidak bisa kembali ke sana dengan tombol "kembali"
        }, splashScreenTimeout)

}
}