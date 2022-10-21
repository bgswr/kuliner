package com.andro.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recMenu;
    ArrayList<Makanan> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recMenu = findViewById(R.id.rec_menu);
        recMenu.setLayoutManager(new LinearLayoutManager(this));

        arrayList.add(new Makanan( "Pecel Lele", "Pecel dengan ikan Lele Jamban", "15.000", R.drawable.pecellele));

        arrayList.add(new Makanan( "Nasi Goreng Mercon", "Nasi Goreng dengan Mercon Banting", "14.500", R.drawable.nasgor));

        arrayList.add(new Makanan("Ayam Geprek Keju", "Ayam yang digeprek yang ditambahi Keju", "20.000", R.drawable.geprek));

        arrayList.add(new Makanan("Kari Ayam", "Kari Ayam soalnya Bebeknya habis", "17.500", R.drawable.kariayam));

        arrayList.add(new Makanan("Tahu Bulat", "Tahu dibentuk bulat digoreng kemarin", "500", R.drawable.tahubulat));

        arrayList.add(new Makanan("Salad Buah", "Kombinasi buah beri", "12.000", R.drawable.salad));

        MakananAdapter makananAdapter = new MakananAdapter(this,arrayList);
        recMenu.setAdapter(makananAdapter);
    }

}
