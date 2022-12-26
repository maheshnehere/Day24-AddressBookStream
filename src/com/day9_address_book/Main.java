package com.day9_address_book;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    Contact[] contacts = new Contact[1]; //initially only adding single contact
    Scanner sc = new Scanner(System.in);
    public Contact uc1_CreatingContact() {
        System.out.println("Enter the contact details");
        System.out.println("Enter the first name");
        String f_name = sc.next();
        System.out.println("Enter the last name");
        String l_name = sc.next();
        System.out.println("Enter the address line without spaces");
        String address  = sc.next();
        System.out.println("Enter the city name");
        String city = sc.next();
        System.out.println("Enter the state name");
        String state = sc.next();
        System.out.println("Enter the Zip code");
        String zip = sc.next();
        System.out.println("Enter the phone number");
        String ph_no = sc.next();
        System.out.println("Enter the email address");
        String email = sc.next();
        Contact contact = new Contact(f_name, l_name, address, city, state, zip, ph_no, email);
        return contact;
    }
    public void uc2_addingContact(Contact contact) {
        contacts[0] = contact;
        System.out.println("Contact has been added");
    }
    public void display() {
        System.out.println(Arrays.toString(contacts));
    }

    public static void main(String[] args) {
        System.out.println("Welcome to day 9 address book program");
        Main addressBook = new Main();
        Contact contact = addressBook.uc1_CreatingContact();
        addressBook.uc2_addingContact(contact);
        addressBook.display();
    }
}
