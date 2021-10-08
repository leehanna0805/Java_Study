package �������̽��ǽ�;

// RemoteControl �������̽��� Television, Audio Ŭ������ ���� ��ɵ��� �߻�Ŭ������ �����صδ� �������̽��̴�.
// �ڹ� 8 ���ķ� ����Ʈ �޼ҵ�� �����޼ҵ带 ���� ����� ���� ���� => ������ �ο�!
public interface RemoteControl {
	
	// ���� ������ ����� ����
	public static final int MAX_VOLUME = 10; // public static final �� ���� ����. �����Ͻ� �ڵ� ����
	public static final int MIN_VOLUME = 0;
	
	// �߻� �޼ҵ� ����
	public abstract void turnOn(); //public abstract ���� ����. �����Ͻ� �ڵ� ����
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	
	// Default Method ����Ʈ �޼ҵ� => ���� �������̽��� Ȯ���ؼ� ���ο� ����� �߰��ϱ�
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		}else {
			System.out.println("������ �����մϴ�.");
		}
	}
	
	// Static Method ���� �޼ҵ� => ����Ʈ �޼ҵ�� �޸�, ��ü ���� �������̽� ������ ȣ���� ������!
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
