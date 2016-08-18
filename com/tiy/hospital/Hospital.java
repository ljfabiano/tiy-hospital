package com.tiy.hospital;

/**
 * Created by jfabiano on 8/17/2016.
 */
public class Hospital
{

    private HospitalDoctor[] listDoctors;



    private Patient[] listPatients;

    public HospitalDoctor[] getListDoctors()
    {
        return listDoctors;
    }

    public Patient[] getListPatients()
    {
        return listPatients;
    }

    public void setListDoctors(HospitalDoctor[] listDoctors)
    {
        this.listDoctors = listDoctors;
    }

    public void setListPatients(Patient[] listPatients) {
        this.listPatients = listPatients;
    }

}
