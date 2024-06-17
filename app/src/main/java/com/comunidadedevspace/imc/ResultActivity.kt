package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

const val KEY_RESULT = "ResultActivity.KEY_RESULT"
class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val result = intent.getFloatExtra(KEY_RESULT, 0f)
        val tvResult = findViewById<TextView>(R.id.tv_result)
        val tvClassification = findViewById<TextView>(R.id.tv_classification)

        tvResult.text = result.toString()

        val classification = if(result < 18.5f){
            "ABAIXO DO PESO"
        }else if(result in 18.5f..24.9f){
            "NORMAL"
        }else if(result in 25f..29.9f){
            "SOBREPESO"
        }else if(result in 30f..39.9f){
            "OBESIDADE"
        }else{
            "OBESIDADE GRAVE"
        }

        tvClassification.text = classification
    }
}