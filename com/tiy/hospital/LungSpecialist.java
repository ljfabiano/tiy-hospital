package com.tiy.hospital;

/**
 * Created by jfabiano on 8/17/2016.
 */
public class LungSpecialist extends HospitalDoctor implements Doctor
{
    //int speciality = 2;

    public LungSpecialist(String firstName, String lastName, String college, int speciality) {
        super(firstName, lastName, college, speciality);
        //this.speciality = speciality;
    }

    public Diagnosis diagnose() {
        return new Diagnosis(Diagnosis.LUNG_CANCER);
    }

}
