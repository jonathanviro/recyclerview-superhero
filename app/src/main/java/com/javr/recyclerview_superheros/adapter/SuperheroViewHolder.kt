package com.javr.recyclerview_superheros.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.javr.recyclerview_superheros.R
import com.javr.recyclerview_superheros.Superhero

class SuperheroViewHolder(view: View): RecyclerView.ViewHolder(view){

    val name = view.findViewById<TextView>(R.id.tvName)
    val realName = view.findViewById<TextView>(R.id.tvRealname)
    val publisher = view.findViewById<TextView>(R.id.tvPublisher)

    fun render(superHeroModel: Superhero){
        name.text = superHeroModel.name
        realName.text = superHeroModel.name
        publisher.text = superHeroModel.publisher
    }
}