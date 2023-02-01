package be.intecbrussel;

import java.util.Random;
import java.util.Scanner; // package importeren !!!!!!

public class MainApp {
    public static void main(String[] args) {

        // maak instantie van de Scanner class, genaamd myScanner
//        Scanner myScanner = new Scanner(System.in);
//        System.out.print("Vul hier je naam in: ");
//        String name = myScanner.nextLine();
//
//        System.out.print("Vul uw familienaam in: ");
//        String achternaam = myScanner.nextLine();
//
//        System.out.print("Vul uw leeftijd in: ");
//        int age = myScanner.nextInt();
//
//        System.out.print("Ben je een man: ");
//        boolean isMale = myScanner.nextBoolean();
//
//        System.out.print("Wat is uw lengte in meters: ");
//        double lenght = myScanner.nextDouble();
//
//        System.out.print("Vul een long waarde in: ");
//        long largeNumber = myScanner.nextLong();

        // Math clas -> static class = altijd aanwezig
        // abs methode
        double x = -10.5;
        double res = Math.abs(x);
        System.out.println("Absolute waarde van x is: " + res);

        // min max
        double i = 10;
        double j = 20;
        double min = Math.min(i, j);
        double max = Math.max(i, j);
        System.out.println("de grootste waarde is: " + max);
        System.out.println("de kleinste waarde is: " + min);

        // round
        x = 10.5;
        res = Math.round(x);
        System.out.println("Afgerond naar het dichtsbijzijnde gehele getal: " + res);

        // ceil -> gaat altijd naar boven afronden
        x = 10.1;
        res = Math.ceil(x);
        System.out.println("Afgerond naar boven : " + res);

        // floor -> afronden naar beneden
        x = 10.9;
        res = Math.floor(x);
        System.out.println("Afgerond naar benenden: " + res);

        // random
        Random random = new Random();

        // int tussen 0 tot 100(exclusief)System.out.println("Random number: " + randonNumber);


        int randonNumber = 0;

        while (randonNumber != 1) {
            randonNumber = random.nextInt(101);
            System.out.println(randonNumber);
        }

        //  random double
        double randomDecimalNumber = random.nextDouble(10, 20);
        System.out.println("Random decimal number: " + randomDecimalNumber);

        //  random float
        float randonFloatNumber = random.nextFloat(5, 10);
        System.out.println("Random float number: " + randonFloatNumber);

        //  random boolean
        boolean randomBoolean = random.nextBoolean();
        System.out.println("Random boolean: " + randomBoolean);
    }
}
