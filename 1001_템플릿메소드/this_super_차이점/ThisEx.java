package this_super_차이점;

class Person{
	private int juminNum;
	private int military; //군번
	private int birthYear;
	private int birthMonth;
	private int birthDay;
	
	public Person(int juminNum, int military, int bYear, int bMonth, int bDay) {
		this.juminNum = juminNum;
		this.military = military;
		birthYear = bYear;
		birthMonth=bMonth;
		birthDay = bDay;
	}
	public Person(int juminNum, int bYear, int bMonth, int bDay) {
		
		this(juminNum, 0, bYear, bMonth, bDay); //this() 는 첫라인에 와야한다 !!
		
		/*
		this.juminNum = juminNum;
		this.military = 0;
		birthYear = bYear;
		birthMonth=bMonth;
		birthDay = bDay;
		*/
	}
	public void showInfo() {
		System.out.println("jumin : "+juminNum);
		System.out.println("birth: "+birthYear+"/"+birthMonth+"/"+birthDay);
		
		if(military != 0) {
			System.out.println("military: "+military+"\n");
		}else {
			System.out.println("Not related to military\n");
		}
	}
}


public class ThisEx {
	public static void main(String[] args) {
		Person man = new Person(9708052, 9999,1997,8,5);
		Person woman = new Person(690201,1996,2,1);
		
		System.out.println("=== man ===");
		man.showInfo();
		System.out.println("=== woman ===");
		woman.showInfo();
	}
}
