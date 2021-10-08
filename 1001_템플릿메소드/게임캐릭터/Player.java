package ����ĳ����;

/*
 * Player �� PlayerLevel �� ���� ���� (has a)
 * = ���� ���� ���� (aggregation)
 * ��ü (whole)�� �κ�(part)�� ��Ÿ�� �� ���! 
 * ���ӿ��� Player�� �ڽ��� ������ �ֱ� ������, Player Ŭ�������� playerLevel�� "�������"�� ����.
 * playerLevel �� �߻�Ŭ������ ���� ���� ����� ���� ��, �� ������ ����� �߻�޼ҵ�� ����
 */

public class Player {
	private PlayerLevel level; //��������� PlayerLevel ����
	
	//������
	public Player() {
		level = new Beginner();
		level.showMessageLevel();
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showMessageLevel();
	}
	
	public void play(int count) {
		level.go(count);
	}
	
}
