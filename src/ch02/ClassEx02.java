package ch02;

public class ClassEx02 {

	public static void main(String[] args) {
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
		

	}

}
