package List�迭Ŭ��������;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorClassEx {

	public static void main(String[] args) {
		
		String[] name = {"������","����ȣ","������","�����","�ڰ渮"};
		
		//���� ��ü ����
		List<String> list = new Vector<String>(4, 3); //�ʱ�ũ�� 4, 3�� ����
		//System.out.println("���Ϳ� ����� ����� ����: "+list.size()); //0
		//System.out.println("������ �뷮: "+ (((Vector<String>)list).capacity())); //4
		
		
		/* ��ü �߰� add() */
		for(int i=0;i<name.length;i++) {
			list.add(name[i]);
		}
		//System.out.println("���Ϳ� ����� ����� ����: "+list.size()); //5
		//System.out.println("������ �뷮: "+ (((Vector<String>)list).capacity())); //7
		//System.out.println(list);
		
		list.add(2, "������");
		System.out.println(list);
		//for(String n : list) {System.out.print(n+" /");}
		
		/* ��ü �˻�  get(), contains() */
		System.out.println(list.get(1));
		System.out.println(list.contains("�����")); //�����α׷��ֿ���  contains,size ���̾�.
		
		/* ��ü ���� set() */
		list.set(2, "���ѳ�");
		System.out.println(list);
		
		/* ��ü ���� remove() */
		list.remove(3);
		System.out.println(list);
		list.remove("�����");
		System.out.println(list);
		
		/* ��ü ����  */
		// ��������
		System.out.println("\n====== �������� ���� ======");
		Collections.sort(list);
		System.out.println(list);
		
		// ��������
		System.out.println("\n====== �������� ���� ======");
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
	}
}
