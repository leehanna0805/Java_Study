package 인터페이스실습;

public class MyClass {

	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setVolume(-2);
		rc.setMute(true);
		RemoteControl.changeBattery();
		rc.turnOff();
		
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(8);
		rc.setMute(false);
		RemoteControl.changeBattery();
		rc.turnOff();
	}
}
 