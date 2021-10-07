package Set계열클래스예제;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Random;

/*
 * 자동으로 로또번호를 발생시키는 앱 작성
 * 조건: HashSet, ArrayList, Random 클래스 사용
 * 결과: [1, 20, 27, 32, 38, 42] 정렬되어 출력되도록.
 */

public class LottoGeneratorEx {

	public static void main(String[] args) {
		
		//Set<Integer> hashSet = new HashSet<Integer>(6);
		Set hashSet = new TreeSet();
		Random rand = new Random();
		
		while(hashSet.size()!=6) {
			hashSet.add(rand.nextInt(45)+1);
		}
		/*
		ArrayList<Integer> list = new ArrayList<>(hashSet);
		Collections.sort(list);
		System.out.println(list);
		*/
		System.out.println(hashSet);
	}

}
