package com.example.recycleview_01_alvin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ValorantAdapter(private val context: Context, private val valorant: List<Valorant>, val listener: (Valorant) -> Unit)
    : RecyclerView.Adapter<ValorantAdapter.ValorantViewHolder>(){

    class ValorantViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgValorant = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameValorant = view.findViewById<TextView>(R.id.tv_item_name)
        val descValorant = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(valorant: Valorant, listener: (Valorant) -> Unit){
            imgValorant.setImageResource(valorant.imgValorant)
            nameValorant.text = valorant.nameValorant
            descValorant.text = valorant.descValorant
            itemView.setOnClickListener {
                listener(valorant)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ValorantViewHolder {
        return ValorantViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_valorant, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ValorantViewHolder, position: Int) {
        holder.bindView(valorant[position], listener)
    }

    override fun getItemCount(): Int = valorant.size
    }
