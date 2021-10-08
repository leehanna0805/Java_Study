package 이메일유효성검사패턴;

public class EmailRegexEx {

	public static void main(String[] args) {
		
		String email_pattern = "^\\w+@\\w+\\.\\w+(\\.\\w+)?";

		String email_ex[] = {"hanna@naver.com","hanna$@gmail.com",".@partner.sk.com","hh@hkhk.hkhk.hk.hh"};
		
		for(String email : email_ex) {
			if(email.matches(email_pattern)) {System.out.println("적합한 이메일: "+email);}
			else {System.out.println("이메일 주소 오류!!: "+email);}
		}
	}
}
