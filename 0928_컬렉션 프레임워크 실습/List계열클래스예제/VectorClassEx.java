package List계열클래스예제;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorClassEx {

	public static void main(String[] args) {
		
		String[] name = {"김진명","최인호","조정래","김흥신","박경리"};
		
		//벡터 객체 생성
		List<String> list = new Vector<String>(4, 3); //초기크기 4, 3씩 증가
		//System.out.println("벡터에 저장된 요소의 개수: "+list.size()); //0
		//System.out.println("벡터의 용량: "+ (((Vector<String>)list).capacity())); //4
		
		
		/* 겍체 추가 add() */
		for(int i=0;i<name.length;i++) {
			list.add(name[i]);
		}
		//System.out.println("벡터에 저장된 요소의 개수: "+list.size()); //5
		//System.out.println("벡터의 용량: "+ (((Vector<String>)list).capacity())); //7
		//System.out.println(list);
		
		list.add(2, "공지영");
		System.out.println(list);
		//for(String n : list) {System.out.print(n+" /");}
		
		/* 객체 검색  get(), contains() */
		System.out.println(list.get(1));
		System.out.println(list.contains("김흥신")); //웹프로그래밍에서  contains,size 많이씀.
		
		/* 객체 변경 set() */
		list.set(2, "이한나");
		System.out.println(list);
		
		/* 객체 삭제 remove() */
		list.remove(3);
		System.out.println(list);
		list.remove("김흥신");
		System.out.println(list);
		
		/* 객체 정렬  */
		// 오름차순
		System.out.println("\n====== 오름차순 정렬 ======");
		Collections.sort(list);
		System.out.println(list);
		
		// 내림차순
		System.out.println("\n====== 내림차순 정렬 ======");
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
	}
}
