package com.example.andby.onemoretest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        btn_login.setOnClickListener({
            val name = userName.text.toString()
            val pass = passWord.text.toString()

        })
    }
}
