package Map�迭Ŭ��������;

import java.util.Hashtable;
import java.util.Scanner;

public class HashtableClassEx {

	public static void main(String[] args) {
		
		String[] userID = {"Lee","Kim","Jang","Wang","Ha"};
		String[] password = {"L123","K13","J88","W97","H78"};
		
		//HashTable ����
		Hashtable<String, String> ht = new Hashtable<String, String>(userID.length);
		
		// ��ü ����
		for(int i=0;i<userID.length;i++) {
			ht.put(userID[i],password[i]);
		}
		System.out.println(ht); //{Jang=J88, Ha=H78, Lee=L123, Wang=W97, Kim=K13}
		
		System.out.println(ht.get("Wang"));
		
		boolean FLAG = false; //����ġ ������� �Ѵ�. 
		
		while(FLAG) {
			System.out.print("user id >>> ");
			Scanner in = new Scanner(System.in);
			String user_key = in.nextLine();
			String pw_value = ht.get(user_key);
			
			if(pw_value != null) {
				System.out.println("user password >>> ");
				String passwordInputValue = in.nextLine();
			
				if(pw_value.equals(passwordInputValue)){
					System.out.println("���� ����");
				}else {
					System.out.println("���� ����");
				}
			}else {
				System.out.println("�Է��� ���� id�� ��ϵǾ� ���� �ʽ��ϴ�.");
				FLAG = false;
			}
		}
		
	}

}
