package com.example.mensopanha.repromovierecording;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.repro.android.Repro;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Repro.startRecording();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Repro.stopRecording();
    }
}
