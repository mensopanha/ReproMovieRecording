package com.example.mensopanha.repromovierecording;

import android.app.Application;

import io.repro.android.Repro;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Repro.setup(this, "REPRO_SDK_TOKEN");
    }
}
