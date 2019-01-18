package com.szlangini.example.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.szlangini.example.coderswag.Model.Category
import com.szlangini.example.coderswag.R
import com.szlangini.example.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ArrayAdapter<Category>(this,
            android.R.layout.simple_list_item_1,
            DataService.categories
            )

        categoryListView.adapter = adapter

    }
}
