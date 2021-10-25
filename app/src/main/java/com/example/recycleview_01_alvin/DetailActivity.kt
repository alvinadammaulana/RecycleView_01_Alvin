package com.example.recycleview_01_alvin

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val valorant = intent.getParcelableExtra<Valorant>(MainActivity.INTENT_PARCELABLE)

        val imgValorant = findViewById<ImageView>(R.id.img_item_photo)
        val nameValorant = findViewById<TextView>(R.id.tv_item_name)
        val descValorant = findViewById<TextView>(R.id.tv_item_description)

        imgValorant.setImageResource(valorant?.imgValorant!!)
        nameValorant.text = valorant.nameValorant
        descValorant.text = valorant.descValorant

    }
}