package com.example.myandroid34

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AutoComplete : AppCompatActivity() {
    private  val languages= arrayOf("Nepali","English","Hindi","French")
    private lateinit var autoComplete: AutoCompleteTextView
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_auto_complete)
        
        autoComplete = findViewById(R.id.autoCompleteTextView)
//        for autocomplete textview
        val autompleteAdapter=ArrayAdapter(
            this,android.R.layout.simple_dropdown_item_1line,languages
        )
        autoComplete.setAdapter(autompleteAdapter)
        autoComplete.threshold=1
        
    }
}