package com.example.david.mykotlinproj

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mytxt.text = "start"

        btn_clear.setOnClickListener {
            mytxt.setText("")
        }
        btn_print_01.setOnClickListener{
            mytxt.setText("Print_01")
        }
        btn_print_02.setOnClickListener{
            mytxt.setText("Print_02")
        }
        btn_print_03.setOnClickListener{
            mytxt.setText("Print_03")
        }

    }
}
