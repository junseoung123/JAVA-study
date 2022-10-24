package ch04;

public class ThreadEx04 {

	public static void main(String[] args) {
		//600 ������ ���� �����ϱ�
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		threadA.start();
		threadB.start();
		
		try{
		Thread.sleep(3000);
		}catch (Exception e) {
			
			e.printStackTrace();// TODO: handle exception
		}
		
		threadA.work=false;
		
		try{
			Thread.sleep(3000);
			}catch (Exception e) {
				
				e.printStackTrace();// TODO: handle exception
			}
		
		threadA.work=true;
		
		try{
			Thread.sleep(3000);
			}catch (Exception e) {
				
				e.printStackTrace();// TODO: handle exception
			}
		
		threadA.stop();
		threadB.stop();
		
		

	}

}



//T1 ������� Ư���� ��쿡�� ����ǰ� �����ʹ� RUN���� �ʾƵ� �ȴ� �纸 yeild
class ThreadA extends Thread {
	public boolean stop=false;
    public boolean work=true;
	@Override
	public void run() {
	
		while(stop) {
			if(work)
				System.out.println("ThreadA �۾��ϱ�");
			
			else {
				Thread.yield();
			}
		
			
		}
		System.out.println("ThreadA ����");
	}
}

class ThreadB extends Thread {
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB �۾�����");
				} else {
					System.out.println("�纸");
					Thread.yield();
				}
		}
		System.out.println("ThreadB����");
	}
}