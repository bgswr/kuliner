package com.andro.menumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DescActivity extends AppCompatActivity {

    ImageView gmbr;
    TextView txtName, txtDesc, txtPrc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc);

        getSupportActionBar().hide();
        gmbr = findViewById(R.id.gmbr);
        txtName = findViewById(R.id.txtName);
        txtDesc = findViewById(R.id.txtDesc);
        txtPrc = findViewById(R.id.txtPrc);

        Intent intent = getIntent();
        String nama = intent.getExtras().getString("nama");
        String deskripsi = intent.getExtras().getString("deskripsi");
        String harga = intent.getExtras().getString("harga");
        int gambar = intent.getExtras().getInt("id_gambar");

        gmbr.setImageResource(gambar);
        txtName.setText(nama);
        txtDesc.setText(deskripsi);
        txtPrc.setText(harga);

    }

}
