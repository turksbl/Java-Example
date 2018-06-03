package com.turk.appulkeler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listeView;
    private List<Ulke> ulkeList;
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {

        listeView = findViewById(R.id.listView);
        ulkeList = new ArrayList<>();

        ulkeList.add(new Ulke("Türkiye",1923,R.drawable.turkiye));
        ulkeList.add(new Ulke("Çin",1949,R.drawable.cin));
        ulkeList.add(new Ulke("ABD",1776,R.drawable.abd));
        ulkeList.add(new Ulke("Hindistan",1947,R.drawable.hindistan));
        ulkeList.add(new Ulke("Birleşik Krallık",1922,R.drawable.ing));

        adapter = new Adapter(this,R.layout.item_layout,ulkeList);

        listeView.setAdapter(adapter);
    }
}
