package ch06;

public class SingletonData {
	//�̱��� Ÿ������ ��ü�����
	//1�ܰ� �����ڴ� private �����Ѵ�
	private SingletonData() {}
	//2�ܰ� static �ʵ忡 ��ü�������� ���������� ��´�
	static SingletonData sd = new SingletonData();
	
	//3�ܰ� getInstance()��� �޼�S�带 �����. �ܺ�Ŭ�������ٰ� �ּҸ� �������ִ� �޼ҵ��̴�
    public SingletonData getInstance() {
    	return sd;
    }
    
    private int sddata1;
    private String sddata2;
    private boolean sddata3;
}
