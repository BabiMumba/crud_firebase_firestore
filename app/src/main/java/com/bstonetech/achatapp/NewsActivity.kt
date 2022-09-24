package com.bstonetech.achatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class NewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        val heading_news:TextView = findViewById(R.id.titre_news)
        val image_news:ImageView = findViewById(R.id.image_id)
        val news:TextView = findViewById(R.id.news)

        val bundle:Bundle? = intent.extras

        val heading = bundle!!.getString("titre")
        val imageId = bundle.getInt("imageId")
        val news_tv = bundle.getString("news")

        heading_news.text = heading
        news.text = news_tv
        image_news.setImageResource(imageId)




    }
}