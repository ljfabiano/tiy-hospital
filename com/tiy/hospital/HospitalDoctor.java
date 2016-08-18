package com.tiy.hospital;

/**
 * Created by dbashizi on 8/16/16.
 */
public abstract class HospitalDoctor extends Person implements Doctor {
    private String college;
    private int speciality;

    public HospitalDoctor(String firstName, String lastName, String college, int speciality) {
        super(firstName, lastName);
        this.college = college;
        this.speciality = speciality;
    }

    public int getSpeciality() {
        return speciality;
    }

    public void setSpeciality(int speciality) {
        this.speciality = speciality;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
