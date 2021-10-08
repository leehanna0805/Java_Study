package ����������;

import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.Locale;
import java.util.Vector;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/*
 * << �����̷�(Modification Information) >>
 * ������			  ������	   �۾� ����(���� ����)	
 * ----------	------   ----------------
 * 2021.10.07    ���ѳ�         ���̾ƿ� ����, ��� ����
 * 2021.10.08	 ���ѳ�
 */


// �ܺ� Ŭ����
public class ManageSystem extends JFrame{	// JFrame Ŭ������ ������ ���α׷��ֿ��� '�ֻ��� �����̳�' ����

	public static final String String = null;

	// ���� Ŭ������ ��ü ����. ������ �ۿ��� ���������Ƿ�(global) ��� ����Ŭ�������� ���� ����! 
	MenuMain menuMain = new MenuMain();
	West west = new West();
	Buttons buttons = new Buttons();
	ShowTable showTable = new ShowTable();
	
	
	// �����ڿ� ��ü�� ���������� add�ؼ� �ٿ�����.
	public ManageSystem() {
		OUTTER: while(true) {	 // OUTTER �� ���̺�
			ImageIcon icon = new ImageIcon("src/images/grimPan.png");
			JOptionPane.showMessageDialog(null, null, "������ �����ý���", 
											JOptionPane.NO_OPTION, icon); //NO_OPTION�� "Ȯ��"�� ���. ���ָ� "���"�� ����
		
			String password = JOptionPane.showInputDialog("������ �ý���\n�н����� �Է�"); //�Է¹ޱ�
			String passwd = "1";
			if(password == null) {
				break OUTTER;
			}else if(password.equals(passwd)){ //�н����� ���� ����
				setTitle("������ ���� �ý���");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
///////////////////// ���⿡ �߰� ////////////////////////
				add(menuMain.bar, BorderLayout.NORTH); // bar(�� ū����)�� ���ʿ� ��ġ�ض�
				add(west, BorderLayout.WEST);	//west��ü�� ���ʿ� �ٿ���
				add(buttons, BorderLayout.SOUTH);
				add(showTable.scrollPane, BorderLayout.CENTER);
				
				setSize(1200,800);
				setLocation(500,50);
				setVisible(true);
				
				break OUTTER;
			}else {
				JOptionPane.showMessageDialog(null, "�н����尡 ���� �ʽ��ϴ�.\n'Ȯ��' ��ư�� ��������.","���� �޼���", JOptionPane.ERROR_MESSAGE);
				continue OUTTER;
			}
			
		}
	}
	
// ===============================================================================================
	// �޴� �����(����, ����, ����) -> ���� Ŭ����(inner class).
	class MenuMain extends JPanel implements ActionListener, ItemListener{ //JPanel�� ���� �����̳�. Listener���� �������̽�
		
		JMenuBar			bar;
		JMenu 				file, sort, help;  // ����, ����, ����
		JMenuItem			fnew, fopen, fsave, fexit, proinfo;
		JCheckBoxMenuItem	sno, sname, schul, sjob;
		
