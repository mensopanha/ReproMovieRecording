package com.example.mensopanha.repromovierecording;

import android.app.Application;

import io.repro.android.Repro;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Repro.setup(this, "f6ab790a-3aac-4f4e-b6c7-1029da46684f");
    }
}
