package a7_�����ε�;

import java.math.BigDecimal;
import java.math.MathContext;

class Cal{                                                     // �����ε� = ������
	int add(int num1,int num2) {                               // �Ȱ��� add�żҵ忡 �տ� int�� double�� �����ε�
		return num1 + num2; 
	}
	double add(double num1,double num2) {
		return num1 + num2;
	}
	int min(int num1,int num2) {                               // �Ȱ��� add�żҵ忡 �տ� int�� double�� �����ε�
		return num1 - num2;
	}
	double min(double num1,double num2) {
		return num1 -num2;
	}
}
class info{
	String name1; int age1; String se1; String na1;
	void man(String name, int age, String se, String na) {
		name1= name;
		age1= age;
		se1= se;
		na1= na;
	}
	void man(String name, int age, String se) {
		name1= name;
		age1= age;
		se1= se;	
	}
	void  print() {
		System.out.println("===����===");
		System.out.println("�̸�:"+name1);
		System.out.println("����:"+age1);
		System.out.println("����:"+se1);
		if (na1 == null)
			System.out.println("��°�:����");
		else 
			System.out.println("��°�:"+na1);
	}
}
public class a7_�����ε� {
	public static void main(String[]args) {
		int num1= 1; int num2= 2;
		BigDecimal num3= new BigDecimal("1.123");
		BigDecimal num4= new BigDecimal("2.41235");
		double num33 =num3.doubleValue();                       // ���� ����ȯ�� ������, new Cal().add(num33,num44)��
		double num44 =num4.doubleValue();                       // ����, �żҵ� ���ڷ� ����ϱ� ���� �ѹ� �� ġȯ�ؾ� �Ѵ�.
		                                                        // ����- ����ȯ�� ������, ���� ������ �ȉ����Ƿ� (?)
		System.out.println("��:"+ new Cal().add(num1,num2)); 
		System.out.println("��:"+ new Cal().add(num33,num44));   // ���Ŀ� �°� ��µ�. (int add,double add)
		System.out.println("��:"+ new Cal().min(num1,num2));
		System.out.println("��:"+ new Cal().min(num33,num44));
		
		info man1 = new info();
		man1.man("������",31,"��","õ��");
		info man2 = new info();
		man2.man("�ƹ���",20,"��");
		
		man1.print();
		man2.print();
	}
}
