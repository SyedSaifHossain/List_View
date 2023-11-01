package com.example.list_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.list_view.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val list : ArrayList<ListModel> = ArrayList<ListModel>()

        list.add(ListModel("Bangladesh", "Dhaka is capital of bangladesh", "Bangladeh"))
        list.add(ListModel("Bangladesh", "Dhaka is capital of bangladesh", "Bangladeh"))
        list.add(ListModel("Bangladesh", "Dhaka is capital of bangladesh", "Bangladeh"))

        var adapter = ListAdapter(this, list)

        binding.listView.adapter = adapter
    }

}