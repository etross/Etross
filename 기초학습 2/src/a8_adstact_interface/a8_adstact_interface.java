package a8_adstact_interface;

abstract class Kind{
	String name;                                                     // ��ӹ޴� ���� Ŭ�������� ���� �����̹Ƿ�, �ֹ߼� ���ú����̴�.
	int age;                                                         // �߻�Ŭ������ Ŭ������ ��üȭ�� �� �� ����. ���� ��� ��ӹ޴� Ŭ������ �θ�Ŭ������ �ȴ�.
	int iq;                                                          // �߻�Ŭ������ ��Ű���������� ����� �� �ִ�.

	void Name(String name) {                                         // ��ӹ޴� ����Ŭ�������� ���� �� ���� �żҵ带 ���ؼ� �̸��� ����ȴ�.
		this.name = name;
	}
	String GetName() {                                               // ����� �̸��� ��ȯ�ϴ� ��ȯ�żҵ� 
		return name;
	}
	void Age(int age) {
		this.age = age;
	};
	int GetAge() {
		return age;
	}
	abstract void print();                                           // ���ڸ� �޴� �żҵ尡 �ƴ� �� �޼ҵ��϶���, abstract�� ����Ѵ�.
	
	void iq(int iq) {
		this.iq = iq;
	};
	int GetIq() {
		return iq;
	}
	
}
interface man{                                                       // �������̽��� �ٸ� ��Ű�������� ����� �� ������, ��üȭ �� �� �ִ�.
	  void intel();                                                  // ���� �ߺ������ �����ϰ� ���ش�.
}


class Human extends Kind implements man{                             // �������̽��� ��ӹ��������� implements�� ����ϸ�, ","�� ����� �������� ��� ����
 
	@Override                                                        // @Override = �ּ��� ������ �������ҵ� �Ѵ�.
	void Name(String name){                                      
		this.name = name;
	}
	@Override                                                        
	void Age(int age){                                               // �߻�Ŭ������ ��ӹ��������� �θ�Ŭ������ �żҵ�� �̸��� ���ƾ� �������̵��� �ȴ�.
		this.age = age;
	}
	@Override
	void print() {                                                   // GetName()�޼ҵ�� Human Ŭ������ Kind �޼ҵ带 ��ӹ޾� ��ü���� ���� �״�� ���
		System.out.println("(�̸�):"+GetName()+"(����):"+GetAge()+",���");
	}
	@Override
	public void intel() {                                             // �������̽����� �������̵��� �޼ҵ�� �ٸ���Ű�������� ��밡���ϹǷ�, public�� ���
		System.out.println("'Ư�̻���'- IQ"+GetIq()+"�� �������� ������ �ִ�");
	}
}
class Dog extends Kind{
	@Override
	void Name(String name){
		this.name = name;
	}
	@Override
	void Age(int age){
		this.age = age;
	}
	@Override
	void print() {
		System.out.println("(�̸�):"+GetName()+"(����):"+GetAge()+",�㽺Ű");
	}	
}
class Cat extends Kind{
	@Override
	void Name(String name){
		this.name = name;
	}
	@Override
	void Age(int age){
		this.age = age;
	}
	@Override
	void print() {
		System.out.println("(�̸�):"+GetName()+"(����):"+GetAge()+",����ũ��");
	}	
}
public class a8_adstact_interface {
	public static void main(String[]args) {
	Dog dog = new Dog();
	Cat cat= new Cat();
	Human human =new Human();
	
	human.iq(100);
	human.Name("���");
	human.Age(32);
	human.print();
	human.intel();
	dog.Name("�۸�");
	dog.Age(2);
	dog.print();
	cat.Name("�߿�");
	cat.Age(4);
	cat.print();

	}
}
