package ch06;

public class SingletonData {
	//싱글톤 타입으로 객체만들기
	//1단계 생성자는 private 선언한다
	private SingletonData() {}
	//2단계 static 필드에 객체생성한후 참조변수를 담는다
	static SingletonData sd = new SingletonData();
	
	//3단계 getInstance()라는 메소S드를 만든다. 외부클래스에다가 주소를 리턴해주는 메소드이다
    public SingletonData getInstance() {
    	return sd;
    }
    
    private int sddata1;
    private String sddata2;
    private boolean sddata3;
}
