package a7_���and�������̵�;

class intro{                                                       // ����Ŭ����, ����Ŭ����
	private final String name;                                     //final = ��� �Ұ����� �����ڷ� ����
	private int age;
	
	intro(String name, int age){
		this.name= name;                                           // �Ű����� name�� age�� this�� ����Ͽ� ���� �̸����� ��밡��
		this.age= age;
	}
	void print() {
		System.out.println("�̸�:"+name+"\n"+"����"+age);
	}
}

class intro2 extends intro{                                        // extends�� ����Ͽ�, ����Ŭ������ intro(�θ�Ŭ����)�� ��ӹ���.
	final int num;                                                       // extends�� ����ϸ� , ����Ŭ������ intro�� super�� ��ü�Ǹ�, super�� ��밡��.
	final String info;
	
	intro2(String name, int age,int a,String b){
		super(name,age);                                           // super�� ����Ͽ� ��ü������ �����ʰ�, ���ڸ� ���� �� �ִ�.
		num= a;                                                    // super�̿ܿ� ��üȭ�� �Ұ����ϴ�.
		info=b;
	}
	void print() {
		super.print();                                             // ��ӹ��� intro�� print()�� ����Ǿ�� ������, ����Ŭ������ ����Ŭ������ �� �޼ҵ��̸��� �����Ƿ�, 
		System.out.println("�й�:"+num+"\n"+"���ʿ���:"+info);         // �������̵�(��ƹ�����)�� �Ǳ� ������, intro2�� print()�żҵ常 ����ȴ�.
	}                                                              // ����Ŭ������ print()�żҵ带 �ҷ�������, super.print()�� ����Ͽ��� �Ѵ�.
}                                                                  // <�������̵��̶�>, ����ϴ� �θ�Ŭ������ ��ӹ޴� �ڽ�Ŭ�������� ���� �̸��� �żҵ尡 �浹�� ����ų��,
                                                                   // �߻��ϴ� ������ �ڽ�Ŭ���� �켱���Ƿ� ��Ģ�� ���ϴ� ���̶�� �� �� �ִ�. 
class intro3 {                                                     // object���信���� ����̿ܿ� �żҵ� ȣ���� �����ʰ� Ÿ Ŭ������ �żҵ带 ȣ�� �Ҷ�, ����Ѵ�.
	void intro3(intro2 in) {
		in.print();
		}
	
}
public class a7_���and�������̵� {
	public static void main(String[]args) {

		intro3 kk = new intro3();
		kk.intro3(new intro2("������",31,10,"����"));
	}
}
