package ch02;

public class ClassEx02 {

	public static void main(String[] args) {
<<<<<<< HEAD
		Office ow = new Office();
		ow.setName("ȫ�浿");
		ow.setAge(30);
		ow.setSabun("1000");
		
		//���δ� ����ϱ�
		ow.allPrint();
		
		//1�ܰ� Student Ŭ���� ��ü����
		Student st = new Student();
		//setter�� ���� �ֱ�
		st.setName("������");
		st.setAge(25);
		st.setHakbun("2020");
		st.allPrint();
		

=======
		
		HealthClass hc = new HealthClass();
		
		//�޼ҵ带 ���ؼ� ���� ��������� �ֱ�
		
		hc.setNumber("1000");
		hc.setProgram("�⺻�ｺ");
		hc.setMshipFee(10000);
		hc.setVIP(1);//vip��ް�
		hc.setYn(false);//Ż�𿩺�
		
		//�޼ҵ带 �̿��ؼ� �� ����ϱ�
		System.out.println( hc.getMnumber());
		System.out.println( hc.getProgram());
		System.out.println( hc.getMshipfee());
		System.out.println( hc.getVIP());
		System.out.println( hc.getYn());
		
		Student st = new Student();
		
		st.setName("ȫ�浿");
		st.setDept("����Ʈ�������");
		st.setJumsu(90);
		
		System.out.println( st.getName());
		System.out.println( st.getDept());
		System.out.println( st.getJumsu());
		
>>>>>>> refs/remotes/origin/master
	}

}
