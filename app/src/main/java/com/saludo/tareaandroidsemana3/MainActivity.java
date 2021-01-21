package com.saludo.tareaandroidsemana3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMascotas;
    private Toolbar miActionBar;
    private ImageView imgFavoritos;
    ArrayList<Mascota> mascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("Gato", R.drawable.cat_img, 0));
        mascotas.add(new Mascota("Perro", R.drawable.dog_img, 0));
        mascotas.add(new Mascota("Conejo", R.drawable.rabbit_img, 0));
        mascotas.add(new Mascota("Hamster", R.drawable.hamster_img, 0));
        mascotas.add(new Mascota("Tortuga", R.drawable.tortoise_img, 0));

        rvMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvMascotas.setLayoutManager(llm);

        Adaptador adaptador = new Adaptador(mascotas, this);
        rvMascotas.setAdapter(adaptador);

        imgFavoritos = (ImageView) findViewById(R.id.imgFavoritos);
        imgFavoritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent favoritos = new Intent(MainActivity.this, Favoritos.class);
                startActivity(favoritos);
            }
        });

    }
}