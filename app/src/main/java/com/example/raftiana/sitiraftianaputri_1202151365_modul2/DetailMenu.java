package com.example.raftiana.sitiraftianaputri_1202151365_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //membuat button back pada action bar muncul

        //menerima nilai yang dilempar dari activity menu sebelumnya
        String menu = getIntent().getStringExtra("menu");
        String price = getIntent().getStringExtra("harga");
        String komposisi = getIntent().getStringExtra("ingredients");
        Integer image = getIntent().getIntExtra("gambar", 0);

        //mendefinisikan semua kompenen berdasarkan id
        TextView txtMenu = findViewById(R.id.namaMenu);
        TextView txtPrice = findViewById(R.id.harga);
        TextView txtkomposisi = findViewById(R.id.ingredients);
        ImageView images = findViewById(R.id.gambar);

        //menyimpan nilai yang sudah ditangkap kedalam kompenen yang sudah di definisikan
        txtMenu.setText(menu);
        txtPrice.setText(price);
        txtkomposisi.setText(komposisi);
        images.setImageResource(image);
    }

    @Override
    public boolean onSupportNavigateUp() {
        //function ketika button back di klik maka akan kembali ke view sebelumnya
        onBackPressed();
        return true;
    }
}
