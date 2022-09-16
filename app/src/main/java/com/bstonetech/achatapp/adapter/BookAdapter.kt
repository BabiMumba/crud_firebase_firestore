package com.bstonetech.achatapp.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bstonetech.achatapp.R
import com.bstonetech.achatapp.model.BookModel
import org.w3c.dom.Text

class BookAdapter(var context: Context, var arrayList: ArrayList<BookModel>):  RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
    class itemview(itemview: View):RecyclerView.ViewHolder(itemview){
        var icone:ImageView = itemview.findViewById(R.id.icons_image)
        var title:TextView = itemview.findViewById(R.id.title)

    }

}