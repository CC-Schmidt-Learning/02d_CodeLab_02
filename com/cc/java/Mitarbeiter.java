package com.cc.java;

public class Mitarbeiter {
    private String lastName;
    private String firstName;
    private String role;
    private int yearOfEntry;

    

    public Mitarbeiter(String lastName, String firstName, String role, int yearOfEntry) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.role = role;
        this.yearOfEntry = yearOfEntry;
    }


    public String getInfo(String flag) {
        switch (flag) {
            case "#lastname":
                return lastName;
            case "#firstname":
                return firstName;
            case "#role":
                return role;
            default:
                return "#!ERROR";
        }
    }
    public String getYearofEntry() {
            return Integer.toString(yearOfEntry);
    
    }



}
