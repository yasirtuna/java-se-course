package org.example;

public class Loop_01_For {
    public static void main(String[] args) {

      /*  int a = 10;
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
      */

        String firstName = "Uğur";
        String lastName = "Semiz";

        int b =20;
            // BASLANGIC        SINIR        ARTİS MİKTARİ
        for (int counter = 1;          counter <= 5;       counter++) {
            System.out.println(counter +" - " +  firstName + " " + lastName);

        }

        System.out.println("-----------ARTTIRMA---------");

        for (int counter = 0;          counter < 10+5;       counter++) {
            System.out.println(counter);
        }

        System.out.println("----------KADEMELİ ARTTIRMA----------");

        for (int counter = 0;          counter < 10+5;       counter = counter+4) { // counter +=4 (aynısı)
            System.out.println(counter);
        }

        System.out.println("--------AZALTMA------");


        for (int counter = 50;          0 < counter;       counter--) {
            System.out.println(counter);
        }

        System.out.println("--------KADEMELİ AZALTMA------");

        for (int counter = 50;          0 < counter;       counter= counter-8) { // counter -=8(aynısı)
            System.out.println(counter);
        }



    }
}