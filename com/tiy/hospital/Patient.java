package com.tiy.hospital;

/**
 * Created by dbashizi on 8/16/16.
 */
public class Patient extends Person {
    private boolean isSick = true;

    private int illness;

    public int getIllness() {
        return illness;
    }

    public void setIllness(int illness) {
        this.illness = illness;
    }

    public boolean isSick() {
        return isSick;
    }

    public void setSick(boolean sick) {
        isSick = sick;
    }

    public Patient(String firstName, String lastName, int illness) {
        super(firstName, lastName);
        this.illness = illness;
    }
}
