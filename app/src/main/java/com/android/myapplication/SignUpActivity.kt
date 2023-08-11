package com.android.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val btn = findViewById<Button>(R.id.btnSignupActivity)

        btn.setOnClickListener {
            val name = findViewById<EditText>(R.id.name_field)
            val id = findViewById<EditText>(R.id.id_field)
            val password = findViewById<EditText>(R.id.pw_filed)

            if (name.text.toString().isNotEmpty() && id.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()) {
Toast.makeText(this, "Membership registration is complete.", Toast.LENGTH_SHORT).show()

                val data = Intent()
                data.putExtra("id", id.getText().toString());
                data.putExtra("pw", password.getText().toString());
                setResult(RESULT_OK, data)
                finish()
            } else
                Toast.makeText(this, "There is information that has not been entered.", Toast.LENGTH_SHORT).show()
        }
    }
}
