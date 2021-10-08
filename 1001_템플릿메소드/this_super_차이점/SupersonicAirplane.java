package this_super_차이점;

public class SupersonicAirplane extends Airplane{
	//상수 선언
	public static final int NORMAL = 1; // 일반 비행 모드
	public static final int SUPERSONIC = 2; // 초음속 비행 모드

	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}else {
			super.fly();
		}
	}
	
	
}
