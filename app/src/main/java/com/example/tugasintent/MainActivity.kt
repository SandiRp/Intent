package com.example.tugasintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testJajan = createDataJajan()
        RV.layoutManager = LinearLayoutManager(this)
        RV.setHasFixedSize(true)
        RV.adapter = adapter(testJajan, { jajanItem: data_jajanan -> jajanItemClicked(jajanItem) })

    }

    private fun jajanItemClicked(jajanItem: data_jajanan) {
        val showIntent = Intent(this, detail::class.java)
        showIntent.putExtra(Intent.EXTRA_TEXT, jajanItem.namaJajan.toString())
        showIntent.putExtra(Intent.EXTRA_TEMPLATE, jajanItem.descJajan.toString())
        showIntent.putExtra(Intent.EXTRA_REFERRER, jajanItem.foto.toString())
        startActivity(showIntent)
    }

    private fun createDataJajan(): List<data_jajanan> {
        val partList = ArrayList<data_jajanan>()
        partList.add(
            data_jajanan(
                "Pentol",
                "Pentol adalah jajanan yang terbuat dari campuran daging sapi giling, dengan tepung kanji, bumbu seperi bawang merah dan putih serta masih banyak lagi.\n\n"+"Harga kisaran 10k hingga 20k saja.",
                R.drawable.pentol
            )
        )
        partList.add(
            data_jajanan(
                "Pok Pok",
                "Ayam goreng khas Taiwan yang garing dan pipih,Jajanan ini memiliki tekstur yang garing di luar dan lembut di dalam karena daging ayamnya. Daging ayam yang dipilih adalah bagian daging dada.\n\n" +
                        "Untuk Harga Dari jajanan ini sekitar 15k-30k saja",
                R.drawable.pokpok
            )
        )
        partList.add(
            data_jajanan(
                "Mie Setan",
                "ini merupakan jajanan/makanan mie tetapi yang membedakan dengan yang lain adalah mie ini diberikan rasa pedas yang luar biasa,jajanan ini hingga sekarang masih hits di surabaya ,kalau ingin membeli jajanan ini anda akan menunggu antrian sealam kurang lebih 1-2jam an.\n\n"
                + "Untuk Harga dari makanan ini kisarannya 10-20k saja ",
                R.drawable.kober
            )
        )
        partList.add(
            data_jajanan(
                "Steak Kedungdoro",
                "jajanan ini kurang lebih sama dengan steak yang ada di restaurant maupun hotel tetapi yang membedakannya adalah hargayang sangat terjangkau,orang-orang memberi julukan rasa bintang lima harga kaki lima ,tetapi anda kalo mau makan ini anda harus betah untuk mengantri seperti memesan kober.\n\n"
                +"untuk kisaran harga 15k hingga 50k",
                R.drawable.steakkdr
            )
        )
        partList.add(
            data_jajanan(
                "Es Permen Karet",
                "Es ini berwarnah merah muda dengan rasa manis dan segar serta ada rasa permen karetnya yang membuat es ini disukai banyak orang terlebih kaula muda.\n\n"+
                "Untuk harganya sangat terjangkau 1 bunguk/gelas diberi harga 4k saja ",
                    R.drawable.permenkaret
            )
        )
        partList.add(
                data_jajanan(
                        "Es Coklat",
                        "Es ini berama es coklat tambah umur ,es ini akhir-akhir ini lagi virat dikarenakan rasanya yang sungguh manis dan segar serta ditemani roti tawar membuat es ini semakin nikmat.\n\n"+
                        "Untuk Harga dari esnya saja yaitu 8k lalu untuk sepaket es dan roti harganya 10k",
                    R.drawable.escoklat
                )
        )
        return partList
    }
}