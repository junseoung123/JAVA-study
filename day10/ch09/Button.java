package ch09;

public class Button {
	OnClickListener listener;
	//OnClickListener listener = new CallListener()
    // ������ �������̽� ������ = new ����Ŭ����()
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
