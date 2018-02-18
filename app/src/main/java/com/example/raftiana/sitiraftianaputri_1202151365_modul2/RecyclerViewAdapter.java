package com.example.raftiana.sitiraftianaputri_1202151365_modul2;

//import android.support.design.widget.Snackbar;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

 /**
 * Created by Raftiana on 17/02/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private ArrayList<String> arrayListMenu; //Digunakan untuk Judul
    private ArrayList<String> arrayListHarga; //Digunakan untuk Harga
    private ArrayList<Integer> gambarMenu; //Digunakan untuk Image/Gambar

    //Membuat Konstruktor pada Class RecyclerViewAdapter
    RecyclerViewAdapter(ArrayList<String> arrayListMenu, ArrayList<String> arrayListHarga, ArrayList<Integer> gambarMenu){
        this.arrayListMenu = arrayListMenu;
        this.arrayListHarga = arrayListHarga;
        this.gambarMenu = gambarMenu;
    }

    //ViewHolder Digunakan Untuk Menyimpan Referensi Dari View-View
    class ViewHolder extends RecyclerView.ViewHolder{

        private TextView menu, harga;
        private ImageView gambar;
        private RelativeLayout ItemList;

        ViewHolder(View itemView) {
            super(itemView);
            //Menginisialisasi View-View untuk kita gunakan pada RecyclerView
            menu = itemView.findViewById(R.id.menu);
            harga = itemView.findViewById(R.id.harga);
            gambar = itemView.findViewById(R.id.gambar);
            ItemList = itemView.findViewById(R.id.item_list);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Membuat View untuk Menyiapkan dan Memasang Layout yang Akan digunakan pada RecyclerView
        View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_design, parent, false);
        ViewHolder VH = new ViewHolder(V);
        return VH;
    }

    @Override
    public void onBindViewHolder(final RecyclerViewAdapter.ViewHolder holder, final int position) {
        //Memanggil Nilai/Value Pada View-View Yang Telah Dibuat pada Posisi Tertentu
        final String nama = arrayListMenu.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        final String harga = arrayListHarga.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        final Integer gambar = gambarMenu.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        holder.menu.setText(nama);
        holder.harga.setText("Harga Rp."+harga);
        holder.gambar.setImageResource(gambar); // Mengambil gambar sesuai posisi yang telah ditentukan
        //Membuat Aksi Saat Judul Pada List ditekan
        holder.menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        //Membuat Aksi Saat List Ditekan
        holder.ItemList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), DetailMenu.class);
                String ingredients;
                switch (position){
                    case 0:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("harga", arrayListHarga.get(position));
                        intent.putExtra("gambar", gambarMenu.get(position));
                        ingredients = "Nasi yang dimasak dengan kecap juga bumbu rempah yang nikmat disertai telur";
                        intent.putExtra("ingredients", ingredients);
                        view.getContext().startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("harga", arrayListHarga.get(position));
                        intent.putExtra("gambar", gambarMenu.get(position));
                        ingredients = "Mie Goreng yang di masak dengan telur yang pedas";
                        intent.putExtra("ingredients", ingredients);
                        view.getContext().startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("harga", arrayListHarga.get(position));
                        intent.putExtra("gambar", gambarMenu.get(position));
                        ingredients = "Nasi uduk tradisional dengan tempe tahu khas indonesia";
                        intent.putExtra("ingredients", ingredients);
                        view.getContext().startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("harga", arrayListHarga.get(position));
                        intent.putExtra("gambar", gambarMenu.get(position));
                        ingredients = "Daging cincang, sayur dan bumbu rempah yang menggugah selera";
                        intent.putExtra("ingredients", ingredients);
                        view.getContext().startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("harga", arrayListHarga.get(position));
                        intent.putExtra("gambar", gambarMenu.get(position));
                        ingredients = "Nasi, Beef wagyu yang sangat nikmat";
                        intent.putExtra("ingredients", ingredients);
                        view.getContext().startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("harga", arrayListHarga.get(position));
                        intent.putExtra("gambar", gambarMenu.get(position));
                        ingredients = "Indomie home made special pake telor";
                        intent.putExtra("ingredients", ingredients);
                        view.getContext().startActivity(intent);
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        //Menghitung Ukuran/Jumlah Data Yang Akan Ditampilkan Pada RecyclerView
        return arrayListMenu.size();
    }

}