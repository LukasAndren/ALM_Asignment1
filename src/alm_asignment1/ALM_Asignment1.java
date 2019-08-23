package alm_asignment1;

import java.util.Scanner;

public class ALM_Asignment1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "iso8859-1");
        Converter converter = new Converter();

        System.out.println("Welcome to the conversion space! \nSelect what you would like to convert by entering 1 or 2:"
                + "  \n1. Fahrenheit and celcius \n2. Kilometers and knots");

        String mode = sc.nextLine();

        switch (mode) {
            case "1":
                System.out.println("\n1. Fahrenheit to celcius \n2. Celsius to Fahrenheit");
                String mode2 = sc.nextLine();
                switch (mode2) {
                    case "1":
                        System.out.println("\nWrite the degrees in fahrenheit: ");
                        int fahrenheit = Integer.parseInt(sc.nextLine());
                        System.out.println("\n" + fahrenheit + " fahrenheit is equal to " + converter.fToC(fahrenheit) + " celcius");
                        break;

                    case "2":
                        System.out.println("\nWrite the degrees in celcius: ");
                        int celcius = Integer.parseInt(sc.nextLine());
                        System.out.println("\n" + celcius + " celcius is equal to " + converter.cToF(celcius) + " fahrenheit");
                        break;
                }
                break;

            case "2":
                System.out.println("\n1. km/h to knots \n2. Knots to km/h");
                String mode3 = sc.nextLine();
                switch (mode3) {
                    case "1":
                        System.out.println("\nWrite the speed in km/h");
                        double kmh = Double.parseDouble(sc.nextLine());
                        System.out.println("\n" + kmh + " km/h is equal to " + converter.khmToKnots(kmh) + " knots");
                        break;

                    case "2":
                        System.out.println("\nWrite the speed in knots");
                        int knots = Integer.parseInt(sc.nextLine());
                        System.out.println("\n" + knots + " knots is equal to " + converter.knotsToKmh(knots) + " kmh");
                        break;
                }
                break;
        }
    }

}
