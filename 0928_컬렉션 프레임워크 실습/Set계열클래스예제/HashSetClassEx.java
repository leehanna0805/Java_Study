package Set�迭Ŭ��������;

import java.util.HashSet;
import java.util.Set;

public class HashSetClassEx {

	public static void main(String[] args) {
		
		//HashSet ��ü ����
		Set<Member> member_set = new HashSet<Member>();
		
		Member member1 = new Member("Ŀ��",25,"789456-1234567");
		Member member2 = new Member("Ŀ��",25,"789456-1234567");
		Member member3 = new Member("��å",20,"111111-1111111");
		
		member_set.add(member1);
		member_set.add(member2);
		System.out.println("�� ��ü��: "+member_set.size());
		System.out.println(member1.hashCode());
		System.out.println(member2.hashCode()); //�ΰ� �ؽð��� ���� = ���� ��ü
		System.out.println(member1.equals(member2)); //true
	}

}
