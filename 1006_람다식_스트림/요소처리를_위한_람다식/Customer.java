package 요소처리를_위한_람다식;

public class Customer {
	private String name;
	private int point_score;
	
	public Customer(String name, int point_score) {
		this.name = name;
		this.point_score = point_score;
	}
	
	
	public String getName() {
		return name;
	}

	public int getPoint_score() {
		return point_score;
	}
}
