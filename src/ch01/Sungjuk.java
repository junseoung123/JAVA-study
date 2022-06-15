package ch01;

public class Sungjuk {
	// 성적에 필요한 명사 속성: 학생명 학과명 국어점수 수학점수
			// 메소드 합계계산 평균계산 등수계산
			
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

			//합계계산
			//메소드 만든 형식
			//접근제한자 리턴타입 메소드명(매게변수) {메소드 처리 내용}
			private int sumCom() {
				return kor+mat;
			}
			
			//계산하기 더하기
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
			
			
			
			
			//접근제한자 public 다른패키지에서도 사용가능 접근제한자 안붙어잇는거default - 해당 패키지 안에 파일까리 공유가능
			//        protected - 상속관계에 있는것만 사용가능 
			//        private - 자신의 클래스에서만 접근가능

}
