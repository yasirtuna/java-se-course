package org.example;

public class Main {
    public static void main(String[] args) {

        int sayi1 = 10;
        int saiy2 = 15;
        int sayi3 = 20;
        int sayi4 = 25;
/*
        int [] sayilar = {10,15,20,25};
        int[] sayilar = {10,15,20,25};
        int sayilar [] = {10,15,20,25};
        int sayilar[] = {10,15,20,25};
*/
        int [] sayilar = {10,15,20,25};
        for (int i = 0; i < sayilar.length ; i++) {
            System.out.print(sayilar[i] + " ");
        }

        System.out.println("\n------TEK BOYUTLU DİZİLER------------");

        short myArray [] = new short[4];
/*      myArray[0] = 10;
        myArray[1] = 15;
        myArray[2] = 20;
        myArray[3] = 25;
*/
        /*
        short a = 10; iki short tipin toplamı int değer döndürür shor olmaz
        short b = 15;
        int c = a+b;
        */
/*
        byte a = 10; iki byte tipin toplamı int değer döndürür
        byte b = 20;
        int c = a+b;
*/


        for (int i = 0; i < myArray.length ; i++) {
            myArray[i] = (short) (i+21);
            System.out.println(myArray[i]);

        }

        System.out.println("------COKLU BOYUTLU DİZİLER---------");
        System.out.println("------1D--------");

        // int [] myNumberArr = new init[3];

        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);
        }

        System.out.println("------2D--------");

        // int [][] myNumberArr = new init[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("i: " + i + "      " + "j: " + j);

            }

        }

        System.out.println("------3D--------");

        // int [][][] myNumberArr = new init[3][5][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.println("i: " + i + "      " + "j: " + j + "     " + "k: " + k);
                }

            }

        }
    }
}