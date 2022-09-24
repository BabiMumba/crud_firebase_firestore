package com.bstonetech.achatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bstonetech.achatapp.R
import com.bstonetech.achatapp.adapter.BookAdapter
import com.bstonetech.achatapp.model.BookModel

class AchatActivity : AppCompatActivity() {

    //declaration des variables
    private var recyclerview:RecyclerView? = null
    private var gridLayoutManager:GridLayoutManager ? = null
    private var arrayList:ArrayList<BookModel> ? = null
    private var bookAdapter:BookAdapter ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_achat)

        recyclerview = findViewById(R.id.my_recler_view)
        gridLayoutManager = GridLayoutManager(applicationContext,1,LinearLayoutManager.VERTICAL,false)
        recyclerview?.layoutManager = gridLayoutManager
        recyclerview?.setHasFixedSize(true)
        arrayList = ArrayList()
        arrayList = setDataList()
        bookAdapter = BookAdapter(applicationContext,arrayList!!)
        recyclerview?.adapter = bookAdapter

    }
    private fun setDataList():ArrayList<BookModel>{
        var items:ArrayList<BookModel> = ArrayList()
        items.add(BookModel(R.drawable.codage,"codage"))
        items.add(BookModel(R.drawable.coding,"codage"))
        items.add(BookModel(R.drawable.dissatisfaction,"codage"))
        items.add(BookModel(R.drawable.education,"codage"))
        items.add(BookModel(R.drawable.eng,"codage"))
        items.add(BookModel(R.drawable.fina1,"codage"))
        items.add(BookModel(R.drawable.fina1,"codage"))
        items.add(BookModel(R.drawable.fina1,"codage"))
        items.add(BookModel(R.drawable.fina1,"codage"))
        items.add(BookModel(R.drawable.fina2,"codage"))
        items.add(BookModel(R.drawable.function,"codage"))
        items.add(BookModel(R.drawable.codage,"codage"))
        items.add(BookModel(R.drawable.codage,"codage"))
        items.add(BookModel(R.drawable.handshake,"codage"))
        items.add(BookModel(R.drawable.codage,"codage"))
        items.add(BookModel(R.drawable.codage,"codage"))
        items.add(BookModel(R.drawable.heart,"codage"))
        items.add(BookModel(R.drawable.robertk,"codage"))
        items.add(BookModel(R.drawable.innovation,"codage"))
        items.add(BookModel(R.drawable.codage,"codage"))
        items.add(BookModel(R.drawable.rober,"codage"))
        items.add(BookModel(R.drawable.rober,"codage"))
        items.add(BookModel(R.drawable.rober,"codage"))
        items.add(BookModel(R.drawable.rober,"codage"))
        items.add(BookModel(R.drawable.rober,"codage"))
        items.add(BookModel(R.drawable.rober,"codage"))
        items.add(BookModel(R.drawable.rober,"codage"))
        items.add(BookModel(R.drawable.rober,"codage"))
        items.add(BookModel(R.drawable.rober,"codage"))
        items.add(BookModel(R.drawable.codage,"codage"))
        items.add(BookModel(R.drawable.richeetre,"pere riche pere pauvre"))
        items.add(BookModel(R.drawable.richeetre,"pere riche pere pauvre"))
        items.add(BookModel(R.drawable.richeetre,"pere riche pere pauvre"))
        items.add(BookModel(R.drawable.richeetre,"pere riche pere pauvre"))
        items.add(BookModel(R.drawable.richeetre,"pere riche pere pauvre"))
        items.add(BookModel(R.drawable.richeetre,"pere riche pere pauvre"))
        items.add(BookModel(R.drawable.richeetre,"pere riche pere pauvre"))
        items.add(BookModel(R.drawable.richeetre,"pere riche pere pauvre"))
        items.add(BookModel(R.drawable.richeetre,"pere riche pere pauvre"))
        items.add(BookModel(R.drawable.richeetre,"pere riche pere pauvre"))
        items.add(BookModel(R.drawable.richeetre,"pere riche pere pauvre"))
        items.add(BookModel(R.drawable.richeetre,"pere riche pere pauvre"))
        items.add(BookModel(R.drawable.richeetre,"pere riche pere pauvre"))
        items.add(BookModel(R.drawable.richeetre,"pere riche pere pauvre"))
        items.add(BookModel(R.drawable.other_book,"codage"))
        items.add(BookModel(R.drawable.religion,"codage"))

        return items
    }
}