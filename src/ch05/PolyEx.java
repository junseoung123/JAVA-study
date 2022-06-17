package ch05;

public class PolyEx {

	public static void main(String[] args) {
		
		//Dog를 객체생성하세요 참조변수를 부모클래스타입으로 하세요 - 다형성
		Animal aa1 = new Dog();
		//Dog클래스의 필드를 접근할수 있습니까? X
		//그렇다면 어떻게 접근할까? aa1의 자료형을 Dog형으로 형변환 해주기
		//Animal 클래스 부모클래스이니까나 큰타입, Dog클래스 자식클래스이니깐 작은타입
		// Dog(작은) 타입으로 = Animal 타입(큰)이
		
		Dog dd1 = (Dog) aa1;
		//aa1.dogfiled = 1000;
		
		//Animal클래스의 필드를 접근할수있습니까? O
		//aa1.animalField = 2000;
		
		// 다형성    Animal animal = new Cat();
		//         부모클래스 참조변수 = new 자식클래스();
		
		//Dog 클래스 객체생성하기
		Dog dog = new Dog();
		//Dog와 Animal 모두를 가르킴
		//dog.animalField =100;
		//dog.dogfiled =200;
		
		//Cat 클래스 객체생성하기
		Cat cat = new Cat();
		
		//다형성
		Animal a1 = new Dog();
		//Animal만 가르킴
		//a1.animalField=300;
		//a1.dogfiled=400; X
		Animal a2 = new Cat();
		
		Dog d3 = new Dog();
		Animal a3 = new Dog();
		
		a3.sound();
		//부모 클래스 Animal의 sound() 메소드를
		// 자식클래스 DOg에서 sound()메소드를 재정의했더니 다형성을 사용하니깐 자식의 sound 메소드 호출
		
		//만약 DB플렛폼을 부모 클래스로 두고
		//오라클 클래스를 자식으로 두었을 경우 부모클래스의 메소드를 오버라이딩하고 다형성을 사용하면 부모 DB클래스로 변수를 만들어주면
		//실행결과는 오라클로되고 연결은 DB플랫폼으로 된다

	}

}
