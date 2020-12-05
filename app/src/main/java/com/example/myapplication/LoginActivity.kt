package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val loginButton = findViewById<Button>(R.id.btn_Login)
        val textEmail = findViewById<EditText>(R.id.edtxt_email)
        val textPassowrd = findViewById<EditText>(R.id.edtxt_password)


        loginButton.setOnClickListener{
            evaluateCredencials(textEmail.text.toString(), textPassowrd.text.toString())
        }
    }

    private fun evaluateCredencials(email: String, password: String) {
        //Toast.makeText(this, "Pres Login Button", Toast.LENGTH_LONG).show()
    }
}