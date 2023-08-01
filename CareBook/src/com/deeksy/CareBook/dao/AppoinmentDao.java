package com.deeksy.CareBook.dao;

import java.util.List;

import com.deeksy.CareBook.classes.Appoinment;

public interface AppoinmentDao {
	List<Appoinment> viewAppointments(int id);
	boolean addAppointement(Appoinment a);
	boolean cancelAppointement(int id);
	boolean approveAppointment(int id);
}
