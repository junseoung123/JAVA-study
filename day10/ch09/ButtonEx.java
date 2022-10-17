package ch09;

public class ButtonEx {

	public static void main(String[] args) {
		Button button = new Button();
		button.SetOnClickListener(new CallListener());
		button.touch();
		
		button.SetOnClickListener(new MessageListener());
		button.touch();

	}

}
