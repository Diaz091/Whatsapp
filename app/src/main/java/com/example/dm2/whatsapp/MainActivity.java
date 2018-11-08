package com.example.dm2.whatsapp;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ActionMenuItem;
import android.support.v7.view.menu.ActionMenuItemView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TabHost;

import com.example.dm2.whatsapp.Chat;

public class MainActivity extends AppCompatActivity {

    private ListView listaCon, listaLla, listaChat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        TabHost tabs=(TabHost) findViewById(android.R.id.tabhost);
        tabs.setup();

        TabHost.TabSpec spec=tabs.newTabSpec("llamadas");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Llamadas" , null);
        tabs.addTab(spec);

        spec=tabs.newTabSpec("chat");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Chat" , null );
        tabs.addTab(spec);

        spec=tabs.newTabSpec("contacto");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Contactos" , null);
        tabs.addTab(spec);

        tabs.setCurrentTab(0);

        tabs.setOnTabChangedListener( new TabHost.OnTabChangeListener() {

            @SuppressLint("RestrictedApi")
            @Override
            public void onTabChanged(String s) {
                ActionMenuItemView icono = findViewById( R.id.otro );

                if ( s.equalsIgnoreCase("Llamadas" ) ){
                    icono.setIcon( getDrawable( R.mipmap.ic_llamada ) );
                }

                if ( s.equalsIgnoreCase("chat" ) ){
                    icono.setIcon( getDrawable( R.mipmap.ic_chat ) );
                }

                if ( s.equalsIgnoreCase("contacto" ) ){
                    icono.setIcon( getDrawable( R.mipmap.ic_contacto ) );
                }

            }
        });

        //  ================ LLAMADAS ==================== //

        final Llamada[] llamadas ={
                new Llamada(getDrawable(R.mipmap.ic_llamada),"Unai"),
                new Llamada(getDrawable(R.mipmap.ic_llamada),"Goio"),
                new Llamada(getDrawable(R.mipmap.ic_llamada),"Ibon"),
                new Llamada(getDrawable(R.mipmap.ic_llamada),"Marck"),
                new Llamada(getDrawable(R.mipmap.ic_llamada),"Hector"),
        };

        AdaptadorLlamada adpL = new AdaptadorLlamada(this , llamadas);
        listaLla = findViewById(R.id.llamada);
        listaLla.setAdapter( adpL );

        //  ================ CHAT ==================== //

        final Chat[] chats = {
                new Chat(getDrawable( R.mipmap.ic_chat), "Goio"   , "Buenos Días!"),
                new Chat(getDrawable( R.mipmap.ic_chat), "Ibon"   , "Como estas"),
                new Chat(getDrawable( R.mipmap.ic_chat), "Unai"   , "Que tal el día"),
                new Chat(getDrawable( R.mipmap.ic_chat), "Hector" , "Random Message Generated"),
                new Chat(getDrawable( R.mipmap.ic_chat), "Marck"  , "Random Message Generated"),
        };

        AdaptadorChat adpC = new AdaptadorChat( this , chats );
        listaChat = findViewById( R.id.chat );
        listaChat.setAdapter( adpC );

        //  ================ CONTACTOS ==================== //

        final Contacto[] contactos = {
                new Contacto( getDrawable( R.mipmap.ic_contacto),"Unai"),
                new Contacto( getDrawable( R.mipmap.ic_contacto),"Ibon"),
                new Contacto( getDrawable( R.mipmap.ic_contacto),"Goio"),
                new Contacto( getDrawable( R.mipmap.ic_contacto),"Marck"),
                new Contacto( getDrawable( R.mipmap.ic_contacto),"Hector"),
        };

        AdaptadorContacto adpCon = new AdaptadorContacto( this , contactos);
        listaCon= findViewById( R.id.contacto );
        listaCon.setAdapter( adpCon );
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }


}

