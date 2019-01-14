package com.example.david.mykotlinproj

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*
import kotlin.math.max
import kotlin.math.min

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var min : Int = 0
        var max : Int = 0
        val resultText = "Result :"


        btn_result01.setOnClickListener{
            text_result01.text = "$resultText ${find_max(Integer.parseInt(edt_01.text.toString()), Integer.parseInt(edt_02.text.toString()) ).toString()}"
        }
        btn_result02.setOnClickListener{
            text_result01.text = "$resultText ${find_min(Integer.parseInt(edt_01.text.toString()), Integer.parseInt(edt_02.text.toString()) ).toString()}"
        }
        btn_result03.setOnClickListener{
            text_result01.text = "$resultText ${find_mul(Integer.parseInt(edt_01.text.toString()), Integer.parseInt(edt_02.text.toString()) ).toString()}"
        }
    }
    fun find_max(a : Int,b : Int) : Int {
        return max(a,b)
    }
    fun find_min(a : Int,b : Int) : Int {
        return min(a,b)
    }
    fun find_mul(a : Int,b : Int) : Int {
        return a*b
    }
}
