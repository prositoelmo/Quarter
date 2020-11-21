package com.example.quarter.Vista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.quarter.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.botonCorrer:
                intent=new Intent(MainActivity.this, EscogerEjercicioActivity.class);
                startActivity(intent);
                break;
            case R.id.estadisticas:
                intent=new Intent(MainActivity.this, HistorialActivity.class);
                startActivity(intent);
                break;
            case  R.id.musica:
                intent=new Intent(MainActivity.this, ReproductorDeMusicaActivity.class);
                startActivity(intent);
                break;
        }



        }
}