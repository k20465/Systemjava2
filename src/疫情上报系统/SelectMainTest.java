package 疫情上报系统;

import java.util.List;

//测试从数据库中获取数据的方法
public class SelectMainTest {
	public static void main(String[] args) {
		List<Student> stuList = StudentOperation.getInstance().selectStudent();
		System.out.println("学生学号\t\t学生姓名\t所在学院\t\t所在班级\t\t填报日期\t\t\t\t所在省份\t所在城市\t所在地区\t是否为武汉户籍\t是否为留学生\t是否确诊");
		for (Student emp : stuList) {
			System.out.print(emp.getSsno()+"\t"+emp.getSname()+"\t"+emp.getScollege()+"\t\t"+emp.getSclass()+"\t"+emp.getSdata()+"\t\t"+emp.getSprovince()+"\t"+emp.getScity()+"\t"+emp.getSarea()+"\t"+emp.getSwuhan()+"\t\t"+emp.getSabroad()+"\t\t"+emp.getSinfect());
			System.out.println();
		}
	}

}
