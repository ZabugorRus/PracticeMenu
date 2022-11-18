package com.example.menuofika

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class CreateOrder : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_order)
        lateinit var tablenum: EditText
        lateinit var questnum: EditText
        lateinit var mainB: Button
        mainB = findViewById(R.id.numquest2)
        tablenum = findViewById(R.id.tabblenumber)
        questnum = findViewById(R.id.numquest)

        // on below line we are adding
        // click listener for our button
        mainB.setOnClickListener {
            // on below line we are getting
            // data from edit text
            val msg = tablenum.text.toString()
            val msg2 = questnum.text.toString()

            // on below line we are creating a new
            // intent to open a new activity.
            val i = Intent(this, MainActivity::class.java)

            // on below line we are passing
            // data to our new activity.
            i.putExtra("message", msg)
            i.putExtra("message2", msg2)

            // on below line we are
            // starting a new activity.
            startActivity(i)
    }
}
}