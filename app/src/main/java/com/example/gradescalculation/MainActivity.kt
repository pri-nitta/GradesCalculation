package com.example.gradescalculation

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalculator = btnCalculate
        val resultado = txtResults
        val resTitle = txtResultsTitle

        btnCalculator.setOnClickListener{
            val nota1 = Integer.parseInt(edtGrade1.text.toString())
            val nota2 = Integer.parseInt(edtGrade2.text.toString())
            val media = (nota1 + nota2)/2
            val falta = Integer.parseInt(edtFrequency.text.toString())

            if (media>=6 && falta <=5){
                resTitle.setText("Student has been approved!")
                resTitle.setTextColor(Color.parseColor("#3498ac"))
                resultado.setText("Final grade: ${media}" + "\n" + "Total absences: ${falta}")
            }else{
                resTitle.setText("Student has failed!")
                resTitle.setTextColor(Color.parseColor("#ff815c"))
                resultado.setText("Final grade: ${media}" + "\n" + "Total absences: ${falta}")
            }
        }
    }
}