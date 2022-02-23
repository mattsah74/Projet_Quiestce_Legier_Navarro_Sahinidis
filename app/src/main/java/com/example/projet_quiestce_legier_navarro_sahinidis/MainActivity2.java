package com.example.projet_quiestce_legier_navarro_sahinidis;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    BufferedImage image = ImageIO.read("C:\\Users\\matth\\Documents\\Cours\\S3\\Programmation\\Projet_quiestce_final\\app\\src\\main\\res\\drawable-v24\\cate_test");
    List<BufferedImage> images = new ArrayList<BufferedImage>(2);
        images.add(0,image);
        for (int i=0; i<3 ; i++){
            if(images[i] != null){
                System.out.print("0 ");
            }
    }
}

