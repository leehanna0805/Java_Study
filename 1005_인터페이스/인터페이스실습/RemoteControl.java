package 인터페이스실습;

// RemoteControl 인터페이스는 Television, Audio 클래스가 가진 기능들을 추상클래스로 정의해두는 인터페이스이다.
// 자바 8 이후로 디폴트 메소드와 정적메소드를 구성 멤버로 구현 가능 => 유연성 부여!
public interface RemoteControl {
	
	// 볼륨 조절을 상수로 선언
	public static final int MAX_VOLUME = 10; // public static final 은 생략 가능. 컴파일시 자동 생성
	public static final int MIN_VOLUME = 0;
	
	// 추상 메소드 선언
	public abstract void turnOn(); //public abstract 생략 가능. 컴파일시 자동 생성
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	
	// Default Method 디폴트 메소드 => 기존 인터페이스를 확장해서 새로운 기능을 추가하기
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음을 해제합니다.");
		}
	}
	
	// Static Method 정적 메소드 => 디폴트 메소드와 달리, 객체 없이 인터페이스 만으로 호출이 가능함!
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
