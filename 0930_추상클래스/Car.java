
public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void wipe();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동 꺼");
	}
	
	// 템플릿 메소드는 final 예약어를 사용한다. 
	final public void run() {
		startCar();
		drive();
		wipe();
		stop();
		turnOff();
	}
}
