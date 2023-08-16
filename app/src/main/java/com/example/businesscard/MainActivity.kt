package com.example.businesscard

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val name: Button = findViewById(R.id.nameButton)
        val position: Button = findViewById(R.id.positionButton)
        val email: Button = findViewById(R.id.email)
        val phone: Button = findViewById(R.id.phone)

        name.setOnClickListener {
            Toast.makeText(this, "Vlad", Toast.LENGTH_SHORT).show()
        }

        position.setOnClickListener {
            Toast.makeText(this, "QA Automation", Toast.LENGTH_SHORT).show()
        }

        email.setOnClickListener {
            Toast.makeText(this, "vladberezovksiy@gmail.com", Toast.LENGTH_SHORT).show()
        }

        phone.setOnClickListener {
            Toast.makeText(this, "+380633452213", Toast.LENGTH_SHORT).show()
        }
    }
}
