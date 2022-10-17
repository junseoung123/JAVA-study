package ch12;

public class Business {
	void busMethod() {
		Inter01 i01 = new Inter01(){
			@Override
			public void run() {
				System.out.println("버스가 달립니다");
				
			}
			
		};
		i01.run();
	}
	void bycicleMethod() {
		Inter01 i02 = new Inter01() {
			 @Override
			public void run() {
				System.out.println("자전거가달립니다");
			}
		};
		i02.run();
	}
	void personMethod() {
		Inter01 i03 = new Inter01() {
			
			@Override
			public void run() {
				System.out.println("사람이달립니다");
			}
		};
		i03.run();
	}
	void carMethod() {
		Inter01 i04 = new Inter01() {
			
			@Override
			public void run() {
				System.out.println("자동차가 달립니다");
			}
		};
		i04.run();
	}

}
