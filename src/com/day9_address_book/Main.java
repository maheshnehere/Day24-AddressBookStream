package com.day9_address_book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to day 9 address book program");
        AddressBook ab = new AddressBook();
        ab.book();
        ab.display();
    }
}
