package com.example.taptoincrease

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var initialValue = 0 // i created an initial value where my count will start and i gave it a value of 0

        // i called the button i created on my activity main and added a method called onClicklisterner ,which enables my button to be active
       button.setOnClickListener{
           initialValue ++ // this would add one to my initial value i created once you click the button

           numberText.text = initialValue.toString() //i assigned my initial value to my number text in my main activity and i made sure i converted my int to string before assignment.
       }

    }
}