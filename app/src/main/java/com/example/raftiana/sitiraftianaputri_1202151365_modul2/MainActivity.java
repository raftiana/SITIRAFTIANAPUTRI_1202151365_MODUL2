package com.example.raftiana.sitiraftianaputri_1202151365_modul2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "RAFTIANA_1202151365", Toast.LENGTH_LONG).show();
    }

    //method proses
    public void proses (View view){
        final RadioGroup rgmakan = (RadioGroup) findViewById(R.id.rgmakan); //mendefinikan komponen berdasarkan id
        Button btSubmit = (Button) findViewById(R.id.button); //mendefinikan komponen berdasarkan id

        int id = rgmakan.getCheckedRadioButtonId(); //memasukan nilai dalam variabel
        double total; // definisi variabel
        //switch case untuk kondisi jika maka
        switch (id){
            case R.id.dinein :
                intent = new Intent(MainActivity.this, DineIn.class);
                startActivity(intent);
                break;
            case R.id.takeaway :
                intent = new Intent(MainActivity.this, TakeAway.class);
                startActivity(intent);
                break;
        }
    }
}
