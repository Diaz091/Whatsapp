package com.example.dm2.whatsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdaptadorLlamada extends ArrayAdapter<Llamada> {

    private Llamada[] llamadas;

    AdaptadorLlamada(Context contexto , Llamada[] llamadas ){
        super(contexto , R.layout.lista_items, llamadas);
        this.llamadas = llamadas;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from( getContext() );
        View vista = inflater.inflate( R.layout.lista_items, null);

        ImageView img = vista.findViewById( R.id.imgLlamada );
        img.setImageDrawable( llamadas[ position ].getImg() );

        TextView nombre  = vista.findViewById( R.id.nomLlamada );
        nombre.setText( llamadas[ position ].getNombre() );

        return vista;
    }
}
