package com.example.dm2.whatsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdaptadorContacto extends ArrayAdapter<Contacto> {

    private Contacto[] contactos;

    public AdaptadorContacto(Context contexto , Contacto[] contactos ){
        super(contexto , R.layout.lista_items3 , contactos);
        this.contactos = contactos;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from( getContext() );
        View vista = inflater.inflate( R.layout.lista_items3, null);

        ImageView img = vista.findViewById( R.id.imgCont );
        img.setImageDrawable( contactos[ position ].getImg() );

        TextView nombre = vista.findViewById( R.id.nomCont );
        nombre.setText( contactos[ position ].getNombre() );

        return vista;
    }
}
