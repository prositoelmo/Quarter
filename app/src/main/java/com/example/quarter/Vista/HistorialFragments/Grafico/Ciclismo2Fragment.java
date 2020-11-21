package com.example.quarter.Vista.HistorialFragments.Grafico;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.quarter.R;


public class Ciclismo2Fragment extends Fragment {

    ImageView imageView;
    public Ciclismo2Fragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_ciclismo2, container, false);
        imageView=view.findViewById(R.id.ciclismoGrafico);
        Bitmap bitmap=Bitmap.createBitmap(100, 100,Bitmap.Config.ARGB_8888);
        Canvas canvas=new Canvas(bitmap);
        Paint paint=new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.BLACK);
        canvas.drawLine(50,50,10,10, paint);
        imageView.setImageBitmap(bitmap);
        return view;
    }
}