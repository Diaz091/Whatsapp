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
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        TabHost tabs=(TabHost) findViewById(android.R.id.tabhost);
        tabs.setup();

        TabHost.TabSpec spec=tabs.newTabSpec("tab1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Llamadas" , null);
        tabs.addTab(spec);

        spec=tabs.newTabSpec("tab2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Chat" , null );
        tabs.addTab(spec);

        spec=tabs.newTabSpec("tab3");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Contactos" , null);
        tabs.addTab(spec);

        tabs.setCurrentTab(0);

        tabs.setOnTabChangedListener( new TabHost.OnTabChangeListener() {

            @SuppressLint("RestrictedApi")
            @Override
            public void onTabChanged(String s) {

                if ( s.equalsIgnoreCase("Llamadas" ) ){
                    ActionMenuItemView icono = findViewById( R.id.otro );
                    icono.setIcon( getDrawable( R.mipmap.ic_android ) );


                }
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }


}

