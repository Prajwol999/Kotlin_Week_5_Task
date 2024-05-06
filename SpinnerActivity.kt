package com.example.myandroid34

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SpinnerActivity : AppCompatActivity(),AdapterView.OnItemSelectedListener {
    lateinit var textView:TextView
    lateinit var spinner:Spinner
    var data = arrayOf("Nepal","India","Bhutan","Pakistan")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_spinner)

        textView= findViewById(R.id.textView8)
        spinner=findViewById(R.id.spinner)

        var adapter = ArrayAdapter(this@SpinnerActivity,android.R.layout.simple_spinner_item,data)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner.adapter=adapter
        spinner.onItemSelectedListener=this

        }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, index: Int, id: Long) {


        textView.text=parent?.getItemAtPosition(index).toString()
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {

    }
}
