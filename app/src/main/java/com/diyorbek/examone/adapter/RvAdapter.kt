package com.diyorbek.examone.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.diyorbek.examone.databinding.PlanetItemLayoutBinding
import com.diyorbek.examone.model.Planet

class RvAdapter : ListAdapter<Planet, RvAdapter.PlanentViweHolder>(DiffCallBack()) {
    lateinit var onClick: (planet: Planet) -> Unit

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanentViweHolder {
        return PlanentViweHolder(
            PlanetItemLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: PlanentViweHolder, position: Int) {
        holder.bind(getItem(position))
    }

    private class DiffCallBack : DiffUtil.ItemCallback<Planet>() {
        override fun areItemsTheSame(oldItem: Planet, newItem: Planet): Boolean {
            return oldItem.img == newItem.img
        }

        override fun areContentsTheSame(oldItem: Planet, newItem: Planet): Boolean {
            return oldItem == newItem
        }
    }

    inner class PlanentViweHolder(private val binding: PlanetItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(planet: Planet) {
            binding.planetImg.setImageResource(planet.img)
            binding.planetName.text = planet.name
            itemView.setOnClickListener {
                onClick.invoke(planet)
            }
        }
    }
}