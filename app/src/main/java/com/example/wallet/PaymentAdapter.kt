package com.example.wallet

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PaymentAdapter(var context: Context, var items: ArrayList<Payment>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_payment, parent, false)
        return PaymentViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var item = items[position]
        if (holder is PaymentViewHolder){
            var title = holder.title
            var image = holder.image

            title.text = item.tv_title
            image.setImageResource(item.iv_image)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }


    class PaymentViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title: TextView
        var image: ImageView

        init {
            image = view.findViewById(R.id.iv_image)
            title = view.findViewById(R.id.tv_title)
        }
    }


}