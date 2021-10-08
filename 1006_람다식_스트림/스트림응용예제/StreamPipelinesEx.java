package ��Ʈ�����뿹��;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//ȸ�� ��ü���� '����'ȸ���� ��ճ��̸� ���ٽ�&��Ʈ������ ���ϴ� ���α׷� �ۼ�
public class StreamPipelinesEx {

	public static void main(String[] args) {
		
		List<Member> list = Arrays.asList(new Member("Hanna",Member.MALE,20),
				new Member("jiji",Member.FEMALE,49),new Member("ola",Member.FEMALE,2)
				,new Member("mulba",Member.MALE,32));
		
	// 1. �ܺ� �ݺ��� �����Ͽ� �ذ��ϱ�
		Iterator<Member> iter = list.iterator();
		int cnt = 0;
		double sum = 0;
		
		/*
		while(iter.hasNext()) {
			Member temp = iter.next();
			if(temp.getGender()==Member.MALE) {
				cnt+=1;
				sum+=temp.getAge();
			}
		}
		*/
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getGender()==Member.MALE) {
				sum+=list.get(i).getAge();
				cnt++;
			}
		}
	
		double ageAvg = sum/cnt;
		System.out.println("���� ȸ���� ��� ����: "+ageAvg);
		
		
	// 2. Stream �����Ͽ� �ذ��ϱ�
		
		/*
		stream.forEach( temp -> {
			if(temp.getGender()==Member.MALE) {cnt = cnt+1; sum+=temp.getAge();}
		} );
		 */
		double ageavg = list.stream()			//original ��Ʈ��
							.filter(m -> m.getGender() == Member.MALE)	//���ڸ� �ɷ���(�߰�ó�� �޼ҵ�)
							.mapToInt(Member::getAge)	//�߰�ó�� �޼ҵ�
							.average()	//����ó�� �޼ҵ�
							.getAsDouble();		//
		System.out.println("���� ȸ���� ��� ����: "+Math.ceil(ageavg)); //ceil = �ݿø�
		
	}
	
}
