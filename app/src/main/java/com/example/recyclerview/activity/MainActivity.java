package com.example.recyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.recyclerview.R;
import com.example.recyclerview.adapter.Adapter;
import com.example.recyclerview.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //listagem
        this.criarFilmes();

        //adapter
        Adapter adapter = new Adapter( listaFilmes );


        //recyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager( layoutManager );
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration( new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

    }

    public void criarFilmes (){

        Filme filme = new Filme("Capitao America","Aventura", "2011");
        this.listaFilmes.add(filme);
        filme = new Filme("Homem aranha","Aventura", "2021");
        this.listaFilmes.add(filme);
        filme = new Filme("Batman","Aventura", "2022");
        this.listaFilmes.add(filme);
        filme = new Filme("Harry Potter","Aventura", "2001");
        this.listaFilmes.add(filme);
        filme = new Filme("Vingadores","Aventura", "2012");
        this.listaFilmes.add(filme);
        filme = new Filme("Carros 3","Comédia", "2017");
        this.listaFilmes.add(filme);
        filme = new Filme("Meu malvado favorito","Comédia", "2010");
        this.listaFilmes.add(filme);
        filme = new Filme("Minions","Comédia", "2015");
        this.listaFilmes.add(filme);
        filme = new Filme("Meu malvado favorito 2","Comédia", "2013");
        this.listaFilmes.add(filme);
        filme = new Filme("Meu malvado favorito 3","Comédia", "2017");
        this.listaFilmes.add(filme);
    }


}