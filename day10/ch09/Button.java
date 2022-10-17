package ch09;

public class Button {
	OnClickListener listener;
	//OnClickListener listener = new CallListener()
    // 다형성 인터페이스 변수명 = new 구현클래스()
	void SetOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	interface OnClickListener {
		void onClick();
	}

}
