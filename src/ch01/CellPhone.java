package ch01;

public class CellPhone {
	String model;
	String color;
	
	//����� �������� �⺻�����ڴ� �����Ϸ��� �ȸ�����ش�
	public CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
		// TODO Auto-generated constructor stub
	}
	void powerOn() {System.out.println("������ �մϴ�");}
	void powerOff() {System.out.println("������ ���ϴ�");}
	void bell() {System.out.println("���� �︳�ϴ�");}
	void sendVoice(String message) {System.out.println("���� : " + message);}
	void receiveVoice(String message) {System.out.println("���� : " + message);}
	void hangup() {System.out.println("��ȭ�� �����ϴ�");}
	

}
