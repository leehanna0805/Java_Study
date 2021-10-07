package Set계열클래스예제;

public class Member {
	private String name;
	private int age;
	private String juminNum;
	
	public Member(String name, int age, String juminNum) {
		this.name = name;
		this.age = age;
		this.juminNum = juminNum;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { 
			// instanceof = 연산자! 객체의 타입이 member 거나 member 상속받으면 true
			Member member = (Member)obj;
			return member.name.equals(name) && (member.age == age)&& 
					member.juminNum.equals(juminNum);
			
		}else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age + juminNum.hashCode(); // hashcode 는 int 값
	}
}
