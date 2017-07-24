package com.yalin.wallpaper.demo;

import android.app.WallpaperManager;
import android.content.ComponentName;
import android.content.Intent;
import android.service.wallpaper.WallpaperService;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.yalin.wallpaper.demo.wallpaper01.WallpaperService01;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void setting(View view) {
        Intent intent = new Intent(
                WallpaperManager.ACTION_CHANGE_LIVE_WALLPAPER);
        intent.putExtra(WallpaperManager.EXTRA_LIVE_WALLPAPER_COMPONENT,
                new ComponentName(this, WallpaperService01.class));
        startActivity(intent);
    }

    public void customSetting(View view) {
        startActivity(new Intent(this, SettingActivity.class));
    }
}
