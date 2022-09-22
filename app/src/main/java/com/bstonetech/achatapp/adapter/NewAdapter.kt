package com.bstonetech.achatapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bstonetech.achatapp.R
import com.bstonetech.achatapp.model.News
import com.google.android.material.imageview.ShapeableImageView

class NewAdapter(private val newslist: ArrayList<News>):RecyclerView.Adapter<NewAdapter.MyviewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        val itemview = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return MyviewHolder(itemview)
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        var currentitem = newslist[position]
        holder.titleimage.setImageResource(currentitem.titleimage)
        holder.tvheading.text = currentitem.heading

    }

    override fun getItemCount(): Int {
        return newslist.size
    }

    class MyviewHolder(itemview:View):RecyclerView.ViewHolder(itemview){
        var titleimage:ShapeableImageView = itemview.findViewById(R.id.title_image)
        var tvheading:TextView = itemview.findViewById(R.id.tvHeading)


    }

}