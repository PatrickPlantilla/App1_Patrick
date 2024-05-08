package com.example.gehenners

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.TextView
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
val textView=findViewById<TextView>(R.id.textView)

        val animation = AnimationUtils.loadAnimation(this, R.anim.anim)
        textView.startAnimation(animation)

        val textView2=findViewById<TextView>(R.id.textView2)
        val animation2 = AnimationUtils.loadAnimation(this, R.anim.anim2)
        textView2.startAnimation(animation2)

        val textView3=findViewById<TextView>(R.id.textView3)
        val animation3 = AnimationUtils.loadAnimation(this, R.anim.anim3)
        textView3.startAnimation(animation3)

        val button=findViewById<TextView>(R.id.button)
        val anime4 = AnimationUtils.loadAnimation(this, R.anim.anim)
        button.setOnClickListener {
            button.startAnimation(anime4)
        }
    }
}