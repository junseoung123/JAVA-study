package ch06;

public class InterfaceEx05 {

	public static void main(String[] args) {
		// ������ü�� ��ü�����ϱ�
		
		Television tv = new Television();
		Audio audio = new Audio();
		tv.turnOn();
		tv.setVolume(8);
		tv.setMute(true);
		tv.turnOff();
		
		//������ Animal animal = new Cat();
		RemoteControl rc1 = new Television();
		RemoteControl rc2 = new Audio();
		
		rc1.turnOn();
		rc1.setVolume(8);
		rc1.setMute(true);
		rc1.turnOff();
		
		if(rc2 instanceof Audio) {
			rc2.turnOn();
			rc2.setVolume(8);
			rc2.setMute(true);
			rc2.turnOff();
		} else {
			System.out.println("Audio Ŭ���� ��� �ȵ˴ϴ�");
		}
		

	}

}
