package com.example.recycleview_01_alvin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val valorantList = listOf<Valorant>(
            Valorant(R.drawable.phoenix,
                nameValorant = "Phoenix",
                descValorant = "Berasal dari Inggris, kekuatan bintang Phoenix bersinar melalui gaya bertarungnya, memicu medan perang dengan kilat dan suar. Apakah dia punya cadangan atau tidak, dia akan buru-buru berkelahi dengan caranya sendiri."
            ),
            Valorant(R.drawable.jett,
                nameValorant = "Jett",
                descValorant = "Mewakili negara asalnya di Korea Selatan, gaya bertarung Jett yang gesit dan menghindar memungkinkannya mengambil risiko yang tidak dapat dilakukan orang lain. Dia berlari mengelilingi setiap pertempuran kecil, memotong musuh bahkan sebelum mereka tahu apa yang menimpa mereka."
            ),
            Valorant(R.drawable.breach,
                nameValorant = "Breach",
                descValorant = "Breach, orang Swedia bionik, menembakkan ledakan kinetik yang kuat dan ditargetkan untuk secara agresif membersihkan jalan melalui tanah musuh. Kerusakan dan gangguan yang ditimbulkannya memastikan tidak ada pertarungan yang adil."
            ),
            Valorant(R.drawable.brimstone,
                nameValorant = "Brimstone",
                descValorant = "Bergabung dari AS, arsenal orbit Brimstone memastikan pasukannya selalu memiliki keunggulan. Kemampuannya untuk memberikan utilitas dengan tepat dan dari jarak jauh membuatnya menjadi komandan boots-on-the-ground yang tak tertandingi."
            ),
            Valorant(R.drawable.chyper,
                nameValorant = "Chyper",
                descValorant = "Broker informasi Maroko, Cypher adalah jaringan pengawasan satu orang yang mengawasi setiap gerakan musuh. Tidak ada rahasia yang aman. Tidak ada manuver yang tidak terlihat. Cypher selalu mengawasi."
            ),
            Valorant(R.drawable.omen,
                nameValorant = "Omen",
                descValorant = "Sebuah bayangan dari memori, Omen berburu dalam bayang-bayang. Dia membuat musuh buta, berteleportasi melintasi lapangan, lalu membiarkan paranoia bertahan saat musuhnya berebut untuk mengetahui di mana dia akan menyerang selanjutnya."
            ),
            Valorant(R.drawable.raze,
                nameValorant = "Raze",
                descValorant = "Raze meledak dari Brasil dengan kepribadiannya yang besar dan senjatanya yang besar. Dengan gaya bermain trauma-tumpul-trauma, dia unggul dalam membilas musuh yang bercokol dan membersihkan ruang sempit dengan dosis \"boom\" yang murah hati."
            ),
            Valorant(R.drawable.reyna,
                nameValorant = "Reyna",
                descValorant = "Ditempa di jantung Meksiko, Reyna mendominasi pertempuran tunggal, muncul dengan setiap pembunuhan yang dia cetak. Kemampuannya hanya dibatasi oleh skill mentahnya, membuatnya sangat bergantung pada performa."
            ),
            Valorant(R.drawable.sova,
                nameValorant = "Sova",
                descValorant = "Born from the eternal winter of Russia's tundra, Sova tracks, finds, and eliminates enemies with ruthless efficiency and precision. His custom bow and incredible scouting abilities ensure that even if you run, you cannot hide."
            ),
            Valorant(R.drawable.viper,
                nameValorant = "Viper",
                descValorant = "Ahli kimia Amerika, Viper menyebarkan berbagai perangkat kimia beracun untuk mengendalikan medan perang dan melumpuhkan penglihatan musuh. Jika racun tidak membunuh mangsanya, permainan pikirannya pasti akan membunuhnya."
            ),
            Valorant(R.drawable.yoru,
                nameValorant = "Yoru",
                descValorant = "Penduduk asli Jepang, Yoru, merobek lubang langsung melalui kenyataan untuk menyusup ke garis musuh yang tak terlihat. Menggunakan penipuan dan agresi dalam ukuran yang sama, dia mendapatkan drop pada setiap target sebelum mereka tahu ke mana harus mencari."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_agent)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ValorantAdapter(this, valorantList){
            val intent = Intent (this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}