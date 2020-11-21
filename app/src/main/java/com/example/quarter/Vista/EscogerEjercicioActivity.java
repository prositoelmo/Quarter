package com.example.quarter.Vista;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.quarter.R;

public class EscogerEjercicioActivity extends AppCompatActivity implements View.OnClickListener {
    CardView caminarCard;
    CardView trotarCard;
    CardView correrCard;
    CardView ciclismoCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escoger_ejercicio);
        caminarCard=(CardView) findViewById(R.id.caminarCardLyt);
        trotarCard=(CardView) findViewById(R.id.trotarCardLyt);
        correrCard=(CardView) findViewById(R.id.correrCardLyt);
        ciclismoCard=(CardView) findViewById(R.id.ciclismoCardLyt);

    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(EscogerEjercicioActivity.this, InformacionTiempoRealActivity.class);
        switch (v.getId()){
            case R.id.caminarCardLyt:
                intent.putExtra("tipoCarrera", "Caminata");
                break;
            case R.id.trotarCardLyt:
                intent.putExtra("tipoCarrera", "Trote");
                break;
            case R.id.correrCardLyt:
                intent.putExtra("tipoCarrera", "Carrera");
                break;
            case R.id.ciclismoCardLyt:
                intent.putExtra("tipoCarrera", "Ciclismo");
                break;
        }
        startActivity(intent);
    }
}