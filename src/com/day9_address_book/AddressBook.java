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
    String[] contacts = {f_name, l_name, address, state, zip, ph_no, email};
    public AddressBook(String f_name, String l_name, String address, String state, String zip, String ph_no, String email) {
        this.f_name = f_name;
        this.l_name = l_name;
        this.address = address;
        this.state = state;
        this.zip = zip;
        this.ph_no = ph_no;
        this.email = email;
    }
    public String toString() {
        return f_name+"\n"+l_name+"\n"+address+"\n"+state+"\n"+zip+"\n"+ph_no+"\n"+email;
    }
}