		FileDialog readOpen, saveOpen;
		String fileDir, fileName, savefileName, readfileName;
		ButtonGroup gr = new ButtonGroup();		// �̰� �ؾ� üũ�ڽ� 1���� üũ�Ǵ� �� (gr.add��)
		
		
		// ������. ȭ�� ����(UI), �� ��ü(������Ʈ)�� ���� �̺�Ʈ ����
		public MenuMain() {
			bar = new JMenuBar(); //���⿡�ٰ� �� �ٿ�����.
			
			file = new JMenu("����");
			sort = new JMenu("����");
			help = new JMenu("����");
			
			fopen = new JMenuItem("����");	
			fsave = new JMenuItem("����");
			fexit = new JMenuItem("�ݱ�");
			
			sno = new JCheckBoxMenuItem("��ȣ"); //��ȣ�� ����
			sname = new JCheckBoxMenuItem("�̸�"); //�̸����� ����
			schul = new JCheckBoxMenuItem("��� ����");
			sjob = new JCheckBoxMenuItem("����");
			
			proinfo = new JMenuItem("���α׷� ����");
			
			// ��ü�� �����̳ʿ� ���̱�
			file.add(fopen); file.add(fsave); file.addSeparator(); file.add(fexit);	//addSeparator �� ���м� ����
			gr.add(sno); gr.add(sname); gr.add(schul); gr.add(sjob);  // üũ�ڽ��޴��������� ��ư �׷쿡 ���� -> ��ư�׷����� ����� ��� �ϳ��� �����ϵ��� ������ !!
			sort.add(sno); sort.add(sname); sort.add(schul); sort.add(sjob);
			help.add(proinfo);
			
			bar.add(file); bar.add(sort); bar.add(help);
			
			// '����' �޴� �̺�Ʈ ����
			fopen.addActionListener(this);	//this�� �̺�Ʈ �ڵ鷯 ��ü �ڽ�
			fsave.addActionListener(this);	//JMenuItem ������Ʈ�� ActionEvent �߻�
			fexit.addActionListener(this);
			
			// '����' �޴� �̺�Ʈ ����
			sno.addItemListener(this);		//JCheckBoxMenuItem �� ItemEvent �߻�
			sname.addItemListener(this);
			schul.addItemListener(this);
			sjob.addItemListener(this);
			
		}
		
		
		@Override
		public void itemStateChanged(ItemEvent e) {	//ItemListener ��
			
		}

		@Override
		public void actionPerformed(ActionEvent e) { //ActionListener ��
			
		} 
	} //end MenuMain
// ===============================================================================================
	// �Է�, ���� �˻� ����� (West ���� Ŭ����)
	class West extends JPanel{
		
		Input input = new Input();
		Output output = new Output();
		
		
		// ������
		public West() {
			setLayout(new BorderLayout());
			add(input, BorderLayout.CENTER); //input�� �����ʿ� �ٿ���
			add(output, BorderLayout.SOUTH);
		}
		
		// �Է� ���� ��� Ŭ����
		class Input extends JPanel{
			JTextField[] tf = new JTextField[5];	//�Է� �ؽ�Ʈ ����
			String[] text = {"��ȣ","�̸�","�ڵ��� ��ȣ","�̸���","�ֹι�ȣ"}; //�Է¹��� �͵�
			String[] jobText = {"����","ȸ���","������","���α׷���","����","�л�","��Ÿ"};
			JLabel la, job;
			JComboBox box;
			
			// ������
			public Input() { // ȭ�� ���� UI
				setBorder(new TitledBorder(new LineBorder(Color.BLUE,2),"�Է�"));	//�Ķ��� �׵θ�(����:2) ����. ������ '�Է�'
				setLayout(new GridLayout(6,2,5,30));	//6�� 2�� (2�����迭ó��) �ڿ��� ����
				
				for(int i=0;i<text.length;i++) {
					la = new JLabel(text[i]);
					tf[i] = new JTextField(10);
					la.setHorizontalAlignment(JLabel.CENTER);
					add(la); add(tf[i]);
				}
				
				box = new JComboBox(jobText);
				job = new JLabel("����");
				job.setHorizontalAlignment(JLabel.CENTER);
				add(job); add(box);
				setPreferredSize(new Dimension(340,300));
			}
			
		}
		
		// �Ż� ���� Ŭ����. �˻���ư ������ '�����˻�' ���̾ƿ� �ߵ��� �ؾ���. ������ 2�� �ؾ���. 
		class Output extends JPanel implements ActionListener{
			
			// �߰�
			JPanel info = new JPanel();	// �Ż����� ����
			JPanel search = new JPanel(); // ���� �˻� ����
			
			CardLayout card = new CardLayout(); // ī�屳ü ���̾ƿ�
			String[] text = {"	����:","	����:","	�������:", "����:"};
			JLabel[] label = new JLabel[4];
			ButtonGroup group = new ButtonGroup();
			JRadioButton[] searchRadio = new JRadioButton[4];
			JButton searchButton;
			JButton exitButton;
			JTextField nameText;
			String[] search_name = {"�̸�","����","�������","�������"};
			int searchType;
			
