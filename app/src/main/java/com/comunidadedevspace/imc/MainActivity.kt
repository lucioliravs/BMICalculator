package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtWeight = findViewById<TextInputEditText>(R.id.editTextWeight)
        val edtHeight = findViewById<TextInputEditText>(R.id.editTextHeight)
        val btnCalculate = findViewById<Button>(R.id.button_calculate)

       btnCalculate.setOnClickListener {
            val weight = edtWeight.text
            val height = edtHeight.text
            Toast.makeText(this, "Peso: $weight Altura: $height", Toast.LENGTH_SHORT).show()
       }
    }
}