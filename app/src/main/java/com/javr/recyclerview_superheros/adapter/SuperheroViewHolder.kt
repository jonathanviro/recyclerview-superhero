package com.javr.recyclerview_superheros.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.javr.recyclerview_superheros.Superhero
import com.javr.recyclerview_superheros.databinding.ItemSuperheroBinding

class SuperheroViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val binding = ItemSuperheroBinding.bind(view)
    fun render(superHeroModel: Superhero, funOnClickListener: (Superhero) -> Unit) {
        binding.tvName.text = superHeroModel.name
        binding.tvRealname.text = superHeroModel.realName
        binding.tvPublisher.text = superHeroModel.publisher
        Glide.with(binding.ivPhoto.context).load(superHeroModel.photo).into(binding.ivPhoto)

        //Clic en cualquier parte del item
        itemView.setOnClickListener {
            funOnClickListener(superHeroModel)
        }
    }
}