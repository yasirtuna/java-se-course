package org.example;

public class App_if {
    public static void main(String[] args) {

        System.out.println("------IF----------");
        int sayi = 3;

        if (5 < sayi) {
            System.out.println("Benim Sayım: " + sayi);
        }

        System.out.println("------IF ELSE----------");
        int yas = 14;

        if (18 <= yas) {
            System.out.println("SAĞLIYOR, yas durumu: " + yas);
        } else {
            System.out.println("SAĞLAMIYOR, YAS:" + yas);
        }

        System.out.println("-----IF IF-ELSE ELSE -----------");

        int puan = 56;

        if (puan>=85  && puan <= 100) { // SART 1
            System.out.println("Tebrikler 5 ");

        } else if (puan>=70 && puan < 85) { // SART 2
            System.out.println("Tebrikler 4");

        } else if (puan >=55 && puan < 70) { // SART 2
            System.out.println("Tebrikler 3");

        } else if (puan >= 45 && puan < 55) { // SART 3
            System.out.println("Tebrikler 2");

        } else { // HICBIRI DEGİLSE
            System.out.println("Tebrikler 1");

        }
    }
}