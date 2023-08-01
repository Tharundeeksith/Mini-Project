package com.deeksy.CareBook.dao;

import java.sql.SQLException;
import java.util.List;

import com.deeksy.CareBook.classes.Doctor;

public interface DoctorDao {
	boolean addDoctor(Doctor doc) throws SQLException;
	boolean updateDoctor(int id);
	List<Doctor> getDoctors() throws SQLException;
}
