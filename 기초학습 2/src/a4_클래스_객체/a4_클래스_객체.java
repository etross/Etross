package a4_클래스_객체;

class plus{                                        // 기능성 class는 public class 위에 위치 해야함.
	                                               // class 앞에 default 지시자 생략함.
	int num1, num2;                                // input()과 add() 매소드에 동시적용 하기위해 
	public void input( int a, int b) {             // 객체화한 adder 매소드에서 값을 입력 받음
		num1=a; 
		num2=b;
	}
	public void add() {
		System.out.println("값:"+(num1+num2));
	}
	int result_a() {                               // int형 메소드를 public 없이 생성
		return num1;                               // 값을 반환하는 메소드 
	}
	int result_b() {
		return num2;
	}
}
///////////////////////////////////////////////////////////////////////////////////////
class Name{
	private String name;                            
	Name(String n){                                 // 클래스의 이름과 동일하게 쓰면, 클래스 매소드로 연결 된다.
		name= n;                                    // 매소드 앞에 void 등과 같은 제어지시자를 추가로 넣게되면, 개별 매소드로 인식. 
	}
	void info_n() {
	System.out.println("이름:"+name);
		}
}
class Age{                                           //         [제어지시자의 종류]
	private int age;                                 // private = class안에서만 사용 가능한 제어지시자.
	 Age(int a) {                                    // default(생략시 자동적용) = class와 pakage안에서 사용되는 제어지시자.
		age = a;                                     // protected = class,pakage,상속받은 class 안에서 사용.
	}                                                // public = 모든 곳에서 사용.
	void info_a() {
		System.out.println("나이:"+age);
	}
}
class Phone{                                         // 하나의 패키지안에는 하나의 public class만 존재하며 public 클래스 위에 선언된 서브 클래스는
	private String phone;                            // 왠만하면 사용하지 않는다. 스파게티코드 방지.
	 Phone(String p) {
		phone = p;
	}
	void info_p() {
		System.out.println("HP:"+phone);
	}
}
class Interview{
	private Name name1;                                // private 형식의 Name클래스의 name1 객체 선언
	private Age age1;
	private Phone phone1;
	Interview(String n1,int a1,String p1){             // Interview클래스로 연결된 Interview매소드에서 참조변수를 모아서 
		name1 = new Name(n1);                          // 이름,나이,전화번호 입력값을 한번에 관리 가능하도록 캡슐화(정보은닉)
		age1 = new Age(a1);                            
		phone1 = new Phone(p1);
	}
	void infop(){                                      // class안에 infop이라는 독립매소드로 각각의 println를 캡슐화 
		name1.info_n();
		age1.info_a();
		phone1.info_p();
	}
}
class Employee{
	void Employee_info(Interview view) {               // 매소드 안에서는 클래스를 참조변수로 선언과 동시에 생성 가능
		view.infop();                                  // 매개변수에 Interview매소드를 연결하고,내용인 infop()메소드를 출력
	}                                                  // class를 하나 만들어서 입출력을 관리하는 메소드를 생성함.(캡슐화)
}
////////////////////////////////////////////////////////////////////////////////////////
public class a4_클래스_객체 {
	public static void main(String[]args){
		plus adder=new plus();                         // 클래스를 객체화하는 공식 (adder = 참조변수),
		adder.input(5,4);                              // plus 클래스의 input메소드에 입력시킬 값
		adder.add();                                   // add()메소드 호출
		System.out.println("a와 b값:"+adder.result_a()+","+adder.result_b()+"\n"); 
		
	//    (객체 선언)       (객체 생성)       = 선언과 생성 동시에
		Employee emp = new Employee();                 // 독립된 매소드를 emp라는 참조변수로 생성
		emp.Employee_info(new Interview("임현섭",31," 010-9780-9468"));
    // Employeed 클래스의 참조변수 emp안에 Employee_info매소드의 전달인자에서 Interview 클래스를 객체생성과 동시에 전달인자 전달
	// new Interview는 매개변수를 입력해주기위해  main매소드에 객체를 생성하기 위함.
		
	}
}
