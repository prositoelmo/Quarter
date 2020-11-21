package com.example.quarter.Vista.HistorialFragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quarter.R;
import com.example.quarter.Vista.HistorialFragments.RecyclerView.CaminataAdapter;
import com.example.quarter.Vista.HistorialFragments.RecyclerView.CaminataClass;

import java.util.ArrayList;

public class CaminataFragment extends Fragment {

    RecyclerView recyclerCaminatas;
    ArrayList<CaminataClass> listaCaminatas;

    public CaminataFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista=inflater.inflate(R.layout.fragment_caminata, container, false);
        listaCaminatas=new ArrayList<>();
        recyclerCaminatas= (RecyclerView) vista.findViewById(R.id.recyclerCaminata);
        recyclerCaminatas.setLayoutManager(new LinearLayoutManager(getContext()));
        llenarLista();
        CaminataAdapter adapter;
        adapter=new CaminataAdapter(getContext(), listaCaminatas);
        recyclerCaminatas.setAdapter(adapter);

        return vista;
    }
    private void llenarLista(){
        for(int i =1;i<=20; i++){
            listaCaminatas.add(new CaminataClass(i+2+"pm 4 noviembre","Carrera "+i, R.drawable.ic_caminar));
        }

    }
}