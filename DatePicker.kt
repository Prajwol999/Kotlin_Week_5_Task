package com.example.myandroid34

import android.app.DatePickerDialog
import android.icu.util.Calendar
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DatePicker : AppCompatActivity() {
    private  lateinit var btnLoadCalendar:Button
    private lateinit var tvDate:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_date_picker)

        btnLoadCalendar = findViewById(R.id.button33)
        tvDate = findViewById(R.id.textView100)

        btnLoadCalendar.setOnClickListener {
            loadCalendar()
        }

    }
    private  fun loadCalendar(){
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

       val datePickerDialog = DatePickerDialog(
           this,DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
               tvDate.text="Selected Date:$dayOfMonth/$monthOfYear/$year"
           },
           year,
           month,
           day
       )
        datePickerDialog.show()
    }
}