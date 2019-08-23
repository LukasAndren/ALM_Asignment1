package alm_asignment1;

import java.util.Scanner;

public class ALM_Asignment1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "iso8859-1");
        Converter converter = new Converter();

        System.out.println("Welcome to the conversion space! \nSelect what you would like to convert by entering 1 or 2:"
                + "  \n1. Fahrenheit to celcius \n2. Kilometers to knots");

        String mode = sc.nextLine();
      
        switch (mode) {
            case "1":
                System.out.println("1. Fahrenheit to celcius \n2. Celsius to Fahrenheit");
                String mode2 = sc.nextLine();
                if (mode2 == "1") {
                    System.out.println("Write the degrees in fahrenheit: ");
                    //Merge fel
                    
                    int fahrenheit = Integer.parseInt(sc.nextLine());
                    System.out.println(fahrenheit + " fahrenheit is equal to " + converter.fToC(fahrenheit) + " celcius");
                } else if (mode2 == "2") {
                    System.out.println("Write the degrees in celcius: ");
                    int celcius = Integer.parseInt(sc.nextLine());
                    System.out.println(celcius + " celcius is equal to " + converter.cToF(celcius) + " fahrenheit");
                }
                break;

            case "2":
                System.out.println("1. km/h to knots \n2. Knots to km/h");
                String mode3 = sc.nextLine();
                if (mode3 == "1") {
                    System.out.println("Write the speed in km/h");
                    int kmh = Integer.parseInt(sc.nextLine());
                    System.out.println(kmh + " km/h is equal to " + converter.kmhToK(kmh) + " knots");
                } else if (mode3 == "2") {
                    System.out.println("Write the speed in knots");
                    int knots = Integer.parseInt(sc.nextLine());
                    System.out.println(knots + " knots is equal to " + converter.kmhToK(knots) + " kmh");
                }
                break;
        }
    }

    }
}