			// ������
			public Output() {	// ȭ�� ����, �� ��ü�� ���� �̺�Ʈ ����
				
				// '�Ż� ����' UI ���� �����
				info.setBorder(new TitledBorder(new LineBorder(Color.BLUE,2),"�Ż�����"));
				info.setLayout(new GridLayout(4, 1));	//4�� 1�� �׸��� ���̾ƿ�
				
				for(int i=0;i<text.length;i++) {
					label[i] = new JLabel(text[i], JLabel.LEFT);
					info.add(label[i]);
				}
				
				// '���� �˻�' UI ���� �����
				search.setBorder(new TitledBorder(new LineBorder(Color.BLUE,2),"�����˻�"));
				nameText = new JTextField(10);
				searchButton = new JButton("ã��");
				exitButton = new JButton("������");
				
				searchButton.setBackground(Color.CYAN);
				exitButton.setBackground(Color.LIGHT_GRAY);
				
				// ��ư ��ü�� �̺�Ʈ �ڵ鷯 ������ ���
				searchButton.addActionListener(this);
				exitButton.addActionListener(this);
				
				setPreferredSize(new Dimension(340,300));
				
				int x = -70;
				search.setLayout(null);
				
				for(int i=0;i<searchRadio.length;i++) {
					searchRadio[i] = new JRadioButton(search_name[i]);
					searchRadio[i].setBounds(x+=80, 60, 80, 30);
					group.add(searchRadio[i]);
					search.add(searchRadio[i]);
					
					//�̺�Ʈ ����
					searchRadio[i].addActionListener(this);
				
				}
				nameText.setBounds(40,110,200,30);
				searchButton.setBounds(35,170,80,30);
				exitButton.setBounds(140,170,110,30);
				
				search.add(nameText);
				search.add(searchButton);
				search.add(exitButton);
				
				// Card layout ���� ��ü�ǰԲ�
				card = new CardLayout();
				setLayout(card);
				
				add(info, "�Ż����� ī��");
				add(search,"�����˻� ī��");
			}
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("������")) goOut();
			}
			public void goOut() {
				west.output.card.show(west.output,"�Ż����� ī��");
			}
			
			
		}
		
	}
