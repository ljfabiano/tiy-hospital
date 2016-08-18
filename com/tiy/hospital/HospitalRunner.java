package com.tiy.hospital;

import java.util.Scanner;

/**
 * Created by dbashizi on 8/16/16.
 */
public class HospitalRunner
{
    public static void main(String[] args)
    {
        System.out.println("HospitalRunner.main() ...");
        Scanner inputScan = new Scanner(System.in);
        Hospital myHospital = new Hospital();
        //Ask the user for the doctors at the hospital

        HospitalDoctor[] doctorList = enterDoctorData(inputScan);

        myHospital.setListDoctors(doctorList);

        Patient[] patientlist = enterPatientData(inputScan);

        myHospital.setListPatients(patientlist);

        //Try to match up the patient's illness with a doctor with the proper specialty
        //If there are no doctors to treat that patient's illness, display a message asking them to go to a different hospital
        //If there is a doctor to treat the patient's illness, then have the doctor treat the patient and display the result of the treatment to the user
        matchToDoctor(myHospital.getListDoctors(), myHospital.getListPatients());

        System.out.println("HospitalRunner.main() - done!");
    }

    public static void matchToDoctor(HospitalDoctor[] docList, Patient[] patList)
    {

        //String treatmentResult;

        for (int patIndex = 0; patIndex < patList.length; patIndex++)
        {
            boolean foundDoctor = false;
            for (int docIndex = 0; docIndex < docList.length; docIndex++) {

                if (patList[patIndex].getIllness() == docList[docIndex].getSpeciality()) {
                    //If there is a doctor to treat the patient's illness, then have the doctor treat the patient and display the result of the treatment to the user
                    if (docList[docIndex] instanceof SurgicalOncologist) {
                        foundDoctor = true;
                        boolean success = ((SurgicalOncologist) docList[docIndex]).operate(patList[patIndex]);
                        if (success) {
                            System.out.println("Successful operation!");
                        } else {
                            System.out.println("Operation failed!!!");
                        }
                    } else if (docList[docIndex] instanceof GeneralDiagnostician)
                    {
                        foundDoctor = true;
                        boolean success = ((GeneralDiagnostician) docList[docIndex]).prescribeMedication(patList[patIndex]);
                            //System.out.println("Successful prescription given!");
                        if (success) {
                            System.out.println("Successful prescription given!");
                        } else {
                            System.out.println("Prescription not given!");
                        }
                    }

                }
            }
            if (foundDoctor == false) {
                System.out.println("No doctor for your illness");
            }
            }
        }
        public static HospitalDoctor[] enterDoctorData (Scanner cScanner)
        {

            String fName;
            String lName;
            String college;
            //String illness;
            int speciality;
            System.out.println("Please enter the number of doctors in the hospital:");
            int numDoctors = Integer.valueOf(cScanner.nextLine());
            HospitalDoctor[] docList = new HospitalDoctor[numDoctors];

            for (int docIndex = 0; docIndex < docList.length; docIndex++) {

                System.out.println("Please enter the first name of doctor " + (docIndex + 1) + ":");
                fName = cScanner.nextLine();

                System.out.println("Please enter the last name of doctor " + (docIndex + 1) + ":");
                lName = cScanner.nextLine();

                System.out.println("Please enter the college doctor " + (docIndex + 1) + " attended:");
                college = cScanner.nextLine();

                System.out.println("Please enter the speciality of doctor " + (docIndex + 1) + ":");
                System.out.println("Type 1 for Lung Specialist\nType 2 for Surgical Oncologist\nType 3 for General Diagnostician");
                speciality = Integer.valueOf(cScanner.nextLine());

                if (speciality == 1) {
                    docList[docIndex] = new SurgicalOncologist(fName, lName, college, speciality);
                } else if (speciality == 2) {
                    docList[docIndex] = new LungSpecialist(fName, lName, college, speciality);
                } else {
                    docList[docIndex] = new GeneralDiagnostician(fName, lName, college, speciality);
                }
            }

            System.out.println("Thank you for entering the doctor data.");
            return docList;
        }
        public static Patient[] enterPatientData (Scanner cScanner){

            String fName;
            String lName;

            int illness;

            System.out.println("Please enter the number of patients in the hospital:");
            int numPatients = Integer.valueOf(cScanner.nextLine());
            Patient[] patList = new Patient[numPatients];

            for (int patIndex = 0; patIndex < patList.length; patIndex++) {

                System.out.println("Please enter the first name of patient " + (patIndex + 1) + ":");
                fName = cScanner.nextLine();

                System.out.println("Please enter the last name of patient " + (patIndex + 1) + ":");
                lName = cScanner.nextLine();

                System.out.println("Please enter the illness of patient " + (patIndex + 1) + ":");
                System.out.println("Type 1 for Lung Cancer\nType 2 for Brain Cancer\nType 3 for Common Cold\nType 4 for Strep Throat");
                illness = Integer.valueOf(cScanner.nextLine());


                patList[patIndex] = new Patient(fName, lName, illness);

            }

            System.out.println("Thank you for entering the patient data.");
            return patList;
        }
    }


