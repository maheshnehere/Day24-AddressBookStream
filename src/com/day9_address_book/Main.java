package com.day9_address_book;

import java.util.Scanner;

public class Main {
    static String f_name; //first name
    static String l_name; //last name
    static String address;
    static String state;
    static String zip;
    static String ph_no; //using string for phone number as I have planned to store all these data in an array
    static String email;
    static String contacts;
    public static void book() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the contact details");
        System.out.println("Enter the first name");
        f_name = "First name: "+sc.next();
        System.out.println("Enter the last name");
        l_name = "Last name: "+sc.next();
        System.out.println("Enter the address line without spaces");
        address  = "Address: "+sc.next();
        System.out.println("Enter the state name");
        state = "State: "+sc.next();
        System.out.println("Enter the Zip code");
        zip = "Zip: "+sc.next();
        System.out.println("Enter the phone number");
        ph_no = "Phone number: "+sc.next();
        System.out.println("Enter the email address");
        email = "Email id: "+sc.next();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to day 9 address book program");
        Main.book();
        AddressBook ab = new AddressBook(f_name,l_name,address,state,zip,ph_no,email);
        contacts = ab.toString();
        System.out.println(contacts);
    }
}
