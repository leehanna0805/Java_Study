package 변수와자료형;

/*
 * 중요 예제
 */

public class URLPath {

	public static void main(String[] args) {
		
		String url = "http://localhost:8080/Model2_Board/login.do";
		
		int lastPosition = url.lastIndexOf("/"); //마지막 슬래쉬의 인덱스 얻어옴 //서블릿 클래스만들때 이걸로 사용함. 
		// System.out.println(lastPosition); //34
		
		String filePath = url.substring(lastPosition);
		System.out.println(filePath); // "/login.do" 추출
		
	}
	
}
