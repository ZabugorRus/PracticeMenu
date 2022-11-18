package com.example.menuofika

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    fun Content(view: View) {
        val username: EditText = findViewById(R.id.edit_user);
        val password: EditText = findViewById(R.id.edit_password)
        if (username.text.toString() == "6" && password.text.toString() == "1") {
            Toast.makeText(applicationContext, "Вход выполнен!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
