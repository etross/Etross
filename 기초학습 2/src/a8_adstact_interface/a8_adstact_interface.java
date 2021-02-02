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
		System.out.println("(이름):"+GetName()+"(나이):"+GetAge()+",사람");
	}
	@Override
	public void intel() {
		System.out.println("'특이사항'- IQ"+GetIq()+"의 고지능을 가지고 있다");
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
		System.out.println("(이름):"+GetName()+"(나이):"+GetAge()+",허스키");
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
		System.out.println("(이름):"+GetName()+"(나이):"+GetAge()+",스핑크스");
	}	
}
public class a8_adstact_interface {
	public static void main(String[]args) {
	Dog dog = new Dog();
	Cat cat= new Cat();
	Human human =new Human();
	
	human.iq(100);
	human.Name("사람");
	human.Age(32);
	human.print();
	human.intel();
	dog.Name("멍멍");
	dog.Age(2);
	dog.print();
	cat.Name("야옹");
	cat.Age(4);
	cat.print();

	}
}
