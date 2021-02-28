package ArrayDuplicates;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // Pirma();
       // Antra();


        System.out.println("****      trecia uzduotis      ***");

        artimiausias(0,20,13);
        artimiausias(-10,2,13);
        artimiausias(8,15,13);

    }

    private static void Pirma() {
        int [] firstArray = {1, 4, 8 , 6, 5};
        int [] secondArray = {9, 1, 7, 8, 2};

        for (int i = 0; i < firstArray.length; i++) {
            for (int x = 0; x < secondArray.length; x++) {
                if(secondArray[x] == firstArray[i]) {
                    System.out.println("Atsikartojantis skaicius yra: " + secondArray[x]);
                }
            }
        }
    }

    private static void Antra() {
        System.out.println("Iveskite kiek skaiciu ivesite: ");
        Scanner scanner = new Scanner(System.in);
        int skaicius = scanner.nextInt();
        int[] naujasMasyvas = new int[skaicius];

        for (int i = 0; i < skaicius; i ++) {
            int sk = 0;
            System.out.println("Iveskite skaiciu: ");
            sk = scanner.nextInt();
            naujasMasyvas[i]=sk;
        }
        for (int naujasMasyva : naujasMasyvas) {
            System.out.println(naujasMasyva);

        }

        System.out.println("Didziausia naujo masyvo verte = " + Arrays.stream(naujasMasyvas).max());
    }


    public static void artimiausias (int firstNumber, int secondNumber, int nearNumber){




        if(Math.abs(nearNumber-firstNumber) < Math.abs(nearNumber-secondNumber)) {
            System.out.println("Arciausias: " + nearNumber + " yra " + firstNumber);
            System.out.println();
        } else  {
            System.out.println("Arciausias: " + nearNumber + " yra " + secondNumber);
        }

    }

}
