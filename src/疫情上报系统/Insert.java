package 疫情上报系统;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insert {

	public static void main() throws SQLException, ClassNotFoundException {
		System.out.println("请输入相应信息："); 
    	//System.out.println("学生学号\t学生姓名\t所在学院\t所在班级\t填报日期\t\t所在省份\t所在城市\t所在地区\t是否为武汉户籍\t是否为留学生\t是否确诊");
    	Scanner scan = new Scanner(System.in); 
        System.out.println("请输入学号");
        String sno=scan.nextLine();
        System.out.println("请输入姓名");
        String name=scan.nextLine();
        System.out.println("请输入学院");
        String college=scan.nextLine();
        System.out.println("请输入班级");
        String classs=scan.nextLine();
        System.out.println("请输入日期");
        String data=scan.nextLine();
        System.out.println("请输入联系方式");
        String num=scan.nextLine();
        System.out.println("请输入省份");
        String province=scan.nextLine();
        System.out.println("请输入城市");
        String city=scan.nextLine();
        System.out.println("请输入地区");
        String area=scan.nextLine();
        System.out.println("是否为武汉户籍");
        String wuhan=scan.nextLine();
        System.out.println("是否为留学生");
        String abroad=scan.nextLine();
        System.out.println("是否确诊感染");
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
        System.out.println("添加成功，请选择更新查看最新信息");
	}
}
