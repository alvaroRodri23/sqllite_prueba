package com.example.sqllite_prueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dbHelper = DatabaseHelper(this)


        val btnañadir= findViewById<Button>(R.id.btnAñadir)
        val btnvisualizar= findViewById<Button>(R.id.btnVisualizar)

        btnañadir.setOnClickListener{


        }
        btnvisualizar.setOnClickListener{

        }

    }
}