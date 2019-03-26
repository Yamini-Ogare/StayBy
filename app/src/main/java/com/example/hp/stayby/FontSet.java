package com.example.hp.stayby;

import android.app.Application;

/**
 * Created by hp on 26/03/2019.
 */

public class FontSet extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        FontsOverride.setDefaultFont(this, "SERIF", "fonts/Now_Medium.otf");

    }
}
