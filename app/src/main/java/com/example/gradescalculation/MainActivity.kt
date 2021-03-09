package com.example.gradescalculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalculator = btnCalculate
        val resultado = txtResults

        btnCalculator.setOnClickListener{
            val nota1 = Integer.parseInt(edtGrade1.text.toString())
            val nota2 = Integer.parseInt(edtGrade2.text.toString())
            val media = (nota1 + nota2)/2
            val falta = Integer.parseInt(edtFrequency.text.toString())

            if (media>=6 && falta <=5){
                resultado.setText("Student has been approved!" + "\n" + "Final grade:${media}" + "\n" + "Total absence: ${falta}" )
            }else{
                resultado.setText("Student has failed!" + "\n" + "Final grade:${media}" + "\n" + "Total absence: ${falta}" )
            }
        }
    }
}