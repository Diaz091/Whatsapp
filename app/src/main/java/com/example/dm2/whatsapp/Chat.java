package com.example.dm2.whatsapp;

import android.graphics.drawable.Drawable;

public class Chat {

    private Drawable img;
    private String nombre,frase;

     Chat(Drawable i, String n, String f){
        img=i;
        nombre=n;
        frase=f;
    }


    public Drawable getImg() {

         return img;
    }

    public String getNombre() {

         return nombre;
    }

    public String getFrase() {
        return frase;
    }

}