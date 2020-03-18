package 疫情上报系统;

public class MainTest {

	public static void main(String[] args) {
		Student emp = new Student();
		emp.setSsno("20202020");
		emp.setSname("李小是");
		emp.setScollege("化工学院");
		emp.setSclass("计工工");
		emp.setSdata("2020/3/4");
		emp.setSprovince("河南");
		emp.setScity("朋有");
		emp.setSarea("垢地");
		emp.setSwuhan("否");
		emp.setSabroad("否");
		emp.setSinfect("是");
		StudentOperation.getInstance();
		boolean res = StudentOperation.saveStudent(emp);
		if(res == true) {
			System.out.println("向表中插入数据成功");
		}
		else {
			System.out.println("向表中插入数据失败");
		}
	}
}
