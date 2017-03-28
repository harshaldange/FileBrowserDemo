package com.harshaldange.filebrowserdemo;

import android.os.Bundle;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity{

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);

        Resources ressources = getResources();
        TabHost tabHost = getTabHost();

        // video tab
        Intent intentvideo = new Intent().setClass(this, Video_Activity.class);
        TabSpec tabSpec1 = tabHost
                .newTabSpec("Videos")
                .setIndicator("Videos")
                .setContent(intentvideo);

        //music tab
        Intent intentmusic = new Intent().setClass(this,Music_Activity.class);
        TabSpec tabSpec2 = tabHost
                .newTabSpec("Music")
                .setIndicator("Music")
                .setContent(intentmusic);

        // images tab
        Intent intentimages = new Intent().setClass(this, Image_Activity.class);
        TabSpec tabSpec3 = tabHost
                .newTabSpec("Images")
                .setIndicator("Images")
                .setContent(intentimages);

        //pdf tab
        Intent intentpdf = new Intent().setClass(this,pdf_activity.class);
        TabSpec tabSpec4= tabHost
                .newTabSpec("PDF")
                .setIndicator("PDF")
                .setContent(intentpdf);

        // add all tabs
        tabHost.addTab(tabSpec1);
        tabHost.addTab(tabSpec2);
        tabHost.addTab(tabSpec3);
        tabHost.addTab(tabSpec4);

        //set Windows tab as default (zero based)
        tabHost.setCurrentTab(0);
    }

}