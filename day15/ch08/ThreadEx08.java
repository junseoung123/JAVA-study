package ch08;

public class ThreadEx08 {

	public static void main(String[] args) {
		
		PrintThread2 pt2 = new PrintThread2();
		pt2.start();
		pt2.interrupt();
		
		pt2.setDaemon(true); //데몬스레드 = 주 스레드를 도와주는 보조 스레드 아무것도 안하면 false가 기본
		

	}

}

class PrintThread2 extends Thread{
	
	@Override
	public void run() {
		try {
		while(true) {
			System.out.println("실행중");
			if(Thread.interrupted()) {
				break;
			}
			
				Thread.sleep(1000);
		}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("자원정리");
			System.out.println("실행종료");
		}
	}
