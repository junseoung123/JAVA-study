package ch01;

public class ClassEx01 {

	public static void main(String[] args) {
		// Ŭ���������
		// Ŭ���� ������� : ����(�ʵ�), �żҵ�, ������ new ClassEx01(), Ŭ����
		// ȸ���������α׷� ȸ����ȣ ȸ���� ��ȭ��ȣ ���α׷��� �޴�����
		
		//�������
		MemberManager mm = new MemberManager( "1001", "ȫ�浿", "123-1234", "�⺻�ｺ", "������", 10000);
		System.out.println(mm.managerName + mm.memberNumber);
		
		MemberManager mm2 = new MemberManager("1002", "ȫ�浿", 50000);
		System.out.println(mm2.memberNumber);
		
		MarkClassEx mk = new MarkClassEx("�̸���", 10000);
		System.out.println(mk.markFee);
		
		//��üȭ�ϱ�
		AdminManager adminManager= new AdminManager("ȫ�浿", "��Ƽķ�۽�");
		
		AdminManager adminManager2= new AdminManager(2000, false);

	}

}
