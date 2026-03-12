package com.sunil.projects;
import java.util.Scanner;
import java.util.Random;
public class ApointmentBooking {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Booking Appointment");
        System.out.println("Enter Name: ");
        String name = in.nextLine();
        System.out.println("Enter Phone Number: ");
        String phone = in.nextLine();

        choosedepartment(name, phone);
    }

    static void choosedepartment(String name, String phone) {
        System.out.println("Select Department");
        System.out.println("1.Pediatrics");
        System.out.println("2.Cardiology");
        System.out.println("3.General Medical");
        System.out.println("4.Neurology");
        System.out.println("5.Psychiatry");
        System.out.println("6.Urology");
        System.out.println("Enter Choice");

        int choice = in.nextInt();
        switch (choice) {

            case 1:
                bookappointment(name, phone, "Pediatrics");
                break;

            case 2:
               bookappointment (name, phone, "Cardiology");
                break;

            case 3:
              bookappointment  (name, phone, "General Medical");
                break;

            case 4:
               bookappointment (name, phone, "Neurology");
                break;

            case 5:
                bookappointment(name, phone, "Psychiatry");
                break;

            case 6:
                bookappointment(name, phone, "Urology");
                break;
            default:
                System.out.println("Invalid! Check again");
        }
    }

    static void bookappointment(String name, String phone, String department) {
        Random rand = new Random();
        int appointmentid = rand.nextInt(9000) + 1000;
        System.out.println("Your Appointment Booked Successfully!");
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Department: " + department);
        System.out.println("Appointment id: " + appointmentid);
    }
}

