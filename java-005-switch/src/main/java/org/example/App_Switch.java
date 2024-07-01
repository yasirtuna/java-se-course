package org.example;

public class App_Switch {
    public static void main(String[] args) {
        /*
        if (SART1){

        } else if (SART2){

        }  else if (SART3){

        } else if (SART4){

        } else if (SART5){

        }
        */
        int secilen =1;

        switch (secilen){
            case 0:
                System.out.println("Gidilecek menu: " + secilen );
                break;
            case 1:
                System.out.println("Gidilecek menu: " + secilen );
                break;
            case 2:
                System.out.println("Gidilecek menu: " + secilen );
                break;
            case 3:
                System.out.println("Gidilecek menu: " + secilen );
                break;
            default:
                System.out.println("Ana menuye gidilecek.");
                break;
        }

    }
}