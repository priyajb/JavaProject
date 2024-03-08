package org.doctorapp.client;

import org.doctorapp.exception.DoctorNotFoundException;
import org.doctorapp.model.Doctor;
import org.doctorapp.model.Specialization;
import org.doctorapp.service.DoctorServiceImpl;
import org.doctorapp.service.IDoctorService;

import javax.print.Doc;

public class User {
    public static void main(String[] args) throws DoctorNotFoundException {
        IDoctorService doctorService = new DoctorServiceImpl();

        //enum constant
        Specialization specialization = Specialization.GYNAC;
        String speciality = specialization.getSpeciality();

        String special = Specialization.GYNAC.getSpeciality();
        //doctorService.addDoctor(new Doctor("sachin", "GENERAL PHYSICIAN", 350, 4, 9));
        //doctorService.updateDoctor(1,1000);
        //doctorService.deleteDoctor(7);
       doctorService.getByspecialityAndNameContains("ORTHOPEDIC","praveen");
    }
}
