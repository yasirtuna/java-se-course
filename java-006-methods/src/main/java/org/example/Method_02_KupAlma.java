package org.example;

import java.sql.SQLOutput;

public class Method_02_KupAlma {


    public static void main(String[] args) {
     /*

        int tamSayi = 2;
        float virgulluSayi1 = 2.123456f;
        // float virgulluSayi1 = 2.123456F;
        // float virgulluSayi1 = (float)2.123456;
        // double virgulluSayi2 = 2.331315151;
    */
        float sonuc = kupAl(2.0f);
        System.out.println(sonuc);

        sonuc = sayininUssunuAlHesapYap(2.0F, 5);
        System.out.println(sonuc);

    }

    private static float kupAl(float myNumber) {
        return (float) Math.pow(myNumber, 3);
//         return myNumber * myNumber * myNumber;
    }

    private static float sayininUssunuAlHesapYap(float taban, int us) {
        return (float) Math.pow(taban, us);
    }

}
