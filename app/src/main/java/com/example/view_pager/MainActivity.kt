package com.example.view_pager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager2:ViewPager2 = findViewById(R.id.viewPager2)
        val images = listOf(R.drawable.toucan,R.drawable.red_panda,R.drawable.macaw,R.drawable.tiger,R.drawable.red_panda2,R.drawable.meerkat,R.drawable.dog,R.drawable.owl,R.drawable.panda )

        viewPager2.adapter = ViewPagerAdapter(images)
    }
}