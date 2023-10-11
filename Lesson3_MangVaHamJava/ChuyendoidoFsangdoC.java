package Lesson3_MangVaHamJava;

import java.util.Scanner;

public class ChuyendoidoFsangdoC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {

            System.out.println("MENU");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.print(" nhap do F: ");
                    fahrenheit = sc.nextInt();
                    System.out.println("tu " + fahrenheit + " do F sang do C la: " + fahrenheitToCelsius(fahrenheit));
                    break;
                }
                case 2: {
                    System.out.print("nhap do C: ");
                    celsius = sc.nextInt();
                    System.out.println("tu " + celsius + "do C sang do F la: " + celsiusToFahrenheit(celsius));
                    break;
                }
                case 3:
                    System.exit(0);
            }
        } while (choice != 3);


    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}

