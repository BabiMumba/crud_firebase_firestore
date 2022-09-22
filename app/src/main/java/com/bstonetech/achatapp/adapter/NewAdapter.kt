package com.bstonetech.achatapp.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bstonetech.achatapp.model.News

class NewAdapter(private val newslist: ArrayList<News>):RecyclerView.Adapter<NewAdapter.MyviewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return newslist.size
    }

    class MyviewHolder(itemview:View):RecyclerView.ViewHolder(itemview){


    }

}