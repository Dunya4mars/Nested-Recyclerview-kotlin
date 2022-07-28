package com.barmej.nestedrecyclerviewa.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.barmej.nestedrecyclerviewa.Model.RecyclerCircleModel
import com.barmej.nestedrecyclerviewa.R

class RecyclerCircleAdapter (private val dataList:List<RecyclerCircleModel>) : RecyclerView.Adapter<RecyclerCircleAdapter.ViewHolder>() {

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageViewCircle: ImageView = itemView.findViewById(R.id.imageView_Circle)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_item_circle, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val recyclerModel = dataList[position]

        // Image set to the imageview widget
        holder.imageViewCircle.setImageResource(recyclerModel.imageCir)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }


}