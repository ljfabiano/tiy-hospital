package com.tiy.hospital;

/**
 * Created by dbashizi on 8/16/16.
 */
public class SurgicalOncologist extends HospitalDoctor implements Surgeon {

    //int speciality = 1;

    public SurgicalOncologist(String firstName, String lastName, String college, int speciality) {
        super(firstName, lastName, college, speciality);
        //this.speciality = speciality;
    }

    public Diagnosis diagnose() {
        return new Diagnosis(Diagnosis.BRAIN_CANCER);
    }

    public boolean operate(Patient patient) {
        patient.setSick(false);
        return true; // successfull operation
    }
}
