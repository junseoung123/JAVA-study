package ch06;

public interface RemoteControl {
	//������� static final����
	public int MAXVOLUME=10;
	public int MIN_VOLUME=0;
	
	//�߻�޼ҵ� abstract ����
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//default�޼ҵ�
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("����ó���մϴ�");
		} else {
			System.out.println("���������մϴ�");
		}
	}
	
	//new�� �Ƚ��൵��
	static void changerBattery() {
		System.out.println("�������� ��ü�մϴ�");
	}

}
