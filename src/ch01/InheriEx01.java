package ch01;

public class InheriEx01 {

	public static void main(String[] args) {
		// ���
		DmbCellPhone dmbCellPhone =new DmbCellPhone("�ڹ���", "����",10);
		System.out.println("�� :" + dmbCellPhone.model);
		System.out.println("���� :" + dmbCellPhone.color);
		System.out.println("ä�� :" + dmbCellPhone.channel);
		
		dmbCellPhone.bell();
		dmbCellPhone.hangup();
		dmbCellPhone.powerOff();
		dmbCellPhone.powerOn();
		dmbCellPhone.sendVoice("�ȳ��ϼ��� ���� �ð���������?");
		dmbCellPhone.receiveVoice("�� �ð� �������ϴ�");
		

	}

}
