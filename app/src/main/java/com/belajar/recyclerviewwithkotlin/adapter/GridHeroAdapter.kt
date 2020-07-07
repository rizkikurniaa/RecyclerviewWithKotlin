package com.belajar.recyclerviewwithkotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.belajar.recyclerviewwithkotlin.R
import com.belajar.recyclerviewwithkotlin.model.Hero
import com.bumptech.glide.Glide

class GridHeroAdapter(private val listHeroes: ArrayList<Hero>) : RecyclerView.Adapter<GridHeroAdapter.GridViewHolder>() {
    inner class GridViewHolder (itemview : View) : RecyclerView.ViewHolder(itemview) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_grid_hero, parent, false)
        return GridViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listHeroes.size
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(listHeroes[position].photo)
            .into(holder.imgPhoto)
    }
}