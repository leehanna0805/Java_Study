package ���ٽ�;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx01 {

	public static void main(String[] args) {
		/* ���ͷ����� ����� ���
		List<Integer> list = (List)Arrays.asList(10,20,30,40);
		Iterator<Integer> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			Integer value = iterator.next();
			System.out.print(value+" ");
		}
		*/
		
		// ���ٽ� & ��Ʈ�� ����ؼ� ����ó���� ������ �ϴ� ���
		List<Integer> list = (List)Arrays.asList(10,20,30,40);
		Stream<Integer> stream = list.stream(); //stream���� �Ű�������
		
		stream.forEach(value -> System.out.print(value+" ")); //��ȣ �ȿ� ���ٽ�
	}
}
