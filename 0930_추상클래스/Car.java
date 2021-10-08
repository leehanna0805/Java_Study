
public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void wipe();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("�õ� ��");
	}
	
	// ���ø� �޼ҵ�� final ���� ����Ѵ�. 
	final public void run() {
		startCar();
		drive();
		wipe();
		stop();
		turnOff();
	}
}
