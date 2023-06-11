package com.example.uts_if6_10120222_martinuscelvyn.ui.walktrought

import android.content.Intent
import android.os.Handler
import androidx.viewpager2.widget.ViewPager2
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uts_if6_10120222_martinuscelvyn.R

class walktroughActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var walkthroughA: walktroughA


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_walktrough)

    viewPager = findViewById(R.id.viewPager)

    val fragments = listOf(
        walktrought1(),
        walktrought2(),
        walktrought3(),
        walktrought4(),
    )

    walkthroughA = walktroughA(this, fragments)
    viewPager.adapter = walkthroughA

    // Tambahkan kode lain yang diperlukan untuk mengatur tampilan WalkthroughActivity
}
}
