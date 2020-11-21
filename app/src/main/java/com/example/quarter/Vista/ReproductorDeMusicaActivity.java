package com.example.quarter.Vista;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.example.quarter.R;
import com.example.quarter.Vista.MusicaFragments.BotonesMusicaFragment;
import com.example.quarter.Vista.MusicaFragments.ListaMusicaFragment;

public class ReproductorDeMusicaActivity extends AppCompatActivity implements View.OnClickListener {

    FragmentTransaction transaction;
    Fragment fragmentBotones, fragmentLista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reproductor_de_musica);

        fragmentBotones=new BotonesMusicaFragment();
        fragmentLista=new ListaMusicaFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.contenedorFragmentsMusica,fragmentBotones).commit();

    }


    @Override
    public void onClick(View v) {
        transaction=getSupportFragmentManager().beginTransaction();
    switch (v.getId()){
        case R.id.fragmentBotones:
            transaction.replace(R.id.contenedorFragmentsMusica,fragmentBotones);
            transaction.addToBackStack(null);
            break;
        case R.id.fragmentLista:
            transaction.replace(R.id.contenedorFragmentsMusica,fragmentLista);
            transaction.addToBackStack(null);
            break;
        }
        transaction.commit();
    }
}