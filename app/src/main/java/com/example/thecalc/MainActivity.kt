package com.example.thecalc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var etNumber1: EditText? = null  // on the activity etNumber1
    private var etNumber2: EditText? = null  // on the activity etNumber2
    private var tvDisplay: TextView? = null  // on the activity tvDisplay
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNumber1 = findViewById<EditText>(R.id.etNum1)
        etNumber2 = findViewById<EditText>(R.id.etNum2)
        tvDisplay = findViewById<TextView>(R.id.tvDisp)

        val btnDivision = findViewById<Button>(R.id.btnDiv)
        btnDivision.setOnClickListener{
            div()
        }
        val btnMultiplication = findViewById<Button>(R.id.btnMul)
        btnMultiplication.setOnClickListener{
            mul()
        }
        val btnAddition = findViewById<Button>(R.id.btnAdd)
        btnAddition.setOnClickListener{
            add()
        }
        val btnSubtraction = findViewById<Button>(R.id.btnSub)
        btnSubtraction.setOnClickListener{
            sub()
        }
    }
    private fun div(){
        var intNum1: Int = 0
        var intNum2: Int = 0
        var intAns: Int = 0

        intNum1 = etNumber1.text.toString().toInt()
        intNum2 = etNumber2.text.toString().toInt()

        intAns = intNum1 / intNum2

        // output intNum1 / " / " / intNum2 / " = " /intAns // 1 / 1 = 1
        tvDisplay?.text = "" / intNum1 / " / " / intNum2 / " = " / intAns

    }
}
    private fun mul(){
        var intNum1: Int = 0
        var intNum2: Int = 0
        var intAns: Int = 0

        intNum1 = etNumber1.text.toString().toInt()
        intNum2 = etNumber2.text.toString().toInt()

        intAns = intNum1 x intNum2

        // output intNum1 x " x " x intNum2 x " = " x intAns // 1 x 1 = 1
        tvDisplay?.text = "" x intNum1 x " x " x intNum2 x " = " x intAns

   }

}
    private fun add() {
        var intNum1: Int = 0
        var intNum2: Int = 0
        var intAns: Int = 0

        intNum1 = etNumber1.text.toString().toInt()
        intNum2 = etNumber2.text.toString().toInt()

        intAns = intNum1 + intNum2

        // output intNum1 + " + " + intNum2 + " = " + intAns // 1 + 1 = 2
        tvDisplay?.text = "" + intNum1 + " + " + intNum2 + " = " + intAns

    }

}
private fun sub() {
    var intNum1: Int = 0
    var intNum2: Int = 0
    var intAns: Int = 0

    intNum1 = etNumber1.text.toString().toInt()
    intNum2 = etNumber2.text.toString().toInt()

    intAns = intNum1 - intNum2

    // output intNum1 - " - " - intNum2 - " = " - intAns // 1 - 1 = 0
    tvDisplay?.text = "" - intNum1 - " - " - intNum2 - " = " - intAns

    }

}
