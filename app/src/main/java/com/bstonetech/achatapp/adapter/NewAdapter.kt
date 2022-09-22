package com.bstonetech.achatapp.adapter

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bstonetech.achatapp.R
import com.bstonetech.achatapp.model.News
import com.google.android.material.imageview.ShapeableImageView

class NewAdapter(private val newslist: ArrayList<News>):RecyclerView.Adapter<NewAdapter.MyviewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return newslist.size
    }

    class MyviewHolder(itemview:View):RecyclerView.ViewHolder(itemview){
        var titleimage:ShapeableImageView = itemview.findViewById(R.id.title_image)
        var tvheading:TextView = itemview.findViewById(R.id.tvHeading)


    }

}