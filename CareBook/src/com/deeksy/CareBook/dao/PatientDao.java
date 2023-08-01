package com.deeksy.CareBook.dao;

import java.util.List;

import com.deeksy.CareBook.classes.Patient;

public interface PatientDao {
	boolean addPatient(Patient p);
	boolean updatePatient(int id);
	List<Patient> getPatient();
}
