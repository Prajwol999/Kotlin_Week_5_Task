package com.example.myandroid34

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    lateinit var textView:TextView
    lateinit var btnCalaculate:Button
    lateinit var btnNavigate:Button
    var counter=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main6)
        textView=findViewById(R.id.textView809)
        btnNavigate = findViewById(R.id.btnNavigate)
        btnCalaculate=findViewById(R.id.button15)

        btnCalaculate.setOnClickListener {
            counter+=1
            textView.text=""+counter
        }




    }

    override fun onStart() {
        super.onStart()
        Log.d("Message","on start called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Message","on resume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Message","on pause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Message","on stop called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Message","on start called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Message","on destroy called")
    }
}
