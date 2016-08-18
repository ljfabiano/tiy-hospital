package com.tiy.hospital;

/**
 * Created by jfabiano on 8/17/2016.
 */
public class GeneralDiagnostician extends HospitalDoctor implements Doctor, Prescriber
{

    //int speciality = 3;

    public GeneralDiagnostician(String firstName, String lastName, String college, int speciality) {
        super(firstName, lastName, college, speciality);
        //this.speciality = speciality;
    }

    public Diagnosis diagnose() {
        return new Diagnosis(Diagnosis.COMMON_COLD);
    }
    public boolean prescribeMedication(Patient patient)
    {
        patient.setSick(false);
        return true;
    }
}
