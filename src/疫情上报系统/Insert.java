package �����ϱ�ϵͳ;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insert {

	public static void main() throws SQLException, ClassNotFoundException {
		System.out.println("��������Ӧ��Ϣ��"); 
    	//System.out.println("ѧ��ѧ��\tѧ������\t����ѧԺ\t���ڰ༶\t�����\t\t����ʡ��\t���ڳ���\t���ڵ���\t�Ƿ�Ϊ�人����\t�Ƿ�Ϊ��ѧ��\t�Ƿ�ȷ��");
    	Scanner scan = new Scanner(System.in); 
        System.out.println("������ѧ��");
        String sno=scan.nextLine();
        System.out.println("����������");
        String name=scan.nextLine();
        System.out.println("������ѧԺ");
        String college=scan.nextLine();
        System.out.println("������༶");
        String classs=scan.nextLine();
        System.out.println("����������");
        String data=scan.nextLine();
        System.out.println("��������ϵ��ʽ");
        String num=scan.nextLine();
        System.out.println("������ʡ��");
        String province=scan.nextLine();
        System.out.println("���������");
        String city=scan.nextLine();
        System.out.println("���������");
        String area=scan.nextLine();
        System.out.println("�Ƿ�Ϊ�人����");
        String wuhan=scan.nextLine();
        System.out.println("�Ƿ�Ϊ��ѧ��");
        String abroad=scan.nextLine();
        System.out.println("�Ƿ�ȷ���Ⱦ");
        String infect=scan.nextLine();
        Connection conn = DatabaseConnection.getConn();
        String sql="insert into Student(Ssno,Sname,Scollege,Sclass,Sdata,Snum,Sprovince,Scity,Sarea,Swuhan,Sabroad,Sinfect) values(?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement state=conn.prepareStatement(sql);                    
        state.setString(1, sno);                                       
        state.setString(2, name);
        state.setString(3, college);
        state.setString(4, classs);
        state.setString(5, data);
        state.setString(6, num);
        state.setString(7, province);
        state.setString(8, city);
        state.setString(9, area);
        state.setString(10, wuhan);
        state.setString(11, abroad);
        state.setString(12, infect);
        
        state.execute();
        System.out.println("��ӳɹ�����ѡ����²鿴������Ϣ");
	}
}
