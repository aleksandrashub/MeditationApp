package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main6)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val exitToMenu : Button = findViewById<Button>(R.id.exitToMenu)
        exitToMenu.setOnClickListener()
        {
            val intent = Intent(this, MainActivity4::class.java)
            this.startActivity(intent)
        }
        val editPhoto1 : ImageButton = findViewById<ImageButton>(R.id.editPhoto1)
        editPhoto1.setOnClickListener()
        {
            val intent = Intent(this, MainActivity5::class.java)
            intent.putExtra("img", R.drawable.rec4)
            this.startActivity(intent)
        }
        val editPhoto2 : ImageButton = findViewById<ImageButton>(R.id.editPhoto2)
        editPhoto2.setOnClickListener()
        {
            val intent = Intent(this, MainActivity5::class.java)
            intent.putExtra("img", R.drawable.rec3)
            this.startActivity(intent)
        }
        val editPhoto3 : ImageButton = findViewById<ImageButton>(R.id.editPhoto3)
        editPhoto3.setOnClickListener()
        {
            val intent = Intent(this, MainActivity5::class.java)
            intent.putExtra("img", R.drawable.rec2)
            this.startActivity(intent)
        }
        val editPhoto4 : ImageButton = findViewById<ImageButton>(R.id.editPhoto4)
        editPhoto4.setOnClickListener()
        {
            val intent = Intent(this, MainActivity5::class.java)
            intent.putExtra("img", R.drawable.rec1)
            this.startActivity(intent)
        }

    }
}