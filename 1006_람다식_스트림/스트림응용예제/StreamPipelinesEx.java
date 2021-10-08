package 스트림응용예제;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//회원 객체에서 '남자'회원의 평균나이를 람다식&스트림으로 구하는 프로그램 작성
public class StreamPipelinesEx {

	public static void main(String[] args) {
		
		List<Member> list = Arrays.asList(new Member("Hanna",Member.MALE,20),
				new Member("jiji",Member.FEMALE,49),new Member("ola",Member.FEMALE,2)
				,new Member("mulba",Member.MALE,32));
		
	// 1. 외부 반복자 적용하여 해결하기
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
		System.out.println("남자 회원의 평균 나이: "+ageAvg);
		
		
	// 2. Stream 적용하여 해결하기
		
		/*
		stream.forEach( temp -> {
			if(temp.getGender()==Member.MALE) {cnt = cnt+1; sum+=temp.getAge();}
		} );
		 */
		double ageavg = list.stream()			//original 스트림
							.filter(m -> m.getGender() == Member.MALE)	//남자만 걸러냄(중간처리 메소드)
							.mapToInt(Member::getAge)	//중간처리 메소드
							.average()	//최종처리 메소드
							.getAsDouble();		//
		System.out.println("남자 회원의 평균 나이: "+Math.ceil(ageavg)); //ceil = 반올림
		
	}
	
}
