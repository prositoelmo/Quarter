package com.example.quarter.Vista.HistorialFragments.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quarter.R;

import java.util.ArrayList;

public class CaminataAdapter extends RecyclerView.Adapter<CaminataAdapter.ViewHolder> implements View.OnClickListener{

    LayoutInflater inflater;
    ArrayList<CaminataClass> listaCaminatas;
    private View.OnClickListener listener;
    public CaminataAdapter(Context context, ArrayList<CaminataClass> listaCaminatas){
        this.inflater=LayoutInflater.from(context);
        this.listaCaminatas=listaCaminatas;

    }
    @NonNull
    @Override
    public CaminataAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= inflater.inflate(R.layout.lista_caminatas,null,false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CaminataAdapter.ViewHolder holder, int position) {
        String identificador= listaCaminatas.get(position).getIdentificador();
        String fechaHora=listaCaminatas.get(position).getFecha_hora();
        holder.identificador.setText(identificador);
        holder.fechaHora.setText(fechaHora);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public void onClick(View v) {
        if(listener!=null){
            listener.onClick(v);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView identificador;
        TextView fechaHora;
        ImageView imagenTipo;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            identificador=itemView.findViewById(R.id.identificador);
            fechaHora=itemView.findViewById(R.id.fechaHora);
            imagenTipo=itemView.findViewById(R.id.tipoRecorrido);
        }

    }
    public void setOnClickListener(View.OnClickListener  listener){
        this.listener=listener;
    }
}
