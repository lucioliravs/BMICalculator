package com.comunidadedevspace.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtWeight = findViewById<TextInputEditText>(R.id.editTextWeight)
        val edtHeight = findViewById<TextInputEditText>(R.id.editTextHeight)
        val btnCalculate = findViewById<Button>(R.id.button_calculate)

        btnCalculate.setOnClickListener {
            val weightStr = edtWeight.text.toString()
            val heightStr = edtHeight.text.toString()
            if (weightStr.isNotEmpty() && heightStr.isNotEmpty()) {
                val weight = weightStr.toFloat()
                val height = heightStr.toFloat()
                val bmi = weight / (height * height)

                val intent = Intent(this, ResultActivity::class.java).apply {
                    putExtra(KEY_RESULT, bmi)
                }
                startActivity(intent)
            } else {
                Snackbar.make(it, "Preencha todos os campos", Snackbar.LENGTH_SHORT).show()
            }
        }
    }
}

