package com.example.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView);
        recyclerView.layoutManager = LinearLayoutManager(this)
        val fruitList = listOf<Fruit>(
            Fruit("Mango","Musfiq"),
            Fruit("Apple","Ripa"),
            Fruit("Banana","Sakib"),
            Fruit("Guava","Riyazul"),
            Fruit("Lemon","Sujon"),
            Fruit("Pear","Samima"),
            Fruit("Orange","Ripa"),
        )
        recyclerView.adapter = RecyclerViewAdapter(
            fruitList,
        ) { selectedItem: Fruit ->
            listItemClicked(selectedItem)
        }
    }
    private fun listItemClicked(fruit: Fruit){
        Toast.makeText(this@MainActivity, "Supplier: ${fruit.supplier}", Toast.LENGTH_SHORT).show()
    }
}