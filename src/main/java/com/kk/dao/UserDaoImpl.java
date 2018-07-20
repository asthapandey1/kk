package com.kk.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.kk.entity.Login;
import com.kk.entity.User;

public class UserDaoImpl implements UserDao {

	@Autowired
	DataSource datasource;
	@Autowired
	JdbcTemplate jdbcTemplate;
	private final String sql = "insert into user values(?,?,?,?,?,?,?,?)";

	public boolean register(User user) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kk", "root", null);
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, user.getUsername());
			stmt.setString(2, user.getPassword());
			stmt.setString(3, user.getLastname());
			stmt.setString(4, user.getFirstname());
			stmt.setString(5, user.getEmail());
			stmt.setString(6, user.getPhone());
			stmt.setString(7, user.getAddress());
			stmt.setString(8, user.getRole());
			boolean result = stmt.execute();
			con.close();
			return result;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	public User validateUser(Login login) {
		String sql = "select * from user where username='" + login.getUsername() + "' and password='"
				+ login.getPassword() + "'";
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kk", "root", null);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				User user = new User();
				user.setUsername(rs.getString("id"));
				user.setPassword(rs.getString("password"));
				user.setLastname(rs.getString("lastname"));
				user.setFirstname(rs.getString("firstname"));
				user.setEmail(rs.getString("emailid"));
				user.setPhone(rs.getString("phonenumber"));
				user.setAddress(rs.getString("address"));
				user.setRole(rs.getString("role"));
			} else
				return null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
