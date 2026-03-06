package com.sunil.projects;
import java.util.Scanner;
public class ProjectConsole {
    public static void main(String[] args) {
        //  System.out.println("Welcome");
        Scanner pro = new Scanner(System.in);
        int mainchoice;

        while (true) {
            System.out.println("Welcome!");
            System.out.println("\n=====MAIN MENU ======");
            System.out.println("1.Calculator");
            System.out.println("2.Number Utility");
            System.out.println("3.Temperature Converter");
            System.out.println("0.Exit");
            System.out.println("Enter your Choice: ");
            mainchoice = pro.nextInt();
            if (mainchoice == 0) {
                System.out.println("Bye!");
                break;
            }

            switch (mainchoice) {
                case 1:
                    System.out.println("\n----Calculator-----");
                    System.out.println("1.Add");
                    System.out.println("2.Subtract");
                    System.out.println("3.Multiply");
                    System.out.println("4.Divide");
                    System.out.println("0.Exit");

                    int calchoice = pro.nextInt();  //Initialization  choice variable to select operators to do function.
                    if (calchoice == 0 || calchoice > 5) {
                        System.out.println("Invalid Input");
                        break;
                    }

                    System.out.println("Enter first Number");
                    int a = pro.nextInt();
                    System.out.println("Enter second Number");
                    int b = pro.nextInt();
                    switch (calchoice) {

                        case 1:
                            System.out.println("result: " + (a + b));
                            break;

                        case 2:
                            System.out.println("result: " + (a - b));
                            break;

                        case 3:
                            System.out.println("result: " + (a * b));
                            break;

                        case 4:
                            System.out.println("result" + (a % b));
                            break;

                        default:
                            System.out.println("Invalid choice");
                    }
                    break;

                case 2:
                    System.out.println("\n----Number Utility----");
                    System.out.println("1.Count digits");
                    System.out.println("2.reverse number");
                    System.out.println("3.Fabinacii number");
                    System.out.println("4.Palindrome number");
                    System.out.println("5.Even or odd");
                    System.out.println("6.Find maximum num");
                    System.out.println("0.Exit");


                    int numchoice = pro.nextInt();
                    if (numchoice == 0) {
                        break;
                    }

                    if (numchoice < 1 || numchoice > 6) {
                        System.out.println("Invalid choice");
                        break;
                    }
                    System.out.println("Enter Number");
                    int num = pro.nextInt();

                    switch (numchoice) {
                        case 1:
                            int temp = num;
                            int count = 0;
                            while (num > 0) {
                                int rem = num % 10;
                                count++;
                                num = num / 10;
                            }
                            System.out.println(count);
                            break;

                        case 2:
                            int temp1 = num;
                            int result = 0;
                            while (num > 0) {
                                int rem = num % 10;
                                result = result * 10 + rem;
                                num = num / 10;
                            }
                            System.out.println(result);
                            break;

                        case 3:
                            int x = 0;
                            int y = 1;
                            int count1 = 2;

                            while (count1 <= num) {
                                int temp0 = y;
                                y = y + x;
                                x = temp0;
                                count1++;
                            }
                            System.out.println(y);
                            break;

                        case 4:
                            int temp2 = num;
                            int result1 = 0;
                            while (num > 0) {
                                int rem = num % 10;
                                result1 = result1 * 10 + rem;
                                num = num / 10;
                            }
                            if (temp2 == result1) {
                                System.out.println("ispalindrome");
                            } else {
                                System.out.println("not palindrome");
                            }
                            break;

                        case 5:
                            if (num % 2 == 0) {
                                System.out.println(num + "is Even");
                            } else {
                                System.out.println(num + "is odd");
                            }
                            break;
                        case 6:
                            int z = pro.nextInt();
                            int m = pro.nextInt();
                            int max = Math.max(num, Math.max(m, z));
                            System.out.println(max + " is maximum number");
                            break;
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }


                case 3:
                    System.out.println("Enter Temparature");
                    System.out.println("1.Celsius to Fahrenheit");
                    System.out.println("Fahrenheit to celsius");
                    System.out.println("0.Exit");
                    int tempchoice = pro.nextInt();
                    if(tempchoice == 0) {
                        break;
                    }
                    System.out.println("Enter Temperature: ");
                    double temp = pro.nextDouble();
                    switch (tempchoice) {

                        case 1:
                            double f = (temp * 9/5) + 32;
                            System.out.println("2.Fahrenheit: " + f);
                            break;

                        case 2:
                            double c = (temp - 32) * 5/9;
                            System.out.println("Celsius: " + c);
                            break;

                        default:
                            System.out.println("Invalid choice");
                    }

                    break;

            }
        }
    }
}





























