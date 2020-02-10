package com.rizik.training.viewpagerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMenu extends AppCompatActivity {
    TextView detailText, Nama, Harga;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);
// mengambil data dari intent di FirstFragment
        Makanan detMakanan = getIntent().getParcelableExtra("Menu");
        //tampung data ke variabel String dari method getDeskripsi di Makanan
        String nama = detMakanan.getNama();
        String detail = detMakanan.getDeskripsi();
        String harga = detMakanan.getHarga();
        //tandai tempat gambar pad layout mengunakan id layout di activity_detail_menu
        image = findViewById(R.id.image_view);
//tandai tempat TextView di layout menggunakan id
        Nama = findViewById(R.id.tv_nama);
        detailText = findViewById(R.id.tv_detail);
        Harga = findViewById(R.id.tv_harga);
        //ubah isi TextView dengan data dari intent
        Nama.setText(nama);
        detailText.setText(detail);
        Harga.setText(harga);
        //ubah gambar
        image.setImageResource(detMakanan.getImage());

    }
}