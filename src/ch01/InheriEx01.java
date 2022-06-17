package ch01;

public class InheriEx01 {

	public static void main(String[] args) {
		// 상송
		DmbCellPhone dmbCellPhone =new DmbCellPhone("자바폰", "점정",10);
		System.out.println("모델 :" + dmbCellPhone.model);
		System.out.println("색상 :" + dmbCellPhone.color);
		System.out.println("채널 :" + dmbCellPhone.channel);
		
		dmbCellPhone.bell();
		dmbCellPhone.hangup();
		dmbCellPhone.powerOff();
		dmbCellPhone.powerOn();
		dmbCellPhone.sendVoice("안녕하세요 오늘 시간있으세요?");
		dmbCellPhone.receiveVoice("네 시간 괜찮습니다");
		

	}

}
