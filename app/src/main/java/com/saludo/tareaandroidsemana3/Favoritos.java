package com.saludo.tareaandroidsemana3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class Favoritos extends AppCompatActivity {

    private Toolbar miActionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);

        miActionBar = (Toolbar) findViewById(R.id.miActionBarFavoritos);
        setSupportActionBar(miActionBar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("Hamster", R.drawable.hamster_img, 4));
        mascotas.add(new Mascota("Gato", R.drawable.cat_img, 3));
        mascotas.add(new Mascota("Perro", R.drawable.dog_img, 2));
        mascotas.add(new Mascota("Conejo", R.drawable.rabbit_img, 2));
        mascotas.add(new Mascota("Tortuga", R.drawable.turtle_img, 1));

        RecyclerView rvMascotasFav = (RecyclerView) findViewById(R.id.rvMascotasFav);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvMascotasFav.setLayoutManager(llm);

        Adaptador adaptador = new Adaptador(mascotas, this);
        rvMascotasFav.setAdapter(adaptador);

    }
}