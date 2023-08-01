package com.example.helloworld

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var counterA:Int = 0
        var counterB:Int = 0

        var imageView1: ImageView = findViewById(R.id.imageView1)
        imageView1.setImageResource(R.drawable.ani1)
        var imageView2: ImageView = findViewById(R.id.imageView2)
        imageView2.setImageResource(R.drawable.ani2)
        var imageView3: ImageView = findViewById(R.id.imageView3)
        imageView3.setImageResource(R.drawable.ani3)
        var imageView4: ImageView = findViewById(R.id.imageView4)
        imageView4.setImageResource(R.drawable.ani4)
        var imageView5: ImageView = findViewById(R.id.imageView5)
        imageView5.setImageResource(R.drawable.ani5)
        var imageView6: ImageView = findViewById(R.id.imageView6)
        imageView6.setImageResource(R.drawable.ani6)
        var imageView7: ImageView = findViewById(R.id.imageView7)
        imageView7.setImageResource(R.drawable.ani7)
        var imageView8: ImageView = findViewById(R.id.imageView8)
        imageView8.setImageResource(R.drawable.ani8)

        val TextResultA = findViewById<TextView>(R.id.TextResult1) //결과 값
        val BtnA = findViewById<Button>(R.id.button1)
        val TextResultB = findViewById<TextView>(R.id.TextResult2) //결과 값
        val BtnB = findViewById<Button>(R.id.button2)


        BtnA.setOnClickListener {
            counterA++ //숫자는 1증가
            TextResultA.text= counterA.toString()
        }

        BtnB.setOnClickListener {
            counterB++ //숫자는 1증가
            TextResultB.text= counterB.toString()
        }
    }
}

