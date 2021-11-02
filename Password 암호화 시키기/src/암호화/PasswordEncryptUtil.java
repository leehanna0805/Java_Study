package 암호화;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/*
 * 자바에서 SHA 알고리즘 사용하려면 MessageDiegest 클래스를 이용한다.
 * update() 메소드를 호출할 때마다 객체 내에 저장된 digest값이 계속해서 갱신된다.
 * 최종적으로 digest() 메소드를 호출하면 그 값을 가져온다.
 */
public class PasswordEncryptUtil {

	public static void main(String[] args) {
		//패스워드 지정
		String plainText = "test1234";
		String sha256 = "";
		
		try {
			MessageDigest mdSHA256 = MessageDigest.getInstance("SHA-256");
		
			mdSHA256.update(plainText.getBytes("UTF-8"));
			byte[] sha256Hash = mdSHA256.digest();
			
			//16진수 변환
			StringBuffer hexSHA256 = new StringBuffer();
			
			for(byte b : sha256Hash) {
				String hexString = String.format("%02x", b); //16진수 2자리
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
