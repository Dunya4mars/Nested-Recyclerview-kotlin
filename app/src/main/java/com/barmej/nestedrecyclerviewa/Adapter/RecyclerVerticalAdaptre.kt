package com.barmej.nestedrecyclerviewa.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.barmej.nestedrecyclerviewa.R
import com.barmej.nestedrecyclerviewa.Model.RecyclerVerModel

class RecyclerVerticalAdaptre (private val dataList:List<RecyclerVerModel>) : RecyclerView.Adapter<RecyclerVerticalAdaptre.ViewHolder>() {

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageViewVertical: ImageView = itemView.findViewById(R.id.imageView_Vertical)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.lauout_item_vertical, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val recyclerModel = dataList[position]
        holder.imageViewVertical.setImageResource(recyclerModel.imageVer)
    }


}