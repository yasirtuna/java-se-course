package org.example;

public class Loop_03_While_DoWhile {
    public static void main(String[] args) {
        System.out.println("--------FOR---------------");
        for (int i = 0; i < 4 ; i++) {
            System.out.println(i);
        }

        System.out.println("------WHİLE------------");
        int i = 0; // BASLANGIC
        while (i<4) { // SART

            System.out.println(i);
            i++; // ARTIS YA DA AZALTIM MIKTARI
        }

        System.out.println("------DO WHİLE------------");
        int j = 0; // BASLANGIC
        do {
            System.out.println(j);
            j++; // ARTIS YA DA AZALTIM MIKTARI
        }while (5<j); //SART


    }
}
