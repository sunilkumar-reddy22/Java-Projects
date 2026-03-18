package com.sunil.projects;
import java.util.Scanner;
import java.util.Random;

public class UserBooking {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Name: ");
        String name = in.next();
        System.out.println("Enter Phone: ");
        String phone = in.next();

        chooseDepartment(name, phone);
    }

    static void chooseDepartment(String name, String phone) {
        System.out.println("Select department");
        System.out.println("1.Cardiology");
        System.out.println("2.psychology");
        System.out.println("3.bone doctor ");
        System.out.println("4.urology");
        System.out.println("5.general doctor");
        System.out.println("enter choice");

        int choice = in.nextInt();

        switch (choice) {
            case 1:
                chooseDoctor(name, phone, "cardiology");
                break;
            case 2:
                chooseDoctor(name, phone, "psychology");
                break;
            case 3:
                chooseDoctor(name, phone, "bone doctor");
                break;
            case 4:
                chooseDoctor(name, phone, "urology");
                break;
            case 5:
                chooseDoctor(name, phone, "general doctor");
                break;
            default:
                System.out.println("Invalid choice! Check again");
        }
    }
        static void chooseDoctor(String name,String phone, String  department) {
            System.out.println("Select Doctor");
            System.out.println("1.maya");
            System.out.println("2.nina");
            System.out.println("3.selena");
            System.out.println("4.gomez");
            System.out.println("5.sharama");
            String doctor = "";
            int choice = in.nextInt();
            switch(choice) {
                case 1:
                    doctor = "maya";
                    break;

                case 2:
                    doctor = "nina";
                    break;

                case 3:
                    doctor = "selena";
                    break;

                case 4:
                    doctor = "gomez";
                    break;

                case 5:
                    doctor = "sharama";
                    break;

                default:
                    System.out.println("Invalid choice");
            }
            chooseDay(name, phone, doctor);

        }
        static void chooseDay(String name,String phone,String doctor) {
            System.out.println("Select day");
            System.out.println("1.Monday");
            System.out.println("2.Teausday");
            System.out.println("3.wedneasday");
            System.out.println("4.Thursday");
            System.out.println("5.Friday");
            System.out.println("6.Saturday");
            String day = "";
            int choice = in.nextInt();
            boolean available = false;
            switch(choice) {
                case 1:
                    day = "Monday";
                    available = true;
                    break;
                case 2:
                    day = "Teusday";
                    available = false;
                    break;
                case 3:
                    day = "Wednesday";
                    available = true;
                    break;
                case 4:
                    day = "Thursday";
                    available = true;
                    break;
                case 5:
                    day = "friday";
                    available = false;
                    break;
                case 6:
                    day = "saturday";
                    available = true;
                    break;
                default:
                    System.out.println("invalid choice");
            }
            appointmentid( name,phone, doctor, day,available);

        }
        static void appointmentid(String name, String phone, String doctor, String day,boolean available) {
            if (available) {
                Random rand = new Random();
                int appointmentid  = rand.nextInt(9000) + 1000;
                System.out.println("Your Application Successfully booked");
                System.out.println("Name = " + name);
                System.out.println("Phone = " + phone);
                System.out.println("doctor = " + doctor);
            //    System.out.println("Day = " + day);
                System.out.println("Available = " + day);
                System.out.println("Appointmentid = " + appointmentid);
            } else {
                System.out.println("Doctor won't be Available on this " + day);
                System.out.println("Please choose another day");
            }
        }







}
