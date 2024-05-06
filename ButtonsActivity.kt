package com.example.myandroid34

import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class ButtonsActivity : AppCompatActivity() {
    lateinit var checkBoxToast: CheckBox
    lateinit var checkBoxSnackbar:CheckBox
    lateinit var checkBoxAlertDialog: CheckBox
    lateinit var buttonClick:Button
    lateinit var main:ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_buttons)

        checkBoxToast=findViewById(R.id.toastbox)
        checkBoxSnackbar=findViewById(R.id.snackerbox)
        checkBoxAlertDialog=findViewById(R.id.alertbox)
        buttonClick = findViewById(R.id.button)
        main = findViewById(R.id.main)


        checkBoxToast.setOnClickListener {
            if (checkBoxToast.isChecked){
                checkBoxSnackbar.isChecked=false
                checkBoxAlertDialog.isChecked=false

            }
        }
        checkBoxSnackbar.setOnClickListener {
            if(checkBoxSnackbar.isChecked){
                checkBoxToast.isChecked=false
            }
        }
        buttonClick.setOnClickListener {
            if(checkBoxToast.isChecked){
//                for toast
                Toast.makeText(applicationContext,"This is a toast message",Toast.LENGTH_SHORT).show()
            }else if(checkBoxSnackbar.isChecked){
//                for snackbar
                Snackbar.make(main,"This is a snackbar message",Snackbar.LENGTH_LONG).setAction("close",
                    View.OnClickListener {  }).show()


            }else{
//                alert dialog
                AlertDialog.Builder(this@ButtonsActivity)
                    .setTitle("confirm")
                    .setMessage("Are you sure!!").setCancelable(false).setNegativeButton(
                    "NO",DialogInterface.OnClickListener { dialog, which ->  }
                ).setPositiveButton("Yes",DialogInterface.OnClickListener { dialog, which ->  }).create().show()
            }
        }


    }
}