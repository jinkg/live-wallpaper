package com.yalin.wallpaper.demo;

import android.app.WallpaperManager;
import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.yalin.wallpaper.demo.gl.AdvanceGLWallpaperService;
import com.yalin.wallpaper.demo.normal.NormalWallpaperService;
import com.yalin.wallpaper.demo.gl.MyGLWallpaperService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void normalWallpaperSelect(View view) {
        Intent intent = new Intent(
                WallpaperManager.ACTION_CHANGE_LIVE_WALLPAPER);
        intent.putExtra(WallpaperManager.EXTRA_LIVE_WALLPAPER_COMPONENT,
                new ComponentName(this, NormalWallpaperService.class));
        startActivity(intent);
    }

    public void normalWallpaperCustom(View view) {
        startActivity(new Intent(this, SettingActivity.class));
    }

    public void glWallpaperSelect(View view) {
        Intent intent = new Intent(
                WallpaperManager.ACTION_CHANGE_LIVE_WALLPAPER);
        intent.putExtra(WallpaperManager.EXTRA_LIVE_WALLPAPER_COMPONENT,
                new ComponentName(this, MyGLWallpaperService.class));
        startActivity(intent);
    }

    public void advanceGLWallpaperSelect(View view) {
        Intent intent = new Intent(
                WallpaperManager.ACTION_CHANGE_LIVE_WALLPAPER);
        intent.putExtra(WallpaperManager.EXTRA_LIVE_WALLPAPER_COMPONENT,
                new ComponentName(this, AdvanceGLWallpaperService.class));
        startActivity(intent);
    }
}
