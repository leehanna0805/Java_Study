package List계열클래스예제;

import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ArrayListClassEx {

	public static void main(String[] args) {
		
		List<Integer> arrayList = new ArrayList<Integer>(); //기본 10개
		
		// 객체 추가  add()
		arrayList.add(new Integer(90)); //정수를 객체화 시킴
		arrayList.add(88); // 자동 객체화 되서 가능!
		arrayList.add(100);
		arrayList.add(45);
		arrayList.add(67);
		
		
		arrayList.add(2, 999);
		
		
		//객체 변경 set() 벡터와 같음
		arrayList.set(1, 666);
		System.out.println(arrayList);
		arrayList.remove(2);
		System.out.println(arrayList);
	
	}

}
