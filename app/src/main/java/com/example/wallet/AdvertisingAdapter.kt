package com.example.wallet

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdvertisingAdapter(var context: Context, var items: ArrayList<Advertising>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_advertising, parent, false)
        return AdvertisingViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var item = items[position]
        if (holder is AdvertisingViewHolder){
            var title = holder.title
            var image = holder.image

            title.text = item.title
            image.setImageResource(item.image)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class AdvertisingViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title: TextView
        var image: ImageView

        init {
            title = view.findViewById(R.id.tv_ad_title)
            image = view.findViewById(R.id.iv_ad_image)
        }
    }

}