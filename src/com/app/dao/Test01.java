package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test01 {
	public static Connection getConnection() {
		Connection conn = null;
		
		//연결에 필요한 정보
		String userName = "hr";
		String userPassword = "1234";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
//		드라이버를 메모리에 할당
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url, userName, userPassword);
			
			System.out.println("연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("연결 정보 오류");
			e.printStackTrace();
		}
		return conn;
		
	}
}
