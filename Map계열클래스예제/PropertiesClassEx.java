package Map�迭Ŭ��������;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesClassEx {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		prop.setProperty("name", "���ѳ�");
		prop.setProperty("email", "h@hh.om");
		prop.setProperty("HP", "010-8883488");
		
		Enumeration enu = prop.propertyNames(); //��ȯ Ÿ���� ������
		while(enu.hasMoreElements()) {
			String ele = (String) enu.nextElement();
			System.out.println(ele+": "+prop.getProperty(ele));
		}
	}

}
