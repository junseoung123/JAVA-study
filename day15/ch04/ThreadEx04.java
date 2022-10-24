package ch04;

public class ThreadEx04 {

	public static void main(String[] args) {
		//600 스레드 상태 제어하기
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



//T1 스레드는 특별한 경우에만 수행되게 만들고싶다 RUN가지 않아도 된다 양보 yeild
class ThreadA extends Thread {
	public boolean stop=false;
    public boolean work=true;
	@Override
	public void run() {
	
		while(stop) {
			if(work)
				System.out.println("ThreadA 작업하기");
			
			else {
				Thread.yield();
			}
		
			
		}
		System.out.println("ThreadA 종료");
	}
}

class ThreadB extends Thread {
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB 작업내용");
				} else {
					System.out.println("양보");
					Thread.yield();
				}
		}
		System.out.println("ThreadB종료");
	}
}