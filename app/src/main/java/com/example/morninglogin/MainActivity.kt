package com.example.morninglogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textlogin:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textlogin=findViewById(R.id.Txt_GotoLogin)

        textlogin.setOnClickListener {
            val intent= Intent(this,loginActivity::class.java)
            startActivity(intent)
        }
    }
}