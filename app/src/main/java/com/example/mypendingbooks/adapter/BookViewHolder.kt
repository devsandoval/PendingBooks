package com.example.mypendingbooks.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mypendingbooks.R
import com.example.mypendingbooks.data.ItemBook

class BookViewHolder (view: View): RecyclerView.ViewHolder(view) {

    val bookName = view.findViewById<TextView>(R.id.bookName_TextView)
    val bookAutorName = view.findViewById<TextView>(R.id.bookAutorName_TextView)
    val bookYear = view.findViewById<TextView>(R.id.bookYear_TextView)

    fun render (itemBookModel: ItemBook){
        bookName.text = itemBookModel.bookName
        bookAutorName.text = itemBookModel.bookAutor
        bookYear.text = itemBookModel.bookYear
    }
}