package �����ϱ�ϵͳ;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnection {

public static void main(String[] args) {
     System.out.println("�������ݿ�");
	 getConn();
   } 
	public static Connection getConn() {
		Connection conn = null;
		try { 
			//classLoader,���ض�Ӧ����   
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");     
			}
		catch (ClassNotFoundException e) {   
			e.printStackTrace();   
			}  
		String url = "jdbc:sqlserver://localhost:1433;DatabaseName=SYSTEM"; 
		//���ݿ��˻�
		String username = "sa"; 
		//���ݿ����� 
		String password = "123456";    
		try{   
			conn = DriverManager.getConnection(url, username, password);  
			System.out.println("�������ݿ�ɹ�");
			} 
		catch (SQLException e)
		{   
			e.printStackTrace(); 
		} 
		return conn;
		}
	}