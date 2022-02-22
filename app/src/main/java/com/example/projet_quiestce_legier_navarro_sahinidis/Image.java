package com.example.projet_quiestce_legier_navarro_sahinidis;

import android.media.Image;

import java.util.ArrayList;



public class image {
    String categorie[] = {"Acteurs", "Acteur X", "Peufien", "Youtubers/streamer","TDB", "Sportif","Chanteur", "Perso de film"};

    public void test(){

//        File path = new File("C:\\Users\\matth\\Documents\\Cours\\S3\\Programmation\\Projet_quiestce_final\\app\\src\\main\\res\\drawable-v24\\categorie test");
//            ArrayList<Image> cate1 = new ArrayList<Image>();
//            for (File file : path.listFiles()) {
//            try {
//                BufferedImage img = ImageIO.read(file);
//                if (img != null)
//                    cate1.add(img);
//                else
//                    cate1.add(img);
//
//            } catch (IOException e) {
//                continue;
//            }
//        }
//            for (int i=0; i>cate1.size(); i++){
//                if (cate1!=null){
//                    System.out.print("0 ");
//                }
//            }
        BufferedImage image = ImageIO.read("C:\\Users\\matth\\Documents\\Cours\\S3\\Programmation\\Projet_quiestce_final\\app\\src\\main\\res\\drawable-v24\\cate_test");
        List<BufferedImage> images = new ArrayList<BufferedImage>();
        images.add(image);
        for (int i=0; i<images.size() ; i++){
            if(images[i] != null){
                System.out.print("0 ");
            }
        }
    }
    }
