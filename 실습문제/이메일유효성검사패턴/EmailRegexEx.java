package �̸�����ȿ���˻�����;

public class EmailRegexEx {

	public static void main(String[] args) {
		
		String email_pattern = "^\\w+@\\w+\\.\\w+(\\.\\w+)?";

		String email_ex[] = {"hanna@naver.com","hanna$@gmail.com",".@partner.sk.com","hh@hkhk.hkhk.hk.hh"};
		
		for(String email : email_ex) {
			if(email.matches(email_pattern)) {System.out.println("������ �̸���: "+email);}
			else {System.out.println("�̸��� �ּ� ����!!: "+email);}
		}
	}
}
