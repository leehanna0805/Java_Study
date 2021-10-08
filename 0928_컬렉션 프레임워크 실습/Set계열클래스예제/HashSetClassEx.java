package Set계열클래스예제;

import java.util.HashSet;
import java.util.Set;

public class HashSetClassEx {

	public static void main(String[] args) {
		
		//HashSet 객체 생성
		Set<Member> member_set = new HashSet<Member>();
		
		Member member1 = new Member("커피",25,"789456-1234567");
		Member member2 = new Member("커피",25,"789456-1234567");
		Member member3 = new Member("산책",20,"111111-1111111");
		
		member_set.add(member1);
		member_set.add(member2);
		System.out.println("총 객체수: "+member_set.size());
		System.out.println(member1.hashCode());
		System.out.println(member2.hashCode()); //두개 해시값이 동일 = 동일 객체
		System.out.println(member1.equals(member2)); //true
	}

}
