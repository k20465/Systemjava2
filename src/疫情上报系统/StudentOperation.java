package �����ϱ�ϵͳ;

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
			System.out.println("******************��ӭʹ������ͳ���ϱ�ϵͳ******************\n");
			System.out .println("**********1.Insert  2.Update 3.Vital 4.BarChart**********\n");
			System.out.println("************************���������Ĳ���**********************\n");
			Scanner input =new Scanner(System.in);
			int c=input.nextInt();
			switch(c) {
			case 1:System.out.println("Insert(��������)");
			//���������ݿ����ݲ���Ĳ���
			//StudentOperation.saveStudent(new Student());
			Insert.main();
			break;
			case 2:System.out.println("Update�������������ݣ�");			
			StudentOperation.updateStudent();
			//StudentOperation.selectStudent();
			break;
			case 3:System.out.println("Vital��ͳ������ȷ�������");
			//StudentOperation.selectStudent();
			StudentOperation.vitalStudent(new Student());
			break;
			case 4:System.out.println("Barchar(�鿴����ͳ�������״ͼ)");
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
	//���ԣ�ͨ��sql��������ݿ��м�������
	public static boolean saveStudent(Student emp) {   
    boolean result = false;
    Connection conn =DatabaseConnection.getConn();
    try {  
    String sqlInset = "insert into Student(Ssno,Sname,Scollege,Sclass,Sdata,Snum,Sprovince,Scity,Sarea,Swuhan,Sabroad, Sinfect) values(?,?,?,?,?,?,?,?,?,?,?,?)";
    PreparedStatement stmt = conn.prepareStatement(sqlInset);   
    stmt.setString(1, emp.getSsno());     //����SQL����һ����������ֵ
    stmt.setString(2, emp.getSname());    //����SQL���ڶ�����������ֵ
    stmt.setString(3, emp.getScollege()); //����SQL����������������ֵ
    stmt.setString(4, emp.getSclass());   //����SQL�����ĸ���������ֵ
    stmt.setString(5, emp.getSdata());    //����SQL���������������ֵ
    stmt.setString(6, emp.getSnum());     //����SQL����������������ֵ
    stmt.setString(7, emp.getSprovince());//����SQL�����߸���������ֵ
    stmt.setString(8, emp.getScity());    //����SQL���ڰ˸���������ֵ
    stmt.setString(9, emp.getSarea());    //����SQL���ھŸ���������ֵ
    stmt.setString(10, emp.getSwuhan());  //����SQL����ʮ����������ֵ
    stmt.setString(11, emp.getSabroad()); //����SQL����ʮһ����������ֵ
    stmt.setString(12, emp.getSinfect()); //����SQL����ʮ������������ֵ
    
    int i = stmt.executeUpdate();         //ִ�в������ݲ���������Ӱ�������
    if (i == 1) {
        result = true;    
    }
    System.out.println("��Ϣ����ɹ�");
    } catch (SQLException e) {
        e.printStackTrace();
    } 
    //finally���ô��ǲ��ܳ����Ƿ�����쳣����Ҫִ��finally��䣬�����ڴ˴��ر�����
    finally { 
        try {
            conn.close(); 
        //��һ��Connection���Ӻ����Ҫ��������close���������ر����ӣ����ͷ�ϵͳ��Դ�����ݿ���Դ
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    return result;   
	}
	
	
	//�����ݿ��в�ѯ��������
	 public static List<Student> selectStudent() {       
	        List<Student> stuList = new ArrayList<Student>();
	        Connection conn = DatabaseConnection.getConn();
	        try {
	            Statement stmt = conn.createStatement();
	            //ִ��SQL�����ؽ����
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
	            	//�ر�����
	                conn.close();                                         
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	      //���ؽ��
	      return stuList;                                             
	    }
	 
	 
	    //2.��������
	 private static void updateStudent() { 
		 Connection conn = DatabaseConnection.getConn(); 
			//StudentOperation.getInstance();
			List<Student> stuList = StudentOperation.selectStudent();
			System.out.println("ѧ��ѧ��\t\tѧ������\t����ѧԺ\t\t���ڰ༶\t\t�����\t\t\t\t����ʡ��\t���ڳ���\t���ڵ���\t�Ƿ�Ϊ�人����\t�Ƿ�Ϊ��ѧ��\t�Ƿ�ȷ��");
			for (Student emp : stuList) {
				System.out.print(emp.getSsno()+"\t"+emp.getSname()+"\t"+emp.getScollege()+"\t\t"+emp.getSclass()+"\t"+emp.getSdata()+"\t\t"+emp.getSprovince()+"\t"+emp.getScity()+"\t"+emp.getSarea()+"\t"+emp.getSwuhan()+"\t\t"+emp.getSabroad()+"\t\t"+emp.getSinfect());
				System.out.println();
				//System.out.println("���ݸ��³ɹ�����ѡ��ͳ�Ʋ鿴����������");
			}
	 }

	  //3.ͳ���������
	    public static boolean vitalStudent(Student emp) { 
	        boolean result = false;
	        Connection conn = DatabaseConnection.getConn();
	        try {
	          //ͳ�����
	        	Statement sta = conn.createStatement();
	        	   //ʹ��statement����ִ��sql���
	        	   ResultSet rs=sta.executeQuery("SELECT count(*) as ����ͳ����Ա����,sum(case when Sinfect='��' then 1 else 0 end)ȷ����Ա����  FROM Student");
	        	   while(rs.next()){
	        		   System.out.println("����ͳ��������Ϊ��");
	        		   System.out.println(rs.getObject(1));
	        		   System.out.println("����ȷ������Ϊ��");
	        		   System.out.println(rs.getObject(2));
	        		   System.out.println("ллʹ��");
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