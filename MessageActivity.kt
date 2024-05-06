package com.example.myandroid34

import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myandroid34.databinding.ActivityAutoCompleteBinding
import com.example.myandroid34.databinding.ActivityMessageBinding

class MessageActivity : AppCompatActivity() {
    lateinit var messageBinding: ActivityMessageBinding
    lateinit var sharedPreferences:SharedPreferences
    var counter=0

    var username:String?=null
    var message:String?=null
    var rememberMe:Boolean?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        messageBinding = ActivityMessageBinding.inflate(layoutInflater)
        var view = messageBinding.root
        setContentView(view)
        messageBinding.btnCounter.setOnClickListener{
            counter++
            messageBinding.btnCounter.text=counter.toString()
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



    }

    override fun onPause() {
        sharedPreferences = this.getSharedPreferences("username", MODE_PRIVATE)
        username=messageBinding.Name1.text.toString()
        message = messageBinding.messagetMultiLine2.toString()
        rememberMe=messageBinding.mcheckBox.isChecked

        var editor=sharedPreferences.edit()
        editor.putString("username",username)
        editor.putString("message",message)
        editor.putInt("counter",counter)
        editor.putBoolean("remember",rememberMe!!)

        editor.apply()
        super.onPause()


    }


    override fun onResume() {
        sharedPreferences = this.getSharedPreferences("userValue", MODE_PRIVATE)
        username=sharedPreferences.getString("username","")
        message=sharedPreferences.getString("message","")
        rememberMe=sharedPreferences.getBoolean("remember",false)

        counter=sharedPreferences.getInt("counter",0)

        messageBinding.Name1.setText(username)
        messageBinding.messagetMultiLine2.setText(message)
        messageBinding.mcheckBox.isChecked=rememberMe!!
        messageBinding.btnCounter.text=counter.toString()


        super.onResume()
    }
}