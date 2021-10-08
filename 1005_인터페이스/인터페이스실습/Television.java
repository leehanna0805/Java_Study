package 인터페이스실습;

public class Television implements RemoteControl{

	// 멤버변수 선언
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV Turn On");
	}

	@Override
	public void turnOff() {
		System.out.println("TV Turn Off");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("TV Volume: "+this.volume);
	}
	
}
