package org.doctorapp.service;

import org.doctorapp.exception.DoctorNotFoundException;
import org.doctorapp.exception.IdNotFoundException;
import org.doctorapp.model.Doctor;

import java.util.List;

public interface IDoctorService {
    void addDoctor(Doctor doctor);
    void updateDoctor(int doctorId,double fees);
    void deleteDoctor(int doctorId);

    Doctor getById(int doctorId) throws IdNotFoundException;

    List<Doctor> getByspeciality(String speciality) throws DoctorNotFoundException;
    List<Doctor> getByspecialityAndExp(String speciality,int experience)throws DoctorNotFoundException;
    List<Doctor> getByspecialityAndLessFees(String speciality,double fees) throws DoctorNotFoundException;
    List<Doctor> getByspecialityAndRatings(String speciality,int ratings ) throws DoctorNotFoundException;
    List<Doctor> getByspecialityAndNameContains(String speciality,String doctorName) throws DoctorNotFoundException;

    List<Doctor> getAll();
}
