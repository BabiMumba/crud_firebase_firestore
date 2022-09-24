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

    private lateinit var adapter: NewAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var newsarrayList: ArrayList<News>

    lateinit var imageId:Array<Int>
    lateinit var heading:Array<String>
    lateinit var news:Array<String>
    private fun datainitialize(){

        newsarrayList = arrayListOf<News>()

        imageId = arrayOf(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.i,
            R.drawable.j,

            )

        heading = arrayOf(


            getString(R.string.head_1),
            getString(R.string.head_2),


            )
        news = arrayOf(
            getString(R.string.news_a),
            getString(R.string.news_b),


            )

        for (i in imageId.indices){
            val news = News(imageId[i],heading[i])
            newsarrayList.add(news)
        }
    }
    /*
     private lateinit var mListener:onItemClickListene

    interface onItemClickListene{
        fun onItemClick(position: Int)
    }

    fun setOnclickListener(listener: onItemClickListene){
        mListener = listener
    }
     */




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        val itemview = LayoutInflater.from(parent.context).inflate(R.layout.my_grid_view,parent,false)
        return MyviewHolder(itemview)
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

    class MyviewHolder(itemview:View):RecyclerView.ViewHolder(itemview){
        var titleimage:ImageView = itemview.findViewById(R.id.image)
        var tvheading:TextView = itemview.findViewById(R.id.titre)
/*
  init {
            listener.onItemClick(adapterPosition)
        }

 */

    }

}