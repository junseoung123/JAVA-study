package ch03;

public class Calculator {
	double areaCircle(double r) {
		System.out.println( " areaCircle ����");
		return 3.14157 * r * r;
	}
	//�޼ҵ忡 final���̸� �ڽ� �޼ҵ尡 ���������� ���ϰ� ���´�
    final int fMethod(int a, String b, boolean c) {
    	return 0;
    }
	
	//�θ� Ŭ������ objectŬ������ �޼ҵ��� toStirng �� �������ϱ�
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(areaCircle(20));
	}
	//�θ�Ŭ������ 
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0516;
	}

}
