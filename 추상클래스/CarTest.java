
public class CarTest {

	public static void main(String[] args) {
		System.out.println("AI TEST");
		Car myCar = new AICar();
		myCar.run();
		
		System.out.println("\n����� �����ϴ°� TEST");
		Car hisCar = new ManualCar();
		hisCar.run();
	}

}
