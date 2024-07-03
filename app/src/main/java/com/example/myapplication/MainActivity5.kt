package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main5)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val photo : ImageView= findViewById(R.id.photoForEdit);
       // val bundle: Bundle =
       // val img: Int = intent.getIntExtra();
        val i = intent.getIntExtra("img", 0)
      //  .setImageResource(i)
            //bundle.getInt("img")
       // intent.getex
        photo.setImageResource(i);
        val exitToProfile : Button = findViewById<Button>(R.id.exitToProfile)
        exitToProfile.setOnClickListener()
        {
            val intent = Intent(this, MainActivity6::class.java)
            this.startActivity(intent)
        }
    }
}