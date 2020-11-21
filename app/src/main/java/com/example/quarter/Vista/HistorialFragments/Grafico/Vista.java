package com.example.quarter.Vista.HistorialFragments.Grafico;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
//aqui se pintara todas las graficas
public class Vista extends View {
    Paint paint = new Paint();

    public Vista(Context context) {
        super(context);
    }
    @Override
    public void onDraw(Canvas canvas) {
        paint.setColor(Color.GREEN);
        Rect rect = new Rect(20, 56, 200, 112);
        canvas.drawRect(rect, paint );
    }
}
