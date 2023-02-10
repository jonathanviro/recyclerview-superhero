package com.javr.recyclerview_superheros.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.javr.recyclerview_superheros.R
import com.javr.recyclerview_superheros.Superhero

class SuperheroAdapter(val superHeroList: List<Superhero>, private val funOnClickListener: (Superhero) -> Unit): RecyclerView.Adapter<SuperheroViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperheroViewHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))
    }

    override fun onBindViewHolder(holder: SuperheroViewHolder, position: Int) {
        val item = superHeroList[position]
        holder.render(item, funOnClickListener)
    }

    override fun getItemCount(): Int {
        return superHeroList.size
    }
}