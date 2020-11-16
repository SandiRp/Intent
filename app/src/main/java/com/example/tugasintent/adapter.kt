package com.example.tugasintent

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class adapter (val jajanItemList: List<data_jajanan>,
               val clickListener: (data_jajanan) -> Unit): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_item, parent, false)
        return PartViewHolder(view)
    }

    override fun getItemCount(): Int = jajanItemList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(jajanItemList[position], clickListener)
    }

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(jajan: data_jajanan, clickListener: (data_jajanan) -> Unit) {
                itemView.namaJajanan.text = jajan.namaJajan
                itemView.fotoJajanan.setImageResource(jajan.foto)

                itemView.setOnClickListener { clickListener(jajan) }
        }
    }
}
