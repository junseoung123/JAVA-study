package ch03;

public class Student {
	//배열 선언하기
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



		//선언된 배열안에 String 요소 3개짜리 배열 만들어라는 동작이다
		public Student() {
			name = new String[3]; //배열 객체를 생성해라 ~해라 << 메소드에 넣기
			jumsu = new int[3];
			
		}

}
