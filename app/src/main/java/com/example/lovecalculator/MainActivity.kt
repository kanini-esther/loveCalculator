package com.example.lovecalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var textName1: EditText? = null
    var textName2: EditText? = null
    var textViewResult: TextView? = null
    var buttonCalculate: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        textName1 = findViewById(R.id.etHerName);
        textName2 = findViewById(R.id.editTextTextPersonName2);
        textViewResult = findViewById(R.id.tvPressCalculate);
        buttonCalculate = findViewById(R.id.btnCalculate);


        buttonCalculate.setOnClickListener(new View.OnClick)
    }
}