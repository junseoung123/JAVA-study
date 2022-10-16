package ch01;

public class InstanceofEx {

	public static void main(String[] args) {
		//상속
		//다형성 Animal animal = new Cat();
		//쓰는이유 -> 표준화 세분화
		//부모 메소드 sound() {둥물울음} 재정의 자식 메소드 sound() {야옹}
		
		//instanceof : 참조변수로 어떤 클래스에 접근할수있는지 판단해주는 명령어
		
		//다형성을 만들기
		
		Parent parent= new Child();
		
		//method1을 호출해보시오
		InstanceofEx.method1(parent);
		
		//메소드2 만들고 매개변수로 parent1참조변수 받기
		//Parnet 클래스를 객체생성해서 해당 참조변수 parnet1을 매개변수로 보내서
		//parent1으로 Parent클래스를 참조할수있는지 알아보기
		//parent1으로 Child클래스를 참조할수있는지 알아보기
		
		Parent parent1 = new Parent();
		InstanceofEx.method2(parent1);

	}
	
	public static void method1( Parent parent) {
		System.out.println(parent instanceof Child);
		System.out.println(parent instanceof Parent); //Parent에 들어가면 parent가 들어있니?
		if( parent instanceof Child) {
			Child c  = (Child) parent;
		} else {
			System.out.println("다운캐스팅 할수없습니다");
		}
	}
	
	public static void method2( Parent parent1 ) {
		System.out.println(parent1 instanceof Parent);
		if( parent1 instanceof Child) {
			Child c  = (Child) parent1;
		} else {
			System.out.println("다운캐스팅 할수없습니다");
		}
	}

}
