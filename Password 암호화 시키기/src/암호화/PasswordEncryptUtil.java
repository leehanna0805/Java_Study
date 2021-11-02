package ��ȣȭ;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/*
 * �ڹٿ��� SHA �˰��� ����Ϸ��� MessageDiegest Ŭ������ �̿��Ѵ�.
 * update() �޼ҵ带 ȣ���� ������ ��ü ���� ����� digest���� ����ؼ� ���ŵȴ�.
 * ���������� digest() �޼ҵ带 ȣ���ϸ� �� ���� �����´�.
 */
public class PasswordEncryptUtil {

	public static void main(String[] args) {
		//�н����� ����
		String plainText = "test1234";
		String sha256 = "";
		
		try {
			MessageDigest mdSHA256 = MessageDigest.getInstance("SHA-256");
		
			mdSHA256.update(plainText.getBytes("UTF-8"));
			byte[] sha256Hash = mdSHA256.digest();
			
			//16���� ��ȯ
			StringBuffer hexSHA256 = new StringBuffer();
			
			for(byte b : sha256Hash) {
				String hexString = String.format("%02x", b); //16���� 2�ڸ�
				hexSHA256.append(hexString);
			}
			sha256 = hexSHA256.toString();
			
			
			
		}catch(NoSuchAlgorithmException e){
			e.printStackTrace();
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println(sha256); //937e8d5fbb48bd4949536cd65b8d35c426b80d2f830c5c308e2cdec422ae2244
	}

}
