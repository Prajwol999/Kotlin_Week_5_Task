package com.example.myandroid34

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myandroid34.databinding.ActivityLoginDashboardBinding
import com.example.myandroid34.databinding.ActivityMessageBinding

class LoginDashboard : AppCompatActivity() {
    lateinit var pageBinding:ActivityLoginDashboardBinding
    lateinit var sharedPreferences: SharedPreferences

    var username:String?=null
    var password:String?=null
    var rememberBox:Boolean?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        pageBinding = ActivityLoginDashboardBinding.inflate(layoutInflater)
        var view=pageBinding.root

        setContentView(view)
//        Registration
        pageBinding.signupbtn.setOnClickListener {
            sharedPreferences=this.getSharedPreferences("details_user", MODE_PRIVATE)
            username=pageBinding.uusername.text.toString()
            password=pageBinding.pPassword.text.toString()
            rememberBox=pageBinding.lcheckBox.isChecked

            val editor=sharedPreferences.edit()
            editor.putString("username",username)
            editor.putString("password",password)
            editor.putBoolean("remember",rememberBox!!)
            editor.apply()
            Toast.makeText(applicationContext,"sucessfully Registered",Toast.LENGTH_LONG).show()

        }
//        Login

        pageBinding.loginbtn.setOnClickListener {
            sharedPreferences=this.getSharedPreferences("userdetail", MODE_PRIVATE)

            val savedUsername=sharedPreferences.getString("username","No value")
            val savedpassword=sharedPreferences.getString("password","No value")

            val checkUser=pageBinding.uusername.text.toString()
            val checkPass=pageBinding.pPassword.text.toString()

            if(checkUser==savedUsername && checkPass==savedpassword){
//                next activity starts
                val intent =Intent(this,MessageActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(
                    applicationContext,"Invalid username or password",
                    Toast.LENGTH_SHORT
                ).show()
            }

        }

    }

    override fun onPause() {
        sharedPreferences=this.getSharedPreferences("userdetail", MODE_PRIVATE)
        username=pageBinding.uusername.text.toString()
        password=pageBinding.pPassword.text.toString()
        rememberBox=pageBinding.lcheckBox.isChecked

        var editor = sharedPreferences.edit()
        editor.putString("username",username)
        editor.putString("password",password)
        editor.putBoolean("remember",rememberBox!!)

        editor.apply()
        Toast.makeText(applicationContext,"data saved",Toast.LENGTH_LONG).show()
        super.onPause()
    }

    override fun onResume() {
        sharedPreferences=this.getSharedPreferences("userdetail", MODE_PRIVATE)
        username=sharedPreferences.getString("username","No value")
        password=sharedPreferences.getString("password","No value")
        rememberBox=sharedPreferences.getBoolean("remember",false)
        super.onResume()
        if(rememberBox==true){
            pageBinding.uusername.setText(username)
            pageBinding.pPassword.setText(password)
        }
    }
}