package �����ϱ�ϵͳ;

public class MainTest {

	public static void main(String[] args) {
		Student emp = new Student();
		emp.setSsno("20202020");
		emp.setSname("��С��");
		emp.setScollege("����ѧԺ");
		emp.setSclass("�ƹ���");
		emp.setSdata("2020/3/4");
		emp.setSprovince("����");
		emp.setScity("����");
		emp.setSarea("����");
		emp.setSwuhan("��");
		emp.setSabroad("��");
		emp.setSinfect("��");
		StudentOperation.getInstance();
		boolean res = StudentOperation.saveStudent(emp);
		if(res == true) {
			System.out.println("����в������ݳɹ�");
		}
		else {
			System.out.println("����в�������ʧ��");
		}
	}
}
