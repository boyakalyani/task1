package com.example.task1

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.datepicker.MaterialDatePicker
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    lateinit var edt1:EditText
    lateinit var edt2:EditText
    lateinit var button: Button
    lateinit var txt1:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edt1=findViewById(R.id.edt1_id)
        edt2=findViewById(R.id.edt2_id)
        button=findViewById(R.id.btn_id)
        txt1=findViewById(R.id.txt_id)

        val c=Calendar.getInstance()
        val year=c.get(Calendar.YEAR)
        val monthOfYear=c.get(Calendar.MONTH)
        val day=c.get(Calendar.HOUR_OF_DAY)

        button.setOnClickListener(){
                val dpd=DatePickerDialog(this,DatePickerDialog.OnDateSetListener { view, mYear, mMonth, mDay ->
                    txt1.setText("" + mDay + "/" + mMonth + "/" + mYear)
                },year,monthOfYear,day)
            dpd.show()
                }
        }
    }
