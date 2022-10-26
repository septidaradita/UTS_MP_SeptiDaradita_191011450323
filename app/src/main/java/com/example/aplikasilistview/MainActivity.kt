package com.example.aplikasilistview

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)
        val list = mutableListOf<Indonesia>()

        list.add(Indonesia("Pulau Karimunjawa", "Dengan luas daratan mencapai sekitar 1.500 hektare daan perairan mencapai sekitar 110.000 hektare, " +
                "Kepulauan Karimunjawa menawarkan suaka berlibur dengan pemandangan pulau terindah di Indonesia. Berada di Kabupaten Jepara, Jawa Tengah, Karimunjawa terus dikembangkan menjadi pesona wisata Taman Laut yang digemari wisatawan lokal maupun mancaanegara. "
                +" Tak hanya menawarkan wisata pantai dengan pasir putih yang menyegarkan mata, kamu juga bisa berjalan-jalan di hutan bakau untuk" +
                " menikmati keragaman fauna langka seperti Elang Laut Dada Putih, penyu sisik, dan juga penyu hijau saat berkunjung ke salah satu " +
                "destinasi wisata pulau yang indah di Indonesia ini.,", R.drawable.karimunjawa))
        list.add(Indonesia("Pulau Saumlaki", "Pulau Saumlaki menjadi pilihan destinasi pulau terindah di Indonesia selanjutnya yang bisa kamu kunjungi. Termasuk ke dalam wilayah Kabupaten Maluku Tenggara Barat dan karena letaknya yang berada cukup jauh dari perairan lepas, Pulau Saumlaki lebih dikenal di kalangan masyarakat mancanegara sebagai tempat perlehatan kapal-kapal Australia, Timor Leste, sampai Amerika Serikat. "
                +" Bicara masalah pesona wisata, Pulau Saumlaki tak kalah dengan pulau destinasi populer wisata lain seperti Bali. " +
                "Di salah satu pulau terindah di Indonesia ini, kamu bisa menikmati wisata pantai berpasir putih dan lautan jernih di Pantai Weluan, " +
                "Pantai Pertamina dan Pantai Sembunyi yang menjadi tujuan wisata terkenal daerah tersebut. ", R.drawable.saumlaki))
        list.add(Indonesia("Nusa Penida", "Terletak di sebelah tenggara Pulau Bali dan dipisahkan oleh Selat Badung, terdapat salah satu destinasi pulau terindah di Indonesia yakni Nusa Penida. Tak jauh dari pulau ini, terdapat pula pulau-ulau kecil lain yakni Nusa Ceningan dan Nusa Lembongan yang indah. "
                +" Berkunjung ke Nusa Penida, kamu akan disuguhkan dengan pemandangan pantai yang menakjubkan dan perairan yang terkenal " +
                "sebagai destinasi selam favorit wisatawan seperti mantaa Point, Batu Meling, batu Lumbung, batu Abah, Malibu Point, Toyapakeh, " +
                "dan Crystal Bay.", R.drawable.nusapenida))
        list.add(Indonesia("Pulau Komodo", "Kepulauan Wakatobi yang merupakan bagian dari kawasan Taman Nasional Wakatobi menyimpan tak hanya satu tapi banyak sekali destinasi pulau terindah di Indonesia yang layak untuk kamu kunjungi. Sebut saja Pulau Tomia, Pulau Sawa, Pulau Kaledupa, Pulau Hoga, dan masih banyak pulau-pulau indah lainnya."
                +"Untuk mencapai Pulau Komodo, kamu perlu terbang dahulu ke Labuan Bajo sebelum melanjutkan perjalanan menyebrang ke Pulau Komodo. " +
                "Selain Pulau Komodo, ada beberapa pulau cantik lainnya yang bisa kamu jelajahi di Labuan Bajo seperti Pulau Rinca, Pulau Padar, " +
                "serta pulau-pulau kecil lainnya.,", R.drawable.komodo))
        list.add(Indonesia("Pulau Wakatobi","Kepulauan Wakatobi yang merupakan bagian dari kawasan Taman Nasional Wakatobi menyimpan tak hanya " +
                "satu tapi banyak sekali destinasi pulau terindah di Indonesia yang layak untuk kamu kunjungi. Sebut saja Pulau Tomia, Pulau Sawa, " +
                "Pulau Kaledupa, Pulau Hoga, dan masih banyak pulau-pulau indah lainnya.", R.drawable.sawawakatobi))

        listView.adapter = Destinasi( this, R.layout.listindonesia, list)

        listView.setOnItemClickListener { adapterView, view, i, l ->
            when(i){
                0 -> Toast.makeText(this, "Kamu Memilih Pulau Karimunjawa", Toast.LENGTH_SHORT).show()
                1 -> Toast.makeText(this, "Kamu Memilih Pulau Saumlaki", Toast.LENGTH_SHORT).show()
                2 -> Toast.makeText(this, "Kamu Memilih Nusa Penida", Toast.LENGTH_SHORT).show()
                3 -> Toast.makeText(this, "Kamu Memilih Pulau Komodo", Toast.LENGTH_SHORT).show()
                4 -> Toast.makeText(this, "Kamu Memilih Pulau Wakatobi", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setMessage("Apakah anda yakin ingin keluar?")
            .setPositiveButton("Ya",
                DialogInterface.OnClickListener { dialog, which -> finish() })
            .setNegativeButton("Tidak",
                DialogInterface.OnClickListener { dialog, which -> dialog.cancel() })
            .show()
    }
}