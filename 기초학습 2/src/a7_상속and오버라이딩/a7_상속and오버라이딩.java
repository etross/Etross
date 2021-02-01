package a7_상속and오버라이딩;

class intro{                                                       // 기초클래스, 수퍼클래스
	private final String name;                                     //final = 상속 불가능한 제어자로 설정
	private int age;
	
	intro(String name, int age){
		this.name= name;                                           // 매개변수 name과 age를 this를 사용하여 같은 이름으로 사용가능
		this.age= age;
	}
	void print() {
		System.out.println("이름:"+name+"\n"+"나이"+age);
	}
}

class intro2 extends intro{                                        // extends를 사용하여, 수퍼클래스인 intro(부모클래스)를 상속받음.
	final int num;                                                       // extends를 사용하면 , 수퍼클래스인 intro가 super로 대체되며, super만 사용가능.
	final String info;
	
	intro2(String name, int age,int a,String b){
		super(name,age);                                           // super를 사용하여 객체생성을 하지않고, 인자를 받을 수 있다.
		num= a;                                                    // super이외에 객체화는 불가능하다.
		info=b;
	}
	void print() {
		super.print();                                             // 상속받은 intro의 print()가 실행되어야 하지만, 수퍼클래스와 서브클래스의 두 메소드이름이 같으므로, 
		System.out.println("학번:"+num+"\n"+"군필여부:"+info);         // 오버라이딩(깔아뭉개다)이 되기 때문에, intro2의 print()매소드만 실행된다.
	}                                                              // 수퍼클래스의 print()매소드를 불러오려면, super.print()를 사용하여야 한다.
}                                                                  // <오버라이딩이란>, 상속하는 부모클래스와 상속받는 자식클래스안의 같은 이름의 매소드가 충돌을 일으킬때,
                                                                   // 발생하는 오류를 자식클래스 우선주의로 규칙을 정하는 것이라고 할 수 있다. 
class intro3 {                                                     // object개념에서는 상속이외에 매소드 호출을 하지않고 타 클래스의 매소드를 호출 할때, 사용한다.
	void intro3(intro2 in) {
		in.print();
		}
	
}
public class a7_상속and오버라이딩 {
	public static void main(String[]args) {

		intro3 kk = new intro3();
		kk.intro3(new intro2("임현섭",31,10,"군필"));
	}
}
