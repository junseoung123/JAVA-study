package ch01;

public class ClassEx01 {
<<<<<<< HEAD
	
	public static void main(String[] arg) {
		//�����ڸ� ����Ͽ��� "ȫ�浿", "�İ�", 100, 80 �ڷ� �Է��غ���
		
		Sungjuk s1= new Sungjuk("ȫ�浿", "�İ�", 100, 80);
		//�ʵ�� ����ϱ�
		System.out.println(s1.name);
		System.out.println(s1.dept);
		//System.out.println(s1.kor); private ���������ڶ�
		//System.out.println(s1.mat); private ���������ڶ�
		
		//getter ���
		System.out.println(s1.getName());
		System.out.println(s1.getDept());
		System.out.println(s1.getKor());
		System.out.println(s1.getMat());
		
		//�⺻�����ڷ� ��ü�����ϼ���
		Sungjuk s2 = new Sungjuk();
		System.out.println(s2.add(10, 20));
		System.out.println(s2.add(11.34, 22.55));
		System.out.println(s2.add("�̸���", "ȫ�浿", "�Դϴ�"));
	}

	
		

	}


=======

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
>>>>>>> refs/remotes/origin/master
