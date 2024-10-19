package com.example.mypendingbooks

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mypendingbooks.adapter.BookAdapter
import com.example.mypendingbooks.data.BooksPrivider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BooksPrivider.pendingBooksList
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
    }

    private fun initRecyclerView() {
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = BookAdapter(BooksPrivider.pendingBooksList)
        recyclerView.adapter = adapter
    }

    fun onStartButtonClick(view: View) {
        val intent = Intent(this, RecyclerViewActivity::class.java)
        startActivity(intent)
    }


}