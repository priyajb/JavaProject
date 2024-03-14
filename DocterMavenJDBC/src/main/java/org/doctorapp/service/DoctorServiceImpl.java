package org.doctorapp.service;

import org.doctorapp.exception.DoctorNotFoundException;
import org.doctorapp.exception.IdNotFoundException;
import org.doctorapp.model.Doctor;
import org.doctorapp.repository.DoctorRepositoryImpl;
import org.doctorapp.repository.IDoctorRepository;

import java.util.Collections;
import java.util.List;

public class DoctorServiceImpl implements IDoctorService {
    IDoctorRepository doctorRepository = new DoctorRepositoryImpl();

    @Override
    public void addDoctor(Doctor doctor) {

        doctorRepository.addDoctor(doctor);
    }

    @Override
    public void updateDoctor(int doctorId, double fees) {

        doctorRepository.updateDoctor(doctorId, fees);
    }

    @Override
    public void deleteDoctor(int doctorId) {
    doctorRepository.deleteDoctor(doctorId);
    }

    @Override
    public Doctor getById(int doctorId) throws IdNotFoundException {
        Doctor doctor=doctorRepository.findById(doctorId);
        if(doctor==null)
        {
           throw new IdNotFoundException("invalid id");
        }
        return doctor;
    }

    @Override
    public List<Doctor> getByspeciality(String speciality) throws DoctorNotFoundException{
        List<Doctor> doctors=doctorRepository.findByspeciality(speciality);
        if (doctors.isEmpty())
                throw new DoctorNotFoundException("doctors with speciality not found");
        Collections.sort(doctors,
                (d1,d2)->((Integer)(d2.getDoctorName().compareTo(d2.getDoctorName()))));


        return doctors;
    }

    @Override
    public List<Doctor> getByspecialityAndExp(String speciality, int experience)throws DoctorNotFoundException {
        List<Doctor> doctors=doctorRepository.findByspecialityAndExp(speciality,experience);
        if(doctors.isEmpty())
            throw new DoctorNotFoundException("");
        Collections.sort(doctors,(d1,d2)->((Integer)(d2.getExperience())).compareTo(d1.getExperience()));;

        return doctors;
    }

    @Override
    public List<Doctor> getByspecialityAndLessFees(String speciality, double fees) throws DoctorNotFoundException {
        List<Doctor> doctors=doctorRepository.findByspecialityAndLessFees(speciality,fees);
        if(doctors.isEmpty())
            throw new DoctorNotFoundException("sdfghj");
        Collections.sort(doctors,(d1,d2)->((Double)(d1.getFees())).compareTo(d2.getFees()));
        return doctors;
    }

    @Override
    public List<Doctor> getByspecialityAndRatings(String speciality, int ratings) throws DoctorNotFoundException {
        List<Doctor> doctors=doctorRepository.findByspecialityAndRatings(speciality,ratings);
        if(doctors.isEmpty())
            throw new DoctorNotFoundException("dfghjkgdgfhjkl");
        Collections.sort(doctors,(d1,d2)->((Integer)(d1.getRatings())).compareTo(d2.getRatings()));


        return doctors;
    }

    @Override
    public List<Doctor> getByspecialityAndNameContains(String speciality, String doctorName) {
        List<Doctor> doctors=doctorRepository.findByspecialityAndNameContains(speciality,doctorName);
        Collections.sort(doctors,(d1,d2)->((d2.getDoctorName())).compareTo(d2.getDoctorName()));
        return doctors;
    }
     @Override
    public List<Doctor> getAll(){
        List<Doctor> doctors=doctorRepository.findAll();
        return doctors;
    }
}