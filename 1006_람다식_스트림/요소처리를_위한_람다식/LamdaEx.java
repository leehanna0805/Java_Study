package 요소처리를_위한_람다식;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class LamdaEx {

	public static void main(String[] args) {
		List<Customer> list = (List)Arrays.asList(new Customer("Hanna",1500), 
													new Customer("Sarah",700));
		// 컬렉션으로부터 스트림 얻기 ! List 의 참조변수를 통해서!
		Stream<Customer> stream = list.stream();
		stream.forEach(s -> {
			String name = s.getName();
			int score = s.getPoint_score();
			System.out.println(name + "-> "+score);
		});
	}
}
