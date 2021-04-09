package com.example.samplelocalrecyclerstaggered.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.samplelocalrecyclerstaggered.R
import com.example.samplelocalrecyclerstaggered.modal.Sheets

class SampleAdapter (private val dataSheets: ArrayList<Sheets>): RecyclerView.Adapter<SampleAdapter.SampleHolder>()
{
    inner class SampleHolder(view: View): RecyclerView.ViewHolder(view)
    {
        val imageSample: ImageView = view.findViewById(R.id.staggered_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleHolder
    {
        val layoutInflater = LayoutInflater.from(parent.context)
        val inflaterView = layoutInflater.inflate(R.layout.item_list, parent, false)

        return SampleHolder(inflaterView)
    }

    override fun onBindViewHolder(holder: SampleHolder, position: Int)
    {
        //
        val data = dataSheets[position]

        //
        Glide.with(holder.itemView.context)
            .load(data.image)
            .into(holder.imageSample)
    }

    override fun getItemCount(): Int
    {
        return dataSheets.size
    }


}