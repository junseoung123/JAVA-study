package ch01;

public class DmbCellPhone extends CellPhone{
	int channel;
	
	public DmbCellPhone(String model, String color, int channel) {
		super("부모론", "빨간색"); //자식생성자에서 부모생성자를 호출
		//규칙은 반드시 자식 생성자의 첫줄에 써야한다
		super.model = model;
		super.color = color;
		this.channel = channel;
		
	}
	
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다");
	}
	
	void changeChannelDmb(int channel) {
		this.channel =channel;
		System.out.println("채널 : " + channel + "번으로 바꿉니다");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송을 수신을 멈춥니다");
	}

}
