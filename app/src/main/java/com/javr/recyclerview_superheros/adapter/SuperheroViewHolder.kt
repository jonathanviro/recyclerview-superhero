package com.javr.recyclerview_superheros.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.javr.recyclerview_superheros.Superhero
import com.javr.recyclerview_superheros.databinding.ItemSuperheroBinding

class SuperheroViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val binding = ItemSuperheroBinding.bind(view)
    fun render(superHeroModel: Superhero) {
        binding.tvName.text = superHeroModel.name
        binding.tvRealname.text = superHeroModel.realName
        binding.tvPublisher.text = superHeroModel.publisher
        Glide.with(binding.ivPhoto.context).load(superHeroModel.photo).into(binding.ivPhoto)

        //Clic solo en la imagene
        binding.ivPhoto.setOnClickListener {
            Toast.makeText(
                binding.ivPhoto.context,
                superHeroModel.realName,
                Toast.LENGTH_SHORT
            ).show()
        }

        //Clic en cualquier parte del item
        itemView.setOnClickListener {
            Toast.makeText(
                binding.ivPhoto.context,
                superHeroModel.name,
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}