package com.day9_address_book;
import java.util.Scanner;

public class AddressBook {
    static int size;
    String f_name; //first name
    String l_name; //last name
    String address;
    String state;
    String zip;
    String ph_no; //using string for phone number as I have planned to store all these data in an array
    String email;
    Scanner sc = new Scanner(System.in);
    String[] contacts = new String[7];
    public void book() {
        System.out.println("Enter the contact details");
        System.out.println("Enter the first name");
        f_name = "First name: "+sc.next();
        contacts[0] = f_name;
        System.out.println("Enter the last name");
        l_name = "Last name: "+sc.next();
        contacts[1] = l_name;
        System.out.println("Enter the address line without spaces");
        address = "Address: "+sc.next();
        contacts[2] = address;
        System.out.println("Enter the state name");
        state = "State: "+sc.next();
        contacts[3] = state;
        System.out.println("Enter the Zip code");
        zip = "Zip: "+sc.next();
        contacts[4] = zip;
        System.out.println("Enter the phone number");
        ph_no = "Phone number: "+sc.next();
        contacts[5] = ph_no;
        System.out.println("Enter the email address");
        email = "Email id: "+sc.next();
        contacts[6] = email;
    }
    public void display() {
        for(int i = 0; i < contacts.length; i++) {
            System.out.println(contacts[i]);
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to day 9 address book program");
        AddressBook ab = new AddressBook();
        ab.book();
        ab.display();
    }
}