package �������ڷ���;

/*
 * �߿� ����
 */

public class URLPath {

	public static void main(String[] args) {
		
		String url = "http://localhost:8080/Model2_Board/login.do";
		
		int lastPosition = url.lastIndexOf("/"); //������ �������� �ε��� ���� //���� Ŭ�������鶧 �̰ɷ� �����. 
		// System.out.println(lastPosition); //34
		
		String filePath = url.substring(lastPosition);
		System.out.println(filePath); // "/login.do" ����
		
	}
	
}
