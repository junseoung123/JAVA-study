package ch01;

public class ThreadEx01 {

	public static void main(String[] args) {
		//576 쓰레드
		Task1 task1 = new Task1();
		Task2 task2 = new Task2();
		Task3 task3 = new Task3();
		
		//메소드 호출
		//방법1 Runnable 구현객체는 Thread()객체화 한후 start()로 호출하기
		Thread task1T= new Thread(task1);
		task1T.start();
		
		
		System.out.println();
		
		//방법2 Thread를 상송받은 자손클래스
		task2.start();
		
		//방법3 Task3은 일반메소드를 이용해서 스레드호출
		task3.method();
		
		
		
		try {
		for(int i=0; i<20; i++) {
			System.out.print(i +" ");
			
			Thread.sleep(1000); //지연 목적
		}
		}catch (InterruptedException e) {
				// TODO: handle exceptio
			e.printStackTrace();
			}
			
		}
		
	    
		

	}




class Task1 implements Runnable{
	public void run() {
		for(int i=0; i<10; i++) {
		System.out.println("이곳은 잡업스레드 1번 - 네트워크 처리중");
	}
	}
}

class Task2 extends Thread{
	
	//Thread thread = new Thread(new Runnable() {
		
		@Override
		
		public void run() {
			for(int i=0; i<10; i++) {
			System.out.println("이곳은 작업스레드 2번임 - 화면구현 처리중");
			}
		}
	//});
}

class Task3 {
	Runnable task3 = new Task10();
	Thread thread = new Thread(task3);
	
	void method() {
		thread.start();
	}
}

class Task10 implements Runnable{
	@Override
	public void run() {
	System.out.println("이곳은 작업스레드 3번임 - 백그라운드처리중");	
	}
    
}