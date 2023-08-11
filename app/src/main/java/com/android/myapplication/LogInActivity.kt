package com.android.myapplication

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LogInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btn = findViewById<Button>(R.id.btnLoginActivity)
        btn.setOnClickListener {

            val id = findViewById<TextView>(R.id.id_field);
            val password = findViewById<TextView>(R.id.password_field);
            if (id.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()) {
                val intent = Intent(this, HomeActivity::class.java)
                val strdata_Login = id.text.toString()
                Toast.makeText(this, "Log-in Succeed", Toast.LENGTH_SHORT).show()
                intent.putExtra("id", strdata_Login)
                startActivity(intent)
            } else
                Toast.makeText(this, "Please enter again.", Toast.LENGTH_SHORT).show()
        }

        val btn2 = findViewById<Button>(R.id.btnSignupActivity)
        btn2.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivityForResult(intent, 1)

            Toast.makeText(this, "Proceed to membership registration", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val id = findViewById<TextView>(R.id.id_field);
        val password = findViewById<TextView>(R.id.password_field);
        if (requestCode == 1) {
            if (resultCode == Activity.RESULT_OK) {
                val strdata_id = data?.getStringExtra("id")
                val strdata_pw = data?.getStringExtra("pw")
                id.setText(strdata_id)
                password.setText(strdata_pw)
            }
        }
    }
}

