package com.day9_address_book;

public class Contact {
    //used encapsulation here to practice the oops concept here
    private String f_name; //first name
    private String l_name; //last name
    private String address;
    private String city;
    private String state;
    private String zip;
    private String ph_no; //phone number
    private String email;
    public Contact(String f_name,String l_name,String address,String city,String state,String zip,String ph_no,String email) {
        this.f_name = f_name;
        this.l_name = l_name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.ph_no = ph_no;
        this.email = email;
    }
    public String getF_name() {
        return f_name;
    }
    public String getL_name() {
        return l_name;
    }
    public String getAddress() {
        return address;
    }
    public String getState() {
        return state;
    }
    public String getCity() {
        return city;
    }
    public String getZip() {
        return zip;
    }
    public String getPh_no() {
        return ph_no;
    }
    public String getEmail() {
        return email;
    }
    public String toString() {
        return "\nFirst name: "+f_name+"\nLast Name: "+l_name
                +"\nAddress: "+address+"\nCity: "+city+"\nState: "+state
                +"\nZip: "+zip+"\nPhone number: "+ph_no+"\nEmail ID: "+email;
    }
}
