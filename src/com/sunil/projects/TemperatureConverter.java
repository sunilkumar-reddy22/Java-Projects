package com.sunil.projects;
import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("====== Temperature converter =====");
            System.out.println("\n--- Menu ---");
            System.out.println("1.Celsius to Fahrenheit");
            System.out.println("2.celcius to Kelvin");
            System.out.println("3.Fahrenheit to Celcius");
            System.out.println("4.Fahrenheit to Kelvin");
            System.out.println("5.Kelvin to Celsisus");
            System.out.println("6.Kelvin to Fahrenheit");
            System.out.println("0.Exit");
            System.out.println("\nEnter your choice: ");
            int choice = input.nextInt();
            if (choice == 0) {
                System.out.println("bye!");
                break;
            }
            if (choice < 1 || choice > 6) {
                System.out.println("Invalid choice. Please check again");
                continue;
            }
            System.out.println("Enter Tempetrature");
            double temp = input.nextDouble();
            double result;
            String resultLable;

            switch (choice) {
                case 1:
                    result = (temp * 9 / 5) + 32;
                    resultLable = "Fahrenheit";
                    break;

                case 2:
                    result = temp + 273.15;
                    resultLable = "Kelvin";
                    break;

                case 3:
                    result = (temp - 32) * 5 / 9;
                    resultLable = "Celcius";
                    break;

                case 4:
                    result = (temp - 32) * 5 / 9 + 273;
                    resultLable = "kelvin";
                    break;

                case 5:
                    result = temp - 273.15;
                    resultLable = "Celsius";
                    break;

                case 6:
                    result = (temp - 273.15) * 9 / 5 + 32;
                    resultLable = "Fahrenheit";
                    break;
                default:
                    result = 0;
                    resultLable = " ";
            }
            System.out.println("Result = " + result + resultLable);
        }
    }
}





