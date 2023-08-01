package com.deeksy.CareBook.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.deeksy.CareBook.classes.User;
import com.deeksy.CareBook.dao.UserDao;
import com.deeksy.CareBook.util.DbConnection;

public class UserDaoImpl implements UserDao{
	
	private static final String INSERT_QUERY="insert into users (username,password,type) values(?,?,?)";
	private static final String VERIFY_QUERY="SELECT * FROM users where username=?";
	@Override
	public boolean addUser(User user) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DbConnection.getConnection();
		PreparedStatement st = con.prepareStatement(INSERT_QUERY,Statement.RETURN_GENERATED_KEYS);
		st.setString(1, user.getUsername());
        st.setString(2, user.getPassword());
        st.setString(3, user.getType());
        int rowsAffected = st.executeUpdate();
        if (rowsAffected > 0) {
            try (ResultSet generatedKeys = st.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    user.setUserId(generatedKeys.getInt(1));
                    return true; // User added successfully
                }
            }
        }
        return false;
//		return false;
	}

	@Override
	public User verifyUser(String username, String password) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DbConnection.getConnection();
		PreparedStatement st = con.prepareStatement(VERIFY_QUERY);
		st.setString(1, username);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
            String storedPassword = rs.getString("password");
            if(storedPassword.equals(password))
            {
            	User user=new User(rs.getString("username"),rs.getString("password"),rs.getString("type"));
            	user.setUserId(rs.getInt("userId"));
            	return user;
            }
        }
        
		return null;
	}

}
