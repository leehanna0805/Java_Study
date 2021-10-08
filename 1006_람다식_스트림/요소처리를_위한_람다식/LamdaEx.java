package ���ó����_����_���ٽ�;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class LamdaEx {

	public static void main(String[] args) {
		List<Customer> list = (List)Arrays.asList(new Customer("Hanna",1500), 
													new Customer("Sarah",700));
		// �÷������κ��� ��Ʈ�� ��� ! List �� ���������� ���ؼ�!
		Stream<Customer> stream = list.stream();
		stream.forEach(s -> {
			String name = s.getName();
			int score = s.getPoint_score();
			System.out.println(name + "-> "+score);
		});
	}
}
