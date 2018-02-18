package com.example.raftiana.sitiraftianaputri_1202151365_modul2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class DineIn extends AppCompatActivity {

    EditText nama;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
    }

    //method yang di gunakan ketika button pesan ditekan
    public void pesan (View view){
        //mendefiniskan kompenen dari layout berdasarkan id
        nama = findViewById(R.id.nama);
        spinner = findViewById(R.id.spinner) ;

        //array adapter untuk spinner
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.spinner, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        if (spinner != null){
            spinner.setAdapter(adapter);
        }

        //untuk mengambil data
        String namaa = nama.getText().toString();
        String spinnerr = spinner.getSelectedItem().toString();

        //pengkondisian
        if (namaa == null || spinnerr == null){ //jika field tidak diisi maka
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("Alert Message");
            alert.setMessage("Silahkan isi data lengkap anda")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }
                    });
            AlertDialog alertDialog = alert.create();
            alertDialog.show();
        } else { //langsung memindahkan ke aktifitas selanjutnya
            Intent intent = new Intent(DineIn.this, Menu.class);
            startActivity(intent);
        }

    }
}
