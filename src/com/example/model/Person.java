package com.example.model;


public class Person {
    private String name;
    private String contactNumber;
    private String address;
    private String bloodGroup;

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }
    public Person(String name, String contactNumber,String address, String bloodGroup){
        this.name = name;
        this.contactNumber=contactNumber;
        this.address=address;
        this.bloodGroup=bloodGroup;
        
    }
}
