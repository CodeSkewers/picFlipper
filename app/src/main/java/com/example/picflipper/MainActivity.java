package com.example.picflipper;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.app.WallpaperManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.io.*;
//import java.lang.Thread;


public class MainActivity extends AppCompatActivity {

    // button to set the home screen wallpaper when clicked
    Button bSetWallpaper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // creating the instance of the WallpaperManager
        final WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());

        // handle the set wallpaper button to set the desired wallpaper for home screen
        bSetWallpaper = findViewById(R.id.set_wallpaper_button);
        bSetWallpaper.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                try {

                    // set the wallpaper by calling the setResource function and
                    //String[] pics = {"R.drawable.baron", "R.drawable.animeguys", "R.drawable.bilgewater_wallpaper02", "R.drawable.cyberpop"};

                    for (int i = 0; i < 5; i++) {
                        wallpaperManager.setResource(R.drawable.baron);
                        wallpaperManager.setResource(R.drawable.animeguys);
                        wallpaperManager.setResource(R.drawable.bilgewater_wallpaper02);
                        wallpaperManager.setResource(R.drawable.cyberpop);
                    }


                    //wallpaperManager.setResource(R.drawable.baron);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}