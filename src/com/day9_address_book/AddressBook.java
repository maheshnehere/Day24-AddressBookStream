package com.day9_address_book;
import java.util.Scanner;

public class AddressBook {
    String f_name; //first name
    String l_name; //last name
    String address;
    String state;
    String zip;
    String ph_no; //phone number
    String email;
    public void uc1_CreatingContact() {
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
    public void display() {
        System.out.println(f_name+"\n"+l_name+"\n"+address+"\n"+state+"\n"+zip+"\n"+ph_no+"\n"+email);
    }
}