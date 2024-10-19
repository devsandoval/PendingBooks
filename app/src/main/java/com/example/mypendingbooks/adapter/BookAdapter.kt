package com.example.mypendingbooks.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mypendingbooks.R
import com.example.mypendingbooks.data.ItemBook

class BookAdapter( private val pendingBooksList: List<ItemBook>) : RecyclerView.Adapter<BookViewHolder>() {

    //Create view holder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder{
        val layoutInflater = LayoutInflater.from(parent.context)
        return BookViewHolder(layoutInflater.inflate(R.layout.activity_recycler_view, parent, false))
    }

    //Devuelve el tamaño de la lista de libros
    override fun getItemCount(): Int = pendingBooksList.size


    //Bind data to view
    override fun onBindViewHolder(holder: BookViewHolder, position: Int){
        val item = pendingBooksList[position]
        holder.render(item)
    }
}