// ==============================================================================================================
	// �߰�, ����, ����, ����, ����, �˻� ��ư Ʋ (���� ��)
	class Buttons extends JPanel implements ActionListener{ //��ư�� action listener
		
		Vector<String> vector;
		JButton addBtn, delBtn, preBtn, nextBtn, updateBtn, searchBtn; //�߰�, ����, ����, ����, ����, �˻� ��ư
		int age;
		String juminNo, sung, chul;
		
		public Buttons(){
			setLayout(new GridLayout(1,6));
			
			addBtn = new JButton("�߰�");
			delBtn = new JButton("����");
			preBtn = new JButton("����");
			nextBtn = new JButton("����");
			updateBtn = new JButton("����");
			searchBtn = new JButton("�˻�");
			
			addBtn.setBackground(Color.YELLOW);
			delBtn.setBackground(Color.LIGHT_GRAY);
			preBtn.setBackground(Color.PINK);
			nextBtn.setBackground(Color.GREEN);
			updateBtn.setBackground(Color.MAGENTA);
			searchBtn.setBackground(Color.CYAN);
			
			add(addBtn);add(delBtn);add(preBtn);add(nextBtn);add(updateBtn);add(searchBtn);
			
			//��ư�� �̺�Ʈ ����
			addBtn.addActionListener(this);
			delBtn.addActionListener(this);
			preBtn.addActionListener(this);
			nextBtn.addActionListener(this);
			updateBtn.addActionListener(this);
			searchBtn.addActionListener(this);
		}
		
		
		// ��ư Ŭ�� -> actionPerformed ȣ�� -> �׼� ó��
		@Override
		public void actionPerformed(ActionEvent e) {
			
			//�߰� ��ư�� Ŭ���Ǹ�. getActionCommand�� ���ڿ��� ������.
			if(e.getActionCommand().equals("�߰�")) addData(); //�� �޼ҵ� ȣ���ض�
			else if(e.getActionCommand().equals("�˻�")) searchData();
			
		} 
		
		// '�߰�' ��ư Ŭ���� �̺�Ʈ ó�� �޼ҵ�
		public void addData() {
			nextBtn.setEnabled(true); // ���� ��ư Ȱ��ȭ (��Ȱ��ȭ�ϸ� Ŭ�� ����)
			vector = new Vector<String>();
			vector.add(west.input.tf[0].getText());	//��ȣ �Է°� �� ���� ��ü�� �߰�
			vector.add(west.input.tf[1].getText()); //�̸� 
			vector.add(west.input.tf[2].getText()); //�ڵ��� ��ȣ
			vector.add(west.input.tf[3].getText()); //�̸���
			
			juminNo = west.input.tf[4].getText(); // �ֹι�ȣ ��ȿ�� �˻�����.
			
			//��ȿ���˻�
			String regex = "^[0-9]{6}-[1234][0-9]{6}$";
			boolean check = juminNo.matches(regex);
			
			if(check==false) {
				JOptionPane.showMessageDialog(null, 
						"�ֹι�ȣ�� ���Խ����Ͽ� ���� ����\n�ֹι�ȣ�� �ٽ� �Է��ϼ���.", "���� �޼���", JOptionPane.ERROR_MESSAGE);
				west.input.tf[4].setText(null); // �Է¹��� �ֹι�ȣ�� �����,
				west.input.tf[4].requestFocus(); // �� ĭ�� ��Ŀ���� ��������.
				return; //���� ���� �״�� �־��.(����ڰ� �ٽ� �Է��� �� ����)
			
			}else if(juminNo.length() == 14){ // ����ǥ���� ����
				int sum = 0;
				int[] weight = {2,3,4,5,6,7,0,8,9,2,3,4,5,6};
			
				for(int i=0;i<13;i++) {
					if(juminNo.charAt(i)=='-') continue;
					sum += (juminNo.charAt(i)-48)*weight[i];
				}
				int temp = 11-(sum%11);
				int result = temp%10;
				
				if(result == juminNo.charAt(13)-48) {
					JOptionPane.showMessageDialog(null, "�ֹι�ȣ üũ ��� �����Դϴ�."		//�������� �޼���â�� �Ķ���� 2��
							+"\n'Ȯ��' ��ư�� ������ ������ ��µ˴ϴ�.");	
					vector.add(juminNo);
					
					// �����̴ϱ� ���� ����
					Calendar cal = Calendar.getInstance(Locale.KOREA);
					int now = cal.get(Calendar.YEAR);
					int year = Integer.parseInt(juminNo.substring(0, 2));		
					if((juminNo.charAt(7)-48) < 3) {
						year += 1900;
					}else {
						year += 2000;
					}
					int age = now-year+1;
					vector.add(String.valueOf(age)); //������ ��Ʈ������ �ٲ㼭 vector�� �־��
					
					// ���� ����
					if((juminNo.charAt(7)-48)%2 == 0) {
						sung = "����";
					}else {
						sung = "����";
					}
					vector.add(sung);
					
					// ��� ���� ����
					String[][] localCode = {{"����","00","08"},{"�λ�","09","12"},{"��õ","13","15"}
											,{"���","16","25"},{"����","26","34"},{"���","35","39"}
											,{"����","40","40"},{"�泲","41","43"},{"�泲","45","47"}
											,{"����","44","44"},{"����","96","96"},{"����","48","54"}
											,{"����","55","64"},{"����","65","66"},{"�뱸","67","70"}
											,{"���","71","80"},{"�泲","81","84"},{"�泲","86","90"}
											,{"���","85","85"},{"����","91","95"}};
					
					String localeString = juminNo.substring(8,10);
					int locale = Integer.parseInt(localeString);
					String birthPlace = null;
					
					for(int j=0;j<=19;j++) { // �迭 ������ 19
						if(locale >= Integer.parseInt(localCode[j][1]) &&   
							locale <= Integer.parseInt(localCode[j][2])) {
							birthPlace = localCode[j][0];
						}
					}
					vector.add(birthPlace);
					vector.add(juminNo.substring(2,4)+"�� "+juminNo.substring(4,6)+"��");
				
					west.output.label[0].setText("   �� ��:   "+String.valueOf(age));
					west.output.label[1].setText("   �� ��:   "+sung);
					west.output.label[2].setText(" �������:   "+birthPlace);
					west.output.label[3].setText("   �� ��:   "+juminNo.substring(2,4)+"�� "+juminNo.substring(4,6)+"��");
					
					vector.add(west.input.box.getSelectedItem().toString());	// ����
					
					// ���Ϳ� �� ���������ϱ� ��ǲ ���� �����
					for(int i=0;i<5;i++) {
						west.input.tf[i].setText(null);
					}
					 // ���� (�޺��ڽ� ��ü) '����'���� ����ġ
					west.input.box.setSelectedIndex(0);
					
					west.input.tf[0].requestFocus();  //ù��° ĭ�� ��Ŀ�� �����ֱ�
					
					// JTable�� �ѷ��ֱ�
					showTable.data.addElement(vector);
					showTable.datamodel.fireTableDataChanged();
					
				} else {
					JOptionPane.showMessageDialog(null, "�ֹι�ȣ Ʋ��", "���� �޼���", JOptionPane.ERROR_MESSAGE);
					west.input.tf[4].setText(null); // �Է¹��� �ֹι�ȣ�� �����,
					west.input.tf[4].requestFocus(); // �� ĭ�� ��Ŀ���� ��������.
					return; //���� ���� �״�� �־��.(����ڰ� �ٽ� �Է��� �� ����)
				}
				
				
				
			}
		}
		
		// '�˻�' ��ư Ŭ���� �̺�Ʈ ó�� �޼ҵ� (ī�� ����)
		public void searchData() {
			// ��� 1
			west.output.card.show(west.output, "�����˻� ī��");
			// ��� 2
		//	west.output.card.next(west.output);
		}
		
		
		
	}
