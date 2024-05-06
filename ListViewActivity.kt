package com.example.myandroid34

import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ListViewActivity : AppCompatActivity() {
    lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_list_view)

        listView = findViewById(R.id.ListView10)

        var data = resources.getStringArray(R.array.countries)
        var adapter = ArrayAdapter(
            this, android.R.layout.simple_list_item_1, data
        )
        listView.adapter = adapter
        listView.onItemClickListener=AdapterView.OnItemClickListener { parent, view, position, id ->
            val selectedItem = data[position]
            showAlertDialog(selectedItem)
        }

    }



        private fun showAlertDialog(selectedItem: String) {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Selected Country")
            builder.setMessage("You have selected: $selectedItem")
            builder.setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }
            val dialog = builder.create()
            dialog.show()


        }
}