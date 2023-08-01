package com.deeksy.CareBook.dao;

import java.sql.SQLException;

import com.deeksy.CareBook.classes.User;

public interface UserDao {
	boolean addUser(User user) throws SQLException;
	User verifyUser(String username,String password) throws SQLException;
}
