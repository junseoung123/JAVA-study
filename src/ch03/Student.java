package ch03;

public class Student {
<<<<<<< HEAD
	//�迭 �����ϱ�
		String[] name;
		int[] jumsu;
		int cnt;
		boolean yn;
		
		
		
		public String[] getName() {
			return name;
		}

        public void setName(String[] name) {
			this.name = name;
		}



		public int[] getJumsu() {
			return jumsu;
		}



		public void setJumsu(int[] jumsu) {
			this.jumsu = jumsu;
		}



		public int getCnt() {
			return cnt;
		}



		public void setCnt(int cnt) {
			this.cnt = cnt;
		}



		public boolean isYn() {
			return yn;
		}



		public void setYn(boolean yn) {
			this.yn = yn;
		}



		//����� �迭�ȿ� String ��� 3��¥�� �迭 ������� �����̴�
		public Student() {
			name = new String[3]; //�迭 ��ü�� �����ض� ~�ض� << �޼ҵ忡 �ֱ�
			jumsu = new int[3];
			
		}
=======
	
	int hakbun;
	String hakjum;
	
	public void outputhakbun() {
		System.out.println(hakbun);
	}
	public void outputhakjum() {
		System.out.println(hakjum);
	}
>>>>>>> refs/remotes/origin/master

}
