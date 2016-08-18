package com.tiy.hospital;

/**
 * Created by dbashizi on 8/16/16.
 */
public class Person {
    private String firstName;
    private String lastName;
    //private String illness;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        //this.illness = illness;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
