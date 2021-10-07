package Map계열클래스예제;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesClassEx {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		prop.setProperty("name", "이한나");
		prop.setProperty("email", "h@hh.om");
		prop.setProperty("HP", "010-8883488");
		
		Enumeration enu = prop.propertyNames(); //반환 타입이 열거형
		while(enu.hasMoreElements()) {
			String ele = (String) enu.nextElement();
			System.out.println(ele+": "+prop.getProperty(ele));
		}
	}

}
