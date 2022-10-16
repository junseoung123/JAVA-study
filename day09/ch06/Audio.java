package ch06;

public class Audio implements RemoteControl{
	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio¸¦ ÄÕ´Ï´Ù");
		
	}
	
	@Override
	public void turnOff() {
		System.out.println("Audio¸¦ ²ü´Ï´Ù");
		
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume> RemoteControl.MAXVOLUME) {
			this.volume = RemoteControl.MAXVOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("ÇöÀç TVº¼·ý: "+  this.volume);
		
		
	}

}


