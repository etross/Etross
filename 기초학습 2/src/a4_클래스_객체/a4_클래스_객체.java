package a4_Ŭ����_��ü;

class plus{                                        // ��ɼ� class�� public class ���� ��ġ �ؾ���.
	                                               // class �տ� default ������ ������.
	int num1, num2;                                // input()�� add() �żҵ忡 �������� �ϱ����� 
	public void input( int a, int b) {             // ��üȭ�� adder �żҵ忡�� ���� �Է� ����
		num1=a; 
		num2=b;
	}
	public void add() {
		System.out.println("��:"+(num1+num2));
	}
	int result_a() {                               // int�� �޼ҵ带 public ���� ����
		return num1;                               // ���� ��ȯ�ϴ� �޼ҵ� 
	}
	int result_b() {
		return num2;
	}
}
///////////////////////////////////////////////////////////////////////////////////////
class Name{
	private String name;                            
	Name(String n){                                 // Ŭ������ �̸��� �����ϰ� ����, Ŭ���� �żҵ�� ���� �ȴ�.
		name= n;                                    // �żҵ� �տ� void ��� ���� ���������ڸ� �߰��� �ְԵǸ�, ���� �żҵ�� �ν�. 
	}
	void info_n() {
	System.out.println("�̸�:"+name);
		}
}
class Age{                                           //         [������������ ����]
	private int age;                                 // private = class�ȿ����� ��� ������ ����������.
	 Age(int a) {                                    // default(������ �ڵ�����) = class�� pakage�ȿ��� ���Ǵ� ����������.
		age = a;                                     // protected = class,pakage,��ӹ��� class �ȿ��� ���.
	}                                                // public = ��� ������ ���.
	void info_a() {
		System.out.println("����:"+age);
	}
}
class Phone{                                         // �ϳ��� ��Ű���ȿ��� �ϳ��� public class�� �����ϸ� public Ŭ���� ���� ����� ���� Ŭ������
	private String phone;                            // �ظ��ϸ� ������� �ʴ´�. ���İ�Ƽ�ڵ� ����.
	 Phone(String p) {
		phone = p;
	}
	void info_p() {
		System.out.println("HP:"+phone);
	}
}
class Interview{
	private Name name1;                                // private ������ NameŬ������ name1 ��ü ����
	private Age age1;
	private Phone phone1;
	Interview(String n1,int a1,String p1){             // InterviewŬ������ ����� Interview�żҵ忡�� ���������� ��Ƽ� 
		name1 = new Name(n1);                          // �̸�,����,��ȭ��ȣ �Է°��� �ѹ��� ���� �����ϵ��� ĸ��ȭ(��������)
		age1 = new Age(a1);                            
		phone1 = new Phone(p1);
	}
	void infop(){                                      // class�ȿ� infop�̶�� �����żҵ�� ������ println�� ĸ��ȭ 
		name1.info_n();
		age1.info_a();
		phone1.info_p();
	}
}
class Employee{
	void Employee_info(Interview view) {               // �żҵ� �ȿ����� Ŭ������ ���������� ����� ���ÿ� ���� ����
		view.infop();                                  // �Ű������� Interview�żҵ带 �����ϰ�,������ infop()�޼ҵ带 ���
	}                                                  // class�� �ϳ� ���� ������� �����ϴ� �޼ҵ带 ������.(ĸ��ȭ)
}
////////////////////////////////////////////////////////////////////////////////////////
public class a4_Ŭ����_��ü {
	public static void main(String[]args){
		plus adder=new plus();                         // Ŭ������ ��üȭ�ϴ� ���� (adder = ��������),
		adder.input(5,4);                              // plus Ŭ������ input�޼ҵ忡 �Է½�ų ��
		adder.add();                                   // add()�޼ҵ� ȣ��
		System.out.println("a�� b��:"+adder.result_a()+","+adder.result_b()+"\n"); 
		
	//    (��ü ����)       (��ü ����)       = ����� ���� ���ÿ�
		Employee emp = new Employee();                 // ������ �żҵ带 emp��� ���������� ����
		emp.Employee_info(new Interview("������",31," 010-9780-9468"));
    // Employeed Ŭ������ �������� emp�ȿ� Employee_info�żҵ��� �������ڿ��� Interview Ŭ������ ��ü������ ���ÿ� �������� ����
	// new Interview�� �Ű������� �Է����ֱ�����  main�żҵ忡 ��ü�� �����ϱ� ����.
		
	}
}
