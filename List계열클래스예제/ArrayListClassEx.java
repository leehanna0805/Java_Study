package List�迭Ŭ��������;

import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ArrayListClassEx {

	public static void main(String[] args) {
		
		List<Integer> arrayList = new ArrayList<Integer>(); //�⺻ 10��
		
		// ��ü �߰�  add()
		arrayList.add(new Integer(90)); //������ ��üȭ ��Ŵ
		arrayList.add(88); // �ڵ� ��üȭ �Ǽ� ����!
		arrayList.add(100);
		arrayList.add(45);
		arrayList.add(67);
		
		
		arrayList.add(2, 999);
		
		
		//��ü ���� set() ���Ϳ� ����
		arrayList.set(1, 666);
		System.out.println(arrayList);
		arrayList.remove(2);
		System.out.println(arrayList);
	
	}

}
