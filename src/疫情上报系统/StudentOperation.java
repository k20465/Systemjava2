package 疫情上报系统;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentOperation {
	private static  StudentOperation instance = new StudentOperation();
	public static StudentOperation getInstance() {
		return instance;
	}
	public static void main(String args[]) throws SQLException, ClassNotFoundException {
		do {
			System.out.println("******************欢迎使用疫情统计上报系统******************\n");
			System.out .println("**********1.Insert  2.Update 3.Vital 4.BarChart**********\n");
			System.out.println("************************请输入您的操作**********************\n");
			Scanner input =new Scanner(System.in);
			int c=input.nextInt();
			switch(c) {
			case 1:System.out.println("Insert(插入数据)");
			//用来做数据库数据插入的测试
			//StudentOperation.saveStudent(new Student());
			Insert.main();
			break;
			case 2:System.out.println("Update（更新所有数据）");			
			StudentOperation.updateStudent();
			//StudentOperation.selectStudent();
			break;
			case 3:System.out.println("Vital（统计疫情确诊情况）");
			//StudentOperation.selectStudent();
			StudentOperation.vitalStudent(new Student());
			break;
			case 4:System.out.println("Barchar(查看疫情统计情况柱状图)");
			//StudentOperation.tryy();
			BarChart.main(args);
			break;
			default:
				System.out.println("consonant");
			}
		}while(true);
	}
	

	
	private StudentOperation() {
    }
	//测试：通过sql语句向数据库中加入数据
	public static boolean saveStudent(Student emp) {   
    boolean result = false;
    Connection conn =DatabaseConnection.getConn();
    try {  
    String sqlInset = "insert into Student(Ssno,Sname,Scollege,Sclass,Sdata,Snum,Sprovince,Scity,Sarea,Swuhan,Sabroad, Sinfect) values(?,?,?,?,?,?,?,?,?,?,?,?)";
    PreparedStatement stmt = conn.prepareStatement(sqlInset);   
    stmt.setString(1, emp.getSsno());     //设置SQL语句第一个“？”的值
    stmt.setString(2, emp.getSname());    //设置SQL语句第二个“？”的值
    stmt.setString(3, emp.getScollege()); //设置SQL语句第三个“？”的值
    stmt.setString(4, emp.getSclass());   //设置SQL语句第四个“？”的值
    stmt.setString(5, emp.getSdata());    //设置SQL语句第五个“？”的值
    stmt.setString(6, emp.getSnum());     //设置SQL语句第六个“？”的值
    stmt.setString(7, emp.getSprovince());//设置SQL语句第七个“？”的值
    stmt.setString(8, emp.getScity());    //设置SQL语句第八个“？”的值
    stmt.setString(9, emp.getSarea());    //设置SQL语句第九个“？”的值
    stmt.setString(10, emp.getSwuhan());  //设置SQL语句第十个“？”的值
    stmt.setString(11, emp.getSabroad()); //设置SQL语句第十一个“？”的值
    stmt.setString(12, emp.getSinfect()); //设置SQL语句第十二个“？”的值
    
    int i = stmt.executeUpdate();         //执行插入数据操作，返回影响的行数
    if (i == 1) {
        result = true;    
    }
    System.out.println("信息插入成功");
    } catch (SQLException e) {
        e.printStackTrace();
    } 
    //finally的用处是不管程序是否出现异常，都要执行finally语句，所以在此处关闭连接
    finally { 
        try {
            conn.close(); 
        //打开一个Connection连接后，最后要调用它的close（）方法关闭连接，以释放系统资源及数据库资源
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    return result;   
	}
	
	
	//从数据库中查询所有数据
	 public static List<Student> selectStudent() {       
	        List<Student> stuList = new ArrayList<Student>();
	        Connection conn = DatabaseConnection.getConn();
	        try {
	            Statement stmt = conn.createStatement();
	            //执行SQL并返回结果集
	            ResultSet rs = stmt.executeQuery("select * from Student");
	            while (rs.next()) {
	            	Student emp = new Student();
	                emp.setSsno(rs.getString("Ssno"));   
	                emp.setSname(rs.getString("Sname"));   
	                emp.setScollege(rs.getString("Scollege"));  
	                emp.setSclass(rs.getString("Sclass"));
	                emp.setSdata(rs.getString("Sdata"));
	                emp.setSnum(rs.getString("Snum"));
	                emp.setSprovince(rs.getString("Sprovince"));
	                emp.setScity(rs.getString("Scity"));
	                emp.setSarea(rs.getString("Sarea"));
	                emp.setSwuhan(rs.getString("Swuhan"));
	                emp.setSabroad(rs.getString("Sabroad"));
	                emp.setSinfect(rs.getString("Sinfect"));
	                stuList.add(emp);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            try {
	            	//关闭连接
	                conn.close();                                         
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	      //返回结果
	      return stuList;                                             
	    }
	 
	 
	    //2.更新数据
	 private static void updateStudent() { 
		 Connection conn = DatabaseConnection.getConn(); 
			//StudentOperation.getInstance();
			List<Student> stuList = StudentOperation.selectStudent();
			System.out.println("学生学号\t\t学生姓名\t所在学院\t\t所在班级\t\t填报日期\t\t\t\t所在省份\t所在城市\t所在地区\t是否为武汉户籍\t是否为留学生\t是否确诊");
			for (Student emp : stuList) {
				System.out.print(emp.getSsno()+"\t"+emp.getSname()+"\t"+emp.getScollege()+"\t\t"+emp.getSclass()+"\t"+emp.getSdata()+"\t\t"+emp.getSprovince()+"\t"+emp.getScity()+"\t"+emp.getSarea()+"\t"+emp.getSwuhan()+"\t\t"+emp.getSabroad()+"\t\t"+emp.getSinfect());
				System.out.println();
				//System.out.println("数据更新成功，请选择统计查看疫情具体情况");
			}
	 }

	  //3.统计疫情情况
	    public static boolean vitalStudent(Student emp) { 
	        boolean result = false;
	        Connection conn = DatabaseConnection.getConn();
	        try {
	          //统计语句
	        	Statement sta = conn.createStatement();
	        	   //使用statement对像执行sql语句
	        	   ResultSet rs=sta.executeQuery("SELECT count(*) as 疫情统计人员总数,sum(case when Sinfect='是' then 1 else 0 end)确诊人员总数  FROM Student");
	        	   while(rs.next()){
	        		   System.out.println("疫情统计总人数为：");
	        		   System.out.println(rs.getObject(1));
	        		   System.out.println("疫情确诊人数为：");
	        		   System.out.println(rs.getObject(2));
	        		   System.out.println("谢谢使用");
	        } 
	        }
	        	   catch(Exception e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                conn.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	        return result;
	    }
	}