package Enum����ǽ�;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Arrays Ŭ������ �ֿ� �޼ҵ� => static <T> List<T> asList(T.. a) 
//							=> ���޹��� �迭�� ����ũ���� List�� ��ȯ�Ͽ� return

public enum PayGroup {
	CASH("����",Arrays.asList("������ü","�������Ա�","�������","�佺")),
	CARD("ī��",Arrays.asList("������","�ſ�ī��","īī������","�������")),
	ETC("��Ÿ",Arrays.asList("����Ʈ","����")),
	EMPTY("������������",Collections.EMPTY_LIST);
	
	private String title;
	private List<String> payList;
	
	PayGroup(String title, List<String> payList){
		this.title = title;
		this.payList = payList;
	}
	
	public static PayGroup findByPayCode(String code) {
		// Stream �� ���������� ����
		return Arrays.stream(PayGroup.values())
				.filter(payGroup -> payGroup.hasPayCode(code))
				.findAny()
				.orElse(EMPTY);
	}
	
	public boolean hasPayCode(String code) {
		return payList.stream().anyMatch(pay -> pay.equals(code));
	}
	
	public String getTitle() {
		return title;
	}

	public List<String> getPayList() {
		return payList;
	}
	
}
