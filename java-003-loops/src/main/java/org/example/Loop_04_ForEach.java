package org.example;

public class Loop_04_ForEach {
    public static void main(String[] args) { // args = argümanlar

        String student1 = "Barış";
        String student2 = "İbrahim";
        String student3 = "Emre";
        String student4 = "Osman";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

        System.out.println("---------------------");

        String [] students = {"Barış" , "İbrahim" , "Emre" , "Osman","Ertuğrul"};
        System.out.println(students);
        System.out.println(students[0]);

        System.out.println("---FOR----------------");

        for (int i = 0; i < 4; i++) {
            System.out.println(students[i]);

        }

        System.out.println("---FOR 2---------------");

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);

        }

        System.out.println("---FOR 3 ------FOR EACH---------------");

        for ( String student : students  ){
            System.out.println(student);

        }

        System.out.println("---FOR 3 ---int---FOR EACH---------------");

        int [] arrYears = {2000,2005,2010,2015,2017};
        for ( int year  : arrYears  ){
            System.out.println(year);
        }

    }
}
