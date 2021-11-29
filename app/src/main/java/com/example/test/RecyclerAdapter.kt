package com.example.test

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter:RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    private  var titles= arrayOf("SALE","PURCHASE","REFUND")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v=LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text=titles[position]

    }
    inner class ViewHolder(itemview:View):RecyclerView.ViewHolder(itemview){
        var itemImage:ImageView;
        var itemTitle: TextView;
        init {
            itemImage=itemview.findViewById(R.id.item_image)
            itemTitle=itemview.findViewById(R.id.item_title)
            itemview.setOnClickListener{
                val position=adapterPosition
                Toast.makeText(itemview.context,"Clicked ${titles[position]}",Toast.LENGTH_LONG).show()
            }


        }
    }
}