package com.example.quarter.Vista.HistorialFragments.RecyclerView;

public class CaminataClass  {
    private String fecha_hora;
    private String identificador;
    private int imageId;

    public CaminataClass(String fecha_hora, String identificador, int imageId) {
        this.fecha_hora = fecha_hora;
        this.identificador = identificador;
        this.imageId = imageId;
    }

    public String getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(String fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
