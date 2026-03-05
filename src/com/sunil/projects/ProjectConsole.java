package com.sunil.projects;
import java.util.Scanner;
public class ProjectConsole {
    public static void main(String[] args) {
        System.out.println("Welcome");
        Scanner pro = new Scanner(System.in);
        int mainchoice;

        while(true) {
            System.out.println("\n=====MAIN MENU ======");
            System.out.println("1.Calculator");
            System.out.println("2.Number Utility");
            System.out.println("3.Temperature Converter");
            System.out.println("4.Exit");
            System.out.println("Enter your Choice: ");
            mainchoice = pro.nextInt();

            switch(mainchoice) {
                case 1:
                    System.out.println("\n----Calculator-----");
                    System.out.println("1.Add");
                    System.out.println("2.Subtract");
                    System.out.println("3.Multiply");
                    System.out.println("4.Divide");

                    int calchoice = pro.nextInt();

                    System.out.println("Enter first Number");
                    double a = pro.nextDouble();
                    System.out.println("Enter second Number");
                    double b = pro.nextDouble();
                    switch(calchoice) {

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

                            int numchoice = pro.nextInt();
                            System.out.println("Enter Number");
                            int num = pro.nextInt();

                            switch(numchoice) {
                                case 1:
                                    int temp = num;
                                    int count = 0;
                                    while (num > 0) {
                                        int rem = num % 10;
                                        count++;
                                        temp = num / 10;
                                    }
                                    System.out.println(count);
                                    break;

                                case 2:
                                    int temp1 = num;
                                    int result = 0;
                                    while (num > 0) {
                                        int rem = num % 10;
                                        result = result * 10 + rem;
                                        temp1 = num / 10;
                                    }
                                    System.out.println(result);
                                    break;

                                case 3:
                                    int x = 0;
                                    int y = 1;
                                    int count1 = 2;

                                    while (num > 0) {
                                        int temp0 = y;
                                        y = y + x;
                                        x = temp0;
                                        count1++;
                                    }
                                    System.out.println("y");
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
                            }
                    }

            }

        }













    }

