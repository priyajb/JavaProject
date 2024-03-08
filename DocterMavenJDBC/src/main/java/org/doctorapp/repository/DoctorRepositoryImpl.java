package org.doctorapp.repository;

import org.doctorapp.model.Doctor;
import org.doctorapp.util.DoctorDb;
import org.doctorapp.util.Queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DoctorRepositoryImpl implements IDoctorRepository {
    @Override
    public void addDoctor(Doctor doctor) {
        //establish connection

        try (Connection connection = DoctorDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.INSERTQUERY);
        ) {

            statement.setString(1, doctor.getDoctorName());
            statement.setString(2, doctor.getSpeciality());
            statement.setInt(3, doctor.getExperience());
            statement.setInt(4, doctor.getRatings());
            statement.setDouble(5, doctor.getFees());

            boolean result = statement.execute();
            System.out.println("one row inserted");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateDoctor(int doctorId, double fees) {
        try (Connection connection = DoctorDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.UPDATEQUERY);
        ) {

            statement.setInt(2, doctorId);
            statement.setDouble(1, fees);


            int result = statement.executeUpdate();
            System.out.println("one row updated");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void deleteDoctor(int doctorId) {
        try (Connection connection = DoctorDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.DELETEQUERY);
        ) {
            statement.setInt(1, doctorId);

            int result = statement.executeUpdate();
            System.out.println("one row is deleted");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public Doctor findById(int doctorId) {


        return null;
    }

    @Override
    public List<Doctor> findAll() {
        //establish a connection
        //create empty list
        //create a prepared statement
        //call executequery
        List<Doctor> doctors = new ArrayList<>();
        try (Connection connection = DoctorDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.FINDALLQUERY);
        ) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int doctorId = resultSet.getInt("doctor_id");
                String doctorName = resultSet.getString("doctor_name");
                String speciality = resultSet.getString("speciality");
                int experience = resultSet.getInt("experience");
                double fees = resultSet.getDouble("fees");
                int ratings = resultSet.getInt("ratings");

                Doctor doctor = new Doctor(doctorId, doctorName, fees, ratings, experience);
                doctors.add(doctor);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        return null;
    }

    @Override
    public List<Doctor> findByspeciality(String speciality) {
        List<Doctor> doctors = new ArrayList<>();
        try (Connection connection = DoctorDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.FINDALLQUERY);
        ) {
            statement.setString(1, speciality);
           try( ResultSet resultSet = statement.executeQuery();){
               while (resultSet.next()) {
                   String doctorName=resultSet.getString("doctor_name");
                   int experience = resultSet.getInt("experience");
                   int ratings = resultSet.getInt("ratings");
                   int doctorId = resultSet.getInt("doctor_id");
                   double fees = resultSet.getDouble("fees");


                   Doctor doctor=new Doctor();
                   doctor.setDoctorName(resultSet.getString("doctor_name"));
                   doctor.getSpeciality(speciality);
                   doctor.setExperience(experience);
                   doctor.setDoctorId(doctorId);
                   doctor.setFees(fees);
                   doctor.getRatings(ratings);
                   doctors.add(doctor);


               }
           }
        } catch (Exception e) {
            e.printStackTrace();
        }


        return doctors;
    }

    @Override
    public List<Doctor> findByspecialityAndExp(String speciality, int experience) {
        return null;
    }

    @Override
    public List<Doctor> findByspecialityAndLessFees(String speciality, double fees) {
        return null;
    }

    @Override
    public List<Doctor> findByspecialityAndRatings(String speciality, int ratings) {
        return null;
    }

    @Override
    public List<Doctor> findByspecialityAndNameContains(String speciality, String doctorName) {
        List<Doctor> doctors = new ArrayList<>();
        try (Connection connection = DoctorDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECANDNAME);
        ) {
            statement.setString(1, speciality);
            statement.setString(2,"%"+doctorName+"%");
            try( ResultSet resultSet = statement.executeQuery();){
                while (resultSet.next()) {
                    Doctor doctor=new Doctor();
                    doctor.setDoctorName(resultSet.getString("doctor_name"));
                    doctor.setSpeciality(resultSet.getString("speciality"));
                    doctor.setExperience(resultSet.getInt("experience"));
                    doctor.getRatings(resultSet.getInt("ratings"));
                    doctor.getDoctorId(resultSet.getInt("doctor_id"));
                    doctors.add(doctor);





                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        return doctors;
    }
    }
