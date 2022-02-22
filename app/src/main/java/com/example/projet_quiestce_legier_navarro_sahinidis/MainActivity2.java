package com.example.projet_quiestce_legier_navarro_sahinidis;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    Image teste = new Image();
    teste.test();
}

