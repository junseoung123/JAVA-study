package ch01;

public class Sungjuk {
	// ������ �ʿ��� ��� �Ӽ�: �л��� �а��� �������� ��������
			// �޼ҵ� �հ��� ��հ�� ������
			
			String name;
			String dept;
			private int kor;
			private int mat;
			
			public Sungjuk(String name, String dept, int kor, int mat) {
				this.name = name;
				this.dept = dept;
				this.kor = kor;
				this.mat = mat;
				
			}
			public Sungjuk() {
				// TODO Auto-generated constructor stub
			}

			//�հ���
			//�޼ҵ� ���� ����
			//���������� ����Ÿ�� �޼ҵ��(�ŰԺ���) {�޼ҵ� ó�� ����}
			private int sumCom() {
				return kor+mat;
			}
			
			//����ϱ� ���ϱ�
			public int add(int a, int b) {
				return a+b;
			}
			
			public double add(double d, double e) {
				return d+e;
			}
			
			public String add(String a1, String a2, String a3) {
				return a1 + a2 + a3;
			}
			
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getDept() {
				return dept;
			}
			public void setDept(String dept) {
				this.dept = dept;
			}
			public int getKor() {
				return kor;
			}
			public void setKor(int kor) {
				this.kor = kor;
			}
			public int getMat() {
				return mat;
			}
			public void setMat(int mat) {
				this.mat = mat;
			}
			
			
			
			
			//���������� public �ٸ���Ű�������� ��밡�� ���������� �Ⱥپ��մ°�default - �ش� ��Ű�� �ȿ� ���ϱ ��������
			//        protected - ��Ӱ��迡 �ִ°͸� ��밡�� 
			//        private - �ڽ��� Ŭ���������� ���ٰ���

}
