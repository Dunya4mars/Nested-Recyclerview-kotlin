package com.barmej.nestedrecyclerviewa.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.barmej.nestedrecyclerviewa.R
import com.barmej.nestedrecyclerviewa.Model.RecyclerModel


class RecyclerAdapter(private val dataList:List<RecyclerModel>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_items, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val recyclerModel = dataList[position]

        // Image set to the imageview widget
        holder.imageView.setImageResource(recyclerModel.image)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }


}