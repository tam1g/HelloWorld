package com.example.tamiemiyagawa.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val result = findViewById(R.id.textView3) as TextView
        val btnAdd = findViewById(R.id.button) as Button
        val btnMinus = findViewById(R.id.button2) as Button
        val btnMul = findViewById(R.id.button3) as Button
        val btnDiv = findViewById(R.id.button4) as Button

        btnAdd.setOnClickListener {
            result.text = (getNumber() + getNumberTwo()).toString()
        }
        btnMinus.setOnClickListener {
            result.text = "0"
            result.text = (getNumber() - getNumberTwo()).toString()
        }
        btnMul.setOnClickListener {
            result.text = "0"
            result.text = (getNumber() * getNumberTwo()).toString()
        }
        btnDiv.setOnClickListener {
            result.text = "0"
            result.text = (getNumber() / getNumberTwo()).toString()
        }
    }

    fun getNumber() : Int{
        val inputNumber = findViewById(R.id.editText) as EditText
        return Integer.parseInt(inputNumber.text.toString())
    }

    fun getNumberTwo() : Int{
        val inputNumberTwo = findViewById(R.id.editText2) as EditText
        return Integer.parseInt(inputNumberTwo.text.toString())
    }
}
