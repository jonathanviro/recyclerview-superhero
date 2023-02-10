package com.javr.recyclerview_superheros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.javr.recyclerview_superheros.adapter.SuperheroAdapter
import com.javr.recyclerview_superheros.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    fun initRecyclerView(){
        binding.recyclerSuperhero.layoutManager = LinearLayoutManager(this)
        binding.recyclerSuperhero.adapter = SuperheroAdapter(SuperheroProvider.listSuperhero){superHeroe ->
            onItemSelected(superHeroe)
        }
    }

    fun onItemSelected(superhero: Superhero){
        Toast.makeText(this, superhero.name, Toast.LENGTH_SHORT).show()
    }


}