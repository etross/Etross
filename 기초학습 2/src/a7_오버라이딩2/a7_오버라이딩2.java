package a7_오버라이딩2;

class national{
	void na_print(){
		System.out.println("자연수");
	}                                                        // class A {}
}                                                            // class B extends A{}
class integer extends national{                              // A a = new B(); >> 사용 가능하다. 이유는  object 때문.
	void in_print(){                                         // B가 A를 상속하면서, A는 B의 object를 간접 상속받는 구조이기때문에, 오류는 나지 않는다.
		System.out.println("정수");                           // A 에서 B의 object 사용하기 위해서.
	}
}
class rational extends integer{                              // public 클래스는 하나의 패키지에 하나만 존재 
	void ra_print(){
		System.out.println("유리수");
	}
}

public class a7_오버라이딩2 {
	public static void main(String[]args) {                  // static = static 영역에 저장  = 프로그램이 종료될때까지 지워지지 않고 남아 있는 데이터 = 전역변수 
		national na = new national();                        // national na = heap 영역에 저장
		integer in = new integer();                          // heap영역 = reperence type의 (참조변수)형식을 갖는 , 객체 (인스턴스),객체변수 ,object 타입(String 등등)
		rational ra = new rational();                        // ex) national na = new national()
		                                                     // stack 영역 = 원시타입(int,long,char등등)의 기본 자료형에 해당하는 지역변수 ex) int k 
		System.out.println("==잘못된 형식==");                   // stack 영역의 지역변수는 매소드가 호출될때 생성되고 종료되면 사라진다.
		instanceofcheck(na);                                 // heap영역의 참조값들은 주소형식으로 저장되며(실제값으로), stack에 참조값을 반환하는 역할을 한다.  
		instanceofcheck(in);                                 // heap에 저장된 데이터가 더 이상 불필요하다고 JVM(자바 가상머신)이 판단하면, 가비지 컬렉션(GC,쓰레기수집) 
		instanceofcheck(ra);                                 // 에 의해 헤제된다.
		
		System.out.println("==올바른 형식==");                   // 모든 쓰레드는 각 stack 영역을 갖고, 쓰레드가 여러개여도 하나의 heap영역을 갖는다.
		instanceofcheck2(na);
		instanceofcheck2(in);
		instanceofcheck2(ra);
}
	public static void instanceofcheck(national nn) {         // A instanceof B= B가 A를 상속하면 TRUE 아니면, FAULSE
			if(nn instanceof integer) {
				((integer)nn).in_print();                     // ((integer)nn) = nn을 integer 클래스로 형변환
			}                                                 //   >>integer가 nn클래스를 상속하여, 부모클래스(nn)를
			else if (nn instanceof rational) {                //     자식클래스(integer)로 형변환이 가능하다.
				((rational)nn).ra_print();                 
			}
			else                                              // if문의 순서에 따라 오류가 발생한다.
				nn.na_print();                                // rational이 integer를 상속하므로
	}                                                         // rational은 "if(nn instanceof integer)"의
	                                                          // 조건문을 만족하게되어, integer값을 반환하게 된다. = rational클래스가 integer 클래스를 포함한다.
	public static void instanceofcheck2(national nn) {        // instanceofcheck2 매소드 인자로 national 클래스의 객체 (참조변수)nn을 포함하겠다는 의미.
		if(nn instanceof rational) {
			((rational)nn).ra_print();                        // 가장 마지막 자식클래스인 rational을 가장 위에 (먼저)위치 시킴으로써,
		}                                                     // national과 integer 클래스의 조건만족의 중복을 피함.
		else if (nn instanceof integer) {
			((integer)nn).in_print();
		}
		else 
			nn.na_print();
	}
}

	


