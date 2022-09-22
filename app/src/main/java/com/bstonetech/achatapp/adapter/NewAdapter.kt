package com.bstonetech.achatapp.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bstonetech.achatapp.model.News

class NewAdapter(private val newslist: ArrayList<News>):RecyclerView.Adapter<NewAdapter.MyviewHolder> {

    class MyviewHolder(itemview:View):RecyclerView.ViewHolder(itemview){


    }

}