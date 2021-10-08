package Set�迭Ŭ��������;

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
			// instanceof = ������! ��ü�� Ÿ���� member �ų� member ��ӹ����� true
			Member member = (Member)obj;
			return member.name.equals(name) && (member.age == age)&& 
					member.juminNum.equals(juminNum);
			
		}else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age + juminNum.hashCode(); // hashcode �� int ��
	}
}
