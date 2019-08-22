package alm_asignment1;

import java.util.Scanner;

public class ALM_Asignment1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "iso8859-1");
        //Converter converter = new Converter();

        System.out.println("Welcome to the conversion space! \nSelect what you would like to convert by entering 1 or 2:"
                + "  \n1. Fahrenheit to celcius \n2. Kilometers to knots");

        String mode = sc.nextLine();

        System.out.println(mode);
    }

}
