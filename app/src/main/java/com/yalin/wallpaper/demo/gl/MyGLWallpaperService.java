package com.yalin.wallpaper.demo.gl;


import net.rbgrn.android.glwallpaperservice.GLWallpaperService;

/**
 * @author jinyalin
 * @since 2017/7/24.
 */

public class MyGLWallpaperService extends GLWallpaperService {
    @Override
    public Engine onCreateEngine() {
        MyEngine engine = new MyEngine();
        return engine;
    }

    private class MyEngine extends GLEngine {
        MyRenderer renderer;

        public MyEngine() {
            super();
            // handle prefs, other initialization
            renderer = new MyRenderer();
            setRenderer(renderer);
            setRenderMode(RENDERMODE_CONTINUOUSLY);
        }

        public void onDestroy() {
            super.onDestroy();
            if (renderer != null) {
                renderer.release();
            }
            renderer = null;
        }
    }
}
