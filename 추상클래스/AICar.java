
public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자율 주행 한다");
		
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈춘다!!!");
		
	}

	@Override
	public void wipe() {
		System.out.println("와이퍼 빠르기가 자동으로 조절됨!!");
		
	}
	
	
	
}
