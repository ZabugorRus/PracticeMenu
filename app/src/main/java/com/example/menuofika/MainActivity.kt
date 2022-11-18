package com.example.menuofika

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var table: TextView
        lateinit var numq: TextView

        // on below line we are initializing our variable.
        table = findViewById(R.id.table)
        numq = findViewById(R.id.numq)

        // on below line we are setting our message to our text view.
        table.text = intent.extras?.getString("message")
        numq.text = intent.extras?.getString("message2")
        table.setText("Стол: №" + table.text)
        numq.setText("Кол-во гостей: " + numq.text)
        val Con = findViewById<Button>(R.id.createorder)
        Con.setOnClickListener{
             val intent = Intent(this, CreateOrder::class.java)
             startActivity(intent)

            val Con2 = findViewById<Button>(R.id.editorder)
            Con2.setOnClickListener{
                val intent2 = Intent(this, EditOrder::class.java)
                startActivity(intent2)



            }

        }


    }
}







