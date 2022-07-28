package com.barmej.nestedrecyclerviewa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.barmej.nestedrecyclerviewa.Adapter.RecyclerAdapter
import com.barmej.nestedrecyclerviewa.Adapter.RecyclerCircleAdapter
import com.barmej.nestedrecyclerviewa.Adapter.RecyclerVerticalAdaptre
import com.barmej.nestedrecyclerviewa.Model.RecyclerCircleModel
import com.barmej.nestedrecyclerviewa.Model.RecyclerModel
import com.barmej.nestedrecyclerviewa.Model.RecyclerVerModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val horizontalRv:RecyclerView = findViewById(R.id.horizontal_rv)
        val verticalRv:RecyclerView = findViewById(R.id.vertical_rv)
        val horizontalCircleRv:RecyclerView = findViewById(R.id.horizontal_circle_rv)

        val data:MutableList<RecyclerModel> = ArrayList()
        data.add(RecyclerModel(R.drawable.image_k_4))
        data.add(RecyclerModel(R.drawable.image_k_5))
        data.add(RecyclerModel(R.drawable.image_k_1))
        data.add(RecyclerModel(R.drawable.image_k_2))
        data.add(RecyclerModel(R.drawable.image_k_3))

        val data1:MutableList<RecyclerVerModel> = ArrayList()
        data1.add(RecyclerVerModel(R.drawable.image_e_5))
        data1.add(RecyclerVerModel(R.drawable.image_e_2))
        data1.add(RecyclerVerModel(R.drawable.image_e_3))
        data1.add(RecyclerVerModel(R.drawable.image_e_4))
        data1.add(RecyclerVerModel(R.drawable.image_e_1))
        data1.add(RecyclerVerModel(R.drawable.image_r_1))
        data1.add(RecyclerVerModel(R.drawable.image_r_2))
        data1.add(RecyclerVerModel(R.drawable.image_r_3))
        data1.add(RecyclerVerModel(R.drawable.image_r_4))
        data1.add(RecyclerVerModel(R.drawable.image_r_5))


        val data2:MutableList<RecyclerCircleModel> = ArrayList()
        data2.add(RecyclerCircleModel(R.drawable.image_x_1))
        data2.add(RecyclerCircleModel(R.drawable.image_x_3))
        data2.add(RecyclerCircleModel(R.drawable.image_x_4))
        data2.add(RecyclerCircleModel(R.drawable.image_x_5))
        data2.add(RecyclerCircleModel(R.drawable.image_x_3))

        val adapterHorizontal = RecyclerAdapter(data)
        val adapterVertical = RecyclerVerticalAdaptre(data1)
        val adapterHorizontalCircle = RecyclerCircleAdapter(data2)


        // For showing data list horizontally
        horizontalRv.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
        horizontalRv.adapter = adapterHorizontal

        // For showing data list vertically
        verticalRv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        verticalRv.adapter = adapterVertical

        // For showing data list Circle horizontally
        horizontalCircleRv.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
        horizontalCircleRv.adapter = adapterHorizontalCircle

    }

}