package ch01;

public class MemberManager {

	        // Ŭ���������
			// Ŭ���� ������� : ����(�ʵ�), �żҵ�, ������ new ClassEx01(), Ŭ����
			// ȸ���������α׷� ȸ����ȣ ȸ���� ��ȭ��ȣ ���α׷��� �޴�����
	
	String memberNumber; //ȸ����ȣ
	String memberName; //ȸ����
	String memberPhone; //��ȭ��ȣ
	String programName; //���α׷���
	String managerName; //�Ŵ�����
	int membershipFee; //����
	
	//�����ڸ� ������ �⺻�����ڸ� �����Ϸ� �ڵ����� ������ش�.
	public void MemberManager( ) {
		//������
	}
	
	//�ڹٴ� �μ��� �ٸ��� �������� �����ڸ� ���� ���ִ�-������ �����ε�
	public MemberManager(String memberNumber, String memberName, String memberPhone, String programName, String managerName, int membershipFee) {
		this.memberNumber = memberNumber;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
	    this.programName = programName;
	    this.managerName = managerName;
	    this.membershipFee = membershipFee;
	    }
	
	public MemberManager(String memberNumber, String memberName, int membershipFee) {
		this.memberNumber = memberNumber;
		this.memberName = memberName;
		this.membershipFee = membershipFee;
	}


	}


