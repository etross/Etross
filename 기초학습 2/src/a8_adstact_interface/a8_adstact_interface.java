package a8_adstact_interface;

abstract class Kind{
	String name;
	int age;
	int iq;

	void Name(String name) {
		this.name = name;
	}
	String GetName() {
		return name;
	}
	void Age(int age) {
		this.age = age;
	};
	int GetAge() {
		return age;
	}
	abstract void print();
	
	void iq(int iq) {
		this.iq = iq;
	};
	int GetIq() {
		return iq;
	}
	
}
interface man{
	  void intel();
}


class Human extends Kind implements man{

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
		System.out.println("(�̸�):"+GetName()+"(����):"+GetAge()+",���");
	}
	@Override
	public void intel() {
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
