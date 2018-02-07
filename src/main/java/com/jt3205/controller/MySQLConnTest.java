package com.jt3205.controller;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySQLConnTest {
	private static final String Driver = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://gondr.iptime.org:3306/Y20112?useSSL=false&serverTimezone=Asia/Seoul";
	private static final String User = "Y20112";
	private static final String Pass = "1234";
	
	@Test
	public void testConnection() throws Exception {
		Class.forName(Driver);
		try (Connection conn = DriverManager.getConnection(URL, User, Pass)){
			System.out.println(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
