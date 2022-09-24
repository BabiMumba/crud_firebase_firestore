package com.bstonetech.achatapp.adapter

import android.app.Activity
import android.content.Context
import android.net.wifi.p2p.WifiP2pManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bstonetech.achatapp.HomeFragment
import com.bstonetech.achatapp.R
import com.bstonetech.achatapp.model.News
import com.google.android.material.imageview.ShapeableImageView

class NewAdapter(private val newslist: ArrayList<News>, private val context: Context?):RecyclerView.Adapter<NewAdapter.MyviewHolder>() {

    private lateinit var mListener:onItemClickListene

    interface onItemClickListene{
        fun onItemClick(position: Int)
    }

    fun setOnclickListener(listener: onItemClickListene){
        mListener = listener
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        val itemview = LayoutInflater.from(parent.context).inflate(R.layout.my_grid_view,parent,false)
        return MyviewHolder(itemview,mListener)
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        var currentitem = newslist[position]
        holder.titleimage.setImageResource(currentitem.titleimage)
        holder.tvheading.text = currentitem.heading
        holder.itemView.setOnClickListener {

            Toast.makeText(context, "position :$position", Toast.LENGTH_SHORT).show()
        }

    }

    override fun getItemCount(): Int {
        return newslist.size
    }

    class MyviewHolder(itemview:View, listener:onItemClickListene):RecyclerView.ViewHolder(itemview){
        var titleimage:ImageView = itemview.findViewById(R.id.image)
        var tvheading:TextView = itemview.findViewById(R.id.titre)

        init {
            listener.onItemClick(adapterPosition)
        }




    }

}