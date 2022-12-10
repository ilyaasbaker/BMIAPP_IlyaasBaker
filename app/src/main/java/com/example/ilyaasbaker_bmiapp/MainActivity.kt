package com.example.ilyaasbaker_bmiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val weight= findViewById<EditText>(R.id.editTextNumber)
        val height= findViewById<EditText>(R.id.editTextNumber2)
        val bmi= findViewById<TextView>(R.id.textView2)
        val btn= findViewById<Button>(R.id.button)
        btn.setOnClickListener{
            val weight1=weight.text.toString().toInt()
            val height1=height.text.toString().toInt()

            val formula=(weight1/height1/height1)*10000
            bmi.setText("Your BMI(Body Mass Index) is "+formula.toString())

        }
    }
}