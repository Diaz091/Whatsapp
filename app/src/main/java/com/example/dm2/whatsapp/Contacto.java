package com.example.dm2.whatsapp;

import android.graphics.drawable.Drawable;

public class Contacto {

    private Drawable img;
    private String nombre;

    Contacto(Drawable i, String n){
        img=i;
        nombre=n;
    }

    public Drawable getImg() {
        return img;
    }

    public String getNombre() {
        return nombre;
    }
}