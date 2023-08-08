package com.example.advanceparty

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.example.advanceparty.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private var isOpened = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViewPager()

        val floatBtn04AniOut = ObjectAnimator.ofFloat(binding.floating04, "translationY", -200f).setDuration(500)
        val floatBtn04AniIn = ObjectAnimator.ofFloat(binding.floating04, "translationY", 0f).setDuration(500)

        binding.floating01.setOnClickListener {
            if(isOpened) {
                binding.floating01.setImageResource(R.drawable.baseline_add_circle_24)
                floatBtn04AniIn.start()
            } else {
                binding.floating01.setImageResource(R.drawable.baseline_arrow_circle_down_24)
                floatBtn04AniOut.start()
            }
            isOpened = !isOpened
            }
        binding.floating04.setOnClickListener { Toast.makeText(applicationContext, "Good!", Toast.LENGTH_SHORT).show() }
    }

    private fun initViewPager() {
        //ViewPager2 Adapter 셋팅
        var viewPager2Adatper = ViewPager2Adapter(this)
        viewPager2Adatper.addFragment(ToDo())
        viewPager2Adatper.addFragment(BookMark())

        //Adapter 연결
        binding.vpViewpagerMain.apply {
            adapter = viewPager2Adatper

            registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                }
            })
        }

        //ViewPager, TabLayout 연결
        TabLayoutMediator(binding.tlNavigationView, binding.vpViewpagerMain) { tab, position ->
            Log.e("YMC", "ViewPager position: ${position}")
            when (position) {
                0 -> tab.text = "ToDo"
                1 -> tab.text = "BookMark"

            }
        }.attach()
    }

}
