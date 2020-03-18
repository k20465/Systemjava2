package 疫情上报系统;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnection {

public static void main(String[] args) {
     System.out.println("连接数据库");
	 getConn();
   } 
	public static Connection getConn() {
		Connection conn = null;
		try { 
			//classLoader,加载对应驱动   
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");     
			}
		catch (ClassNotFoundException e) {   
			e.printStackTrace();   
			}  
		String url = "jdbc:sqlserver://localhost:1433;DatabaseName=SYSTEM"; 
		//数据库账户
		String username = "sa"; 
		//数据库密码 
		String password = "123456";    
		try{   
			conn = DriverManager.getConnection(url, username, password);  
			System.out.println("连接数据库成功");
			} 
		catch (SQLException e)
		{   
			e.printStackTrace(); 
		} 
		return conn;
		}
	}