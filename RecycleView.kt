package com.example.myandroid34

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myandroid34.adapter.RecyclerAdapter

class RecycleView : AppCompatActivity() {
    lateinit var recycleView: RecyclerView
    var titleLIst=ArrayList<String>()
    var imageList=ArrayList<Int>()
    var descriptionList=ArrayList<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_view)
        recycleView = findViewById(R.id.recycle12)

        titleLIst.add("elephant")
        titleLIst.add("kobe")
        titleLIst.add("lewis")

        imageList.add(R.drawable.elephant)
        imageList.add(R.drawable.kobe)
        imageList.add(R.drawable.lewis)

        descriptionList.add("This is elephant .....")
        descriptionList.add("This is kobe .....")
        descriptionList.add("This is lewis.....")

        var adapter = RecyclerAdapter(titleLIst,imageList,descriptionList)
        recycleView.layoutManager=LinearLayoutManager(this)
//        recycleView.layoutManager=GridLayoutManager(this,3)
        recycleView.adapter=adapter



    }
}