package ch01;

public class DmbCellPhone extends CellPhone{
	int channel;
	
	public DmbCellPhone(String model, String color, int channel) {
		super("�θ��", "������"); //�ڽĻ����ڿ��� �θ�����ڸ� ȣ��
		//��Ģ�� �ݵ�� �ڽ� �������� ù�ٿ� ����Ѵ�
		super.model = model;
		super.color = color;
		this.channel = channel;
		
	}
	
	void turnOnDmb() {
		System.out.println("ä��" + channel + "�� DMB ��� ������ �����մϴ�");
	}
	
	void changeChannelDmb(int channel) {
		this.channel =channel;
		System.out.println("ä�� : " + channel + "������ �ٲߴϴ�");
	}
	
	void turnOffDmb() {
		System.out.println("DMB ����� ������ ����ϴ�");
	}

}
