package com.example.quarter.Vista;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Switch;

import com.example.quarter.Vista.HistorialFragments.CaminataFragment;
import com.example.quarter.Vista.HistorialFragments.CarreraFragment;
import com.example.quarter.Vista.HistorialFragments.CiclismoFragment;
import com.example.quarter.Vista.HistorialFragments.Grafico.Caminata2Fragment;
import com.example.quarter.Vista.HistorialFragments.Grafico.Carrera2Fragment;
import com.example.quarter.Vista.HistorialFragments.Grafico.Ciclismo2Fragment;
import com.example.quarter.Vista.HistorialFragments.Grafico.Trote2Fragment;
import com.example.quarter.Vista.HistorialFragments.TroteFragment;
import com.example.quarter.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HistorialActivity extends AppCompatActivity implements View.OnClickListener {

    BottomNavigationView bottomNavigationView;
    Switch switctTipoGrafico;
    int valorTipo =0, valorPosicion=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial);
        switctTipoGrafico=findViewById(R.id.switchTipoDeGrafico);
        showSelectedFragment(new CaminataFragment());
        bottomNavigationView=(BottomNavigationView) findViewById(R.id.bottomNavigationHistorial);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.caminataItem:
                            valorPosicion= 0;
                        break;
                    case R.id.troteItem:
                        valorPosicion= 1;
                        break;
                    case R.id.carreraItem:
                        valorPosicion= 2;
                        break;
                    case R.id.ciclismoItem:
                        valorPosicion= 3;
                        break;
                }
                actualizarFragment(valorTipo, valorPosicion);
                return true;

            }
        });

    }
    private void showSelectedFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, fragment).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit();


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.switchTipoDeGrafico:
                if(switctTipoGrafico.isChecked()){
                    valorTipo=1;
                }
                else {
                    valorTipo=0;
                }
        }
        actualizarFragment(valorTipo, valorPosicion);
    }
    private void actualizarFragment(int valorTipo, int valorPosicion){
        if(valorTipo==0){
            switch (valorPosicion){
                case 0:
                    showSelectedFragment(new CaminataFragment());
                    break;
                case 1:
                    showSelectedFragment(new TroteFragment());
                    break;
                case 2:
                    showSelectedFragment(new CarreraFragment());
                    break;
                case 3:
                    showSelectedFragment(new CiclismoFragment());
                    break;
            }
        }
        else {
            switch (valorPosicion){
                case 0:
                    showSelectedFragment(new Caminata2Fragment());
                    break;
                case 1:
                    showSelectedFragment(new Trote2Fragment());
                    break;
                case 2:
                    showSelectedFragment(new Carrera2Fragment());
                    break;
                case 3:
                    showSelectedFragment(new Ciclismo2Fragment());
                    break;
            }
        }
    }
}