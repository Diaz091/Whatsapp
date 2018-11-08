package com.example.dm2.whatsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dm2.whatsapp.R;

public class AdaptadorChat extends ArrayAdapter<Chat> {

    private Chat[] chats;

    AdaptadorChat(Context contexto , Chat[] chats ){
        super(contexto , R.layout.lista_items2, chats);
        this.chats = chats;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from( getContext() );
        View vista = inflater.inflate( R.layout.lista_items2, null);

        ImageView img = vista.findViewById( R.id.imgChat );
        img.setImageDrawable( chats[ position ].getImg() );

        TextView nombre = vista.findViewById( R.id.nomChat );
        nombre.setText( chats[ position ].getNombre() );

        TextView frase = vista.findViewById( R.id.fraChat );
        frase.setText( chats[ position ].getFrase());
        return vista;
   }
}