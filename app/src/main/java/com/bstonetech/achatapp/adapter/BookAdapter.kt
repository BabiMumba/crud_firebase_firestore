package com.bstonetech.achatapp.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bstonetech.achatapp.R
import com.bstonetech.achatapp.SettingsActivity
import com.bstonetech.achatapp.model.BookModel
import org.w3c.dom.Text

class BookAdapter(var context: Context, var arrayList: ArrayList<BookModel>):  RecyclerView.Adapter<BookAdapter.itemHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemHolder{
        val itemHolder = LayoutInflater.from(parent.context).inflate(R.layout.book_ui_item,parent,false)
        return itemHolder(itemHolder)
    }

    override fun onBindViewHolder(holder: itemHolder, position: Int) {
        var bookModel:BookModel = arrayList.get(position)
        holder.icone.setImageResource(bookModel.icon!!)
        holder.title.text = bookModel.titre
        holder.icone.setOnClickListener {
            if (position==0){
                Toast.makeText(context, bookModel.titre.toString(), Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(context, bookModel.titre.toString(), Toast.LENGTH_SHORT).show()
            }

        }

    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
    class itemHolder(itemview: View):RecyclerView.ViewHolder(itemview){
        var icone:ImageView = itemview.findViewById(R.id.cover_book)
        var title:TextView = itemview.findViewById(R.id.titre_book)

    }

}