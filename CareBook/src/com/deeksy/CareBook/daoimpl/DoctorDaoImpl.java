package com.deeksy.CareBook.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.deeksy.CareBook.classes.Doctor;
import com.deeksy.CareBook.dao.DoctorDao;
import com.deeksy.CareBook.util.DbConnection;

public class DoctorDaoImpl implements DoctorDao{

	private static final String INSERT_QUERY="insert into doctor (fname,lname,dob,gender,mobileNo,email,address,specialty) values(?,?,?,?,?,?,?,?)";
	private static final String SELECT_QUERY="select * from doctor";
	@Override
	public boolean addDoctor(Doctor doc) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DbConnection.getConnection();
		PreparedStatement st = con.prepareStatement(INSERT_QUERY);
		st.setString(1,doc.getFname());
        st.setString(2, doc.getLname());
        st.setDate(3, doc.getDob());
        st.setString(4, doc.getGender());
        st.setString(5, doc.getMobile());
        st.setString(6, doc.getEmail());
        st.setString(7, doc.getAddress());
        st.setString(8, doc.getSpeciality());
		return st.executeUpdate()>0;
	}

	@Override
	public boolean updateDoctor(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Doctor> getDoctors() throws SQLException {
		// TODO Auto-generated method stub

		Connection con = DbConnection.getConnection();
		Statement st = con.createStatement();
		List<Doctor> li=new ArrayList<Doctor>();
		ResultSet rs=st.executeQuery(SELECT_QUERY);
		while(rs.next())
		{
			Doctor doctor=new Doctor();
//			 doctor.setuId(rs.getInt("uId"));
	            doctor.setFname(rs.getString("fName"));
	            doctor.setLname(rs.getString("lName"));
	            doctor.setDob(rs.getDate("dob"));
	            doctor.setGender(rs.getString("gender"));
	            doctor.setMobile(rs.getString("mobileNo"));
	            doctor.setEmail(rs.getString("email"));
	            doctor.setAddress(rs.getString("address"));
	            doctor.setSpeciality(rs.getString("specialty"));
	            
	            li.add(doctor);
		}
//		System.out.println(li);
		return li;
	}

}
