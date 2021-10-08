package 람다식;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx01 {

	public static void main(String[] args) {
		/* 이터레이터 사용한 방법
		List<Integer> list = (List)Arrays.asList(10,20,30,40);
		Iterator<Integer> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			Integer value = iterator.next();
			System.out.print(value+" ");
		}
		*/
		
		// 람다식 & 스트림 사용해서 병렬처리로 빠르게 하는 방법
		List<Integer> list = (List)Arrays.asList(10,20,30,40);
		Stream<Integer> stream = list.stream(); //stream에서 매개값전달
		
		stream.forEach(value -> System.out.print(value+" ")); //괄호 안에 람다식
	}
}
