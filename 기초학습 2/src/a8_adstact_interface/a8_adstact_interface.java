package a8_adstact_interface;

abstract class Kind{
	String name;                                                     // 상속받는 여러 클래스에서 사용될 변수이므로, 휘발성 스택변수이다.
	int age;                                                         // 추상클래스는 클래스를 객체화를 할 수 없다. 또한 모든 상속받는 클래스의 부모클래스가 된다.
	int iq;                                                          // 추상클래스는 패키지내에서만 사용할 수 있다.

	void Name(String name) {                                         // 상속받는 여러클래스에서 사용될 이 공통 매소드를 통해서 이름이 저장된다.
		this.name = name;
	}
	String GetName() {                                               // 저장된 이름을 반환하는 반환매소드 
		return name;
	}
	void Age(int age) {
		this.age = age;
	};
	int GetAge() {
		return age;
	}
	abstract void print();                                           // 인자를 받는 매소드가 아닌 빈 메소드일때는, abstract를 사용한다.
	
	void iq(int iq) {
		this.iq = iq;
	};
	int GetIq() {
		return iq;
	}
	
}
interface man{                                                       // 인터페이스는 다른 패키지에서도 사용할 수 있으며, 객체화 할 수 있다.
	  void intel();                                                  // 또한 중복상속을 가능하게 해준다.
}


class Human extends Kind implements man{                             // 인터페이스를 상속받을때에는 implements를 사용하며, ","를 사용해 여러가지 사용 가능
 
	@Override                                                        // @Override = 주석과 같으나 검증역할도 한다.
	void Name(String name){                                      
		this.name = name;
	}
	@Override                                                        
	void Age(int age){                                               // 추상클래스를 상속받을때에는 부모클래스의 매소드와 이름이 같아야 오버라이딩이 된다.
		this.age = age;
	}
	@Override
	void print() {                                                   // GetName()메소드는 Human 클래스가 Kind 메소드를 상속받아 객체선언 없이 그대로 사용
		System.out.println("(이름):"+GetName()+"(나이):"+GetAge()+",사람");
	}
	@Override
	public void intel() {                                             // 인터페이스에서 오버라이딩된 메소드는 다른패키지에서도 사용가능하므로, public을 사용
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
