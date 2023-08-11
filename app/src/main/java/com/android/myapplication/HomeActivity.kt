package com.android.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val strData = intent.getStringExtra("id")
        val editText = findViewById<TextView>(R.id.id_show)
        editText.setText(strData)

        val btn_quit = findViewById<Button>(R.id.buttonHomeActivity)
        btn_quit.setOnClickListener {
            finish()
        }
    }
}