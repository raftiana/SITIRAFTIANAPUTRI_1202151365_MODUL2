package com.example.raftiana.sitiraftianaputri_1202151365_modul2;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Menu extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> Menu;
    private ArrayList<Integer> Gambar;
    private ArrayList<String> Harga;
    //Daftar Judul
    private String[] menu = {"Nasi Goreng", "Mie Goreng", "Nasi Uduk", "Kebab", "Nasi Wagyu", "Mie Kuah"};
    //Daftar Harga
    private String[] harga = {"15.000", "7.500", "10.000", "16.000", "24.000", "7.500"};
    //Daftar Gambar
    private int[] gambar = {R.drawable.nasgor, R.drawable.miegoreng,  R.drawable.nasiuduk,
            R.drawable.kebab, R.drawable.nasiwagyu, R.drawable.miekuah};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Menu = new ArrayList<>();
        Harga = new ArrayList<>();
        Gambar = new ArrayList<>();

        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        DaftarItem();

        //Menggunakan Layout Manager, Dan Membuat List Secara Vertical
        layoutManager = new LinearLayoutManager(Menu.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerViewAdapter(Menu, Harga, Gambar);

        //Memasang Adapter pada RecyclerView
        recyclerView.setAdapter(adapter);


        //Membuat Underline pada Setiap Item Didalam List
        DividerItemDecoration itemDecoration = new DividerItemDecoration(getApplicationContext(), DividerItemDecoration.VERTICAL);
        itemDecoration.setDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.line));
        recyclerView.addItemDecoration(itemDecoration);
    }

    //Mengambil data dari Varibale Gambar dan Judul, lalu memasangnya pada list yang terhubung dengan Class Adapter
    private void DaftarItem(){
        for (int w=0; w<menu.length; w++){
            Gambar.add(gambar[w]);
            Menu.add(menu[w]);
            Harga.add(harga[w]);
        }
    }
}