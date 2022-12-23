package com.day9_address_book;
import java.util.Scanner;

public class AddressBook {
    String f_name; //first name
    String l_name; //last name
    String address;
    String state;
    String zip;
    String ph_no; //using string for phone number as I have planned to store all these data in an array
    String email;
    Scanner sc = new Scanner(System.in);
    public void book() {
        System.out.println("Enter the contact details");
        System.out.println("Enter the first name");
        f_name = sc.next();
        System.out.println("Enter the last name");
        l_name = sc.next();
        System.out.println("Enter the address line without spaces");
        address = sc.next();
        System.out.println("Enter the state name");
        state = sc.next();
        System.out.println("Enter the Zip code");
        zip = sc.next();
        System.out.println("Enter the phone number");
        ph_no = sc.next();
        System.out.println("Enter the email address");
        email = sc.next();
    }
    public void display() {
        System.out.println("First name: "+f_name+"\nLast name: "+l_name+"\nAddress: "+address+"\nState: "+state+
                "\nZip code: "+zip+"\nPhone number: "+ph_no+"\nEmail address: "+email);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to day 9 address book program");
        AddressBook ab = new AddressBook();
        ab.book();
        ab.display();
    }
}