// ===============================================================================================		
	// �߾� ���� => Jtable ����� => ���� Ŭ����
	class ShowTable extends MouseAdapter{
		
		DefaultTableModel 	datamodel;
		JTable 				table;
		JScrollPane 		scrollPane;
			
		String[] colName = {"��ȣ","�̸�","�ڵ�����ȣ","�̸���","�ֹι�ȣ","����","����","�������","����","����"};
			
		Vector<Vector<String>> data;	//���� �ȿ� ���Ͱ� �� ����!
		Vector<String> column_name;
		int row = -1;
			
		//������
		public ShowTable(){
			data = new Vector<Vector<String>>();
			column_name = new Vector<String>();
			
			for(int i=0;i<colName.length;i++) {
				column_name.add(colName[i]);
			}
			
			// 1�ܰ�: default table �𵨰�ü �����
			datamodel = new DefaultTableModel(data, column_name) {
				public boolean isCellEditable(int row, int column) {
					return false;
				}
			};
			
			// 2�ܰ�: JTable �� ��ü �����
			table = new JTable(datamodel);
			
			// 3�ܰ�: JScrollPane �����
			scrollPane = new JScrollPane(table);
			
			// �̺�Ʈ ����
			table.addMouseListener(this);
			table.setAutoCreateRowSorter(true);
			
			TableRowSorter<TableModel> tableSorter = new TableRowSorter<TableModel>(table.getModel());
			table.setRowSorter(tableSorter);	
		
			TableSize();
				
		}
		public void TableSize() {	// �� ũ�� ���� (�̸��� ĭ �а� ��)
			// JTable�� �� ũ�� �����ϱ�
			table.getColumnModel().getColumn(0).setPreferredWidth(50);  // ��ȣ ��
			table.getColumnModel().getColumn(1).setPreferredWidth(50);  // �̸� ��
			table.getColumnModel().getColumn(2).setPreferredWidth(120); // �ڵ��� ��ȣ ��
			table.getColumnModel().getColumn(3).setPreferredWidth(150); // �̸��� ��
			table.getColumnModel().getColumn(4).setPreferredWidth(130); // �ֹι�ȣ ��
			table.getColumnModel().getColumn(5).setPreferredWidth(50);  // ���� ��
			table.getColumnModel().getColumn(6).setPreferredWidth(50);  // ���� ��
			table.getColumnModel().getColumn(7).setPreferredWidth(80);  // ������� ��
			table.getColumnModel().getColumn(8).setPreferredWidth(70);  // ���� ��
			table.getColumnModel().getColumn(9).setPreferredWidth(50);  // ���� ��
		}
	}
	
	
// ===============================================================================================	
	// ����
	public static void main(String[] args) {
		ManageSystem ms = new ManageSystem();
		
	}

}
