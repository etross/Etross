package b4_예외처리;

class Exception1 {                                                   // 익명 클래스
	  void exception1(){                                             // Exception()= 객체 생성가능 변수 사용불가, void exception()= 객체생성 가능 변수 사용 가능
		try {                                                       // try= 실행문
			int arr[] = {1,2,3};
			System.out.println(arr[0]);
			System.out.println(arr[4]);
		}
		catch(ArrayIndexOutOfBoundsException a){                    // catch= 예외처리문
			System.out.println("배열의 범위를 벗어남.");
			a.printStackTrace();                                    // 오류문구를 출력함.
		}
		try {
			int arr[] = new int[-7];
		}
		catch(NegativeArraySizeException b){
			System.out.println("배열의 크기가 음수임.");
			b.printStackTrace();
		}
		try {
			int num1 = 2;
			int num2 = 0;
			System.out.println((num1/num2));
		}
		catch(ArithmeticException c) {
			System.out.println("나눗셈의 제수가 0(Null)임.");
			c.printStackTrace();
		}
		try {
			StringBuilder a = null;
			a.delete(2, 4);
		}
		catch(NullPointerException d){
			System.out.println("참조변수가 0(Null)임.");
			d.printStackTrace();
		}
		finally {                                                    // finally= 예외처리가 되든 안되든 무조건 실행.
			System.out.println("=== 프로그램이 종료되었습니다. ===");
		}
	}
}

public class b4_예외처리 {                                             // 같은 파일 내 하나의 같은이름의 클래스만 존재할 수 있다.
	
	static class Exception2 extends Exception{                      // extends Exception= 예외처리를 상속받는 클래스로 만든다.(사용자정의 예외처리클래스)
																	// 정적 중첩클래스= "public class b4_예외처리"라는 메인 클래스안에 내부 클래스이므로
															        // 메인 클래스 안에서는 변수처럼 사용되지만, 클래스안에 메소드를 다른 메소드에서 불러올때는
		                                                            // 인스턴스를 생성하여 사용하므로(heap메모리에서) static을 사용하여 스택메모리의 변수로 만들어야 함
		Exception2() {
			super("입력값이 음수 입니다.");                               // 매소드명은 클래스명과 같게 내용은 항상 super를 사용.
		}
	}
	
	public static void main(String[]args) {                         // 매인클래스 안에 매인 매소드
		
		Exception1 ex = new Exception1();                           // 익명 클래스의 인스턴스생성과 변수선언을 동시에 실행
		ex.exception1();                                            // 변수로 설정된 인스턴스의 매소드 실행
		
		try {                                                       // 예외처리를 하는 매소드를 사용할때는 폼에 맞게 try~catch안에서 사용
			int num = -3;
			if (num < 0) {
				throw new Exception2();                             // throw= 예외처리 매소드를 불러오는 공식.
			}
		}
		catch(Exception2 a){
			a.printStackTrace();
		}
	}
}

