package �����ϱ�ϵͳ;

import java.util.List;

//���Դ����ݿ��л�ȡ���ݵķ���
public class SelectMainTest {
	public static void main(String[] args) {
		List<Student> stuList = StudentOperation.getInstance().selectStudent();
		System.out.println("ѧ��ѧ��\t\tѧ������\t����ѧԺ\t\t���ڰ༶\t\t�����\t\t\t\t����ʡ��\t���ڳ���\t���ڵ���\t�Ƿ�Ϊ�人����\t�Ƿ�Ϊ��ѧ��\t�Ƿ�ȷ��");
		for (Student emp : stuList) {
			System.out.print(emp.getSsno()+"\t"+emp.getSname()+"\t"+emp.getScollege()+"\t\t"+emp.getSclass()+"\t"+emp.getSdata()+"\t\t"+emp.getSprovince()+"\t"+emp.getScity()+"\t"+emp.getSarea()+"\t"+emp.getSwuhan()+"\t\t"+emp.getSabroad()+"\t\t"+emp.getSinfect());
			System.out.println();
		}
	}

}
