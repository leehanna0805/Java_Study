package Set�迭Ŭ��������;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Random;

/*
 * �ڵ����� �ζǹ�ȣ�� �߻���Ű�� �� �ۼ�
 * ����: HashSet, ArrayList, Random Ŭ���� ���
 * ���: [1, 20, 27, 32, 38, 42] ���ĵǾ� ��µǵ���.
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
