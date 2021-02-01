package a3_매소드;

public class a3_매소드 {
	public static void main (String[]args) {           // public= 접근제어 지시자(제어 형식) 
	                                                   // static= 전역변수, void= 매개변수, main= 매소드  
		one(1);                                        // 매개변수 있음.
		
		int num2 = two(1);                             // 매개변수 있음.
		System.out.println("two의 값:"+num2);           
		
		int num3= three();                             // 매개변수 없음.
		System.out.println("three의 값:"+num3);
		
		four();                                        // 매개변수 없음.
		
		int num5= 5;                                   // main 매소드안에서 중복선언 값.
		System.out.println("main 매소드의 값:"+num5);
		five();
		
		System.out.println("6!의 값: "+six(6));
		
		System.out.println("7의 4승의 값:"+seven(7,4));
		
		
	}
		public static void one(int a) {                // 반환값이 없으므로 void를 사용. a로 변수만 받음.
			System.out.println("one의 값:"+ a);          // 매개변수가 있고, 반환값이 없다.
		}
		public static int two(int b) {                 // 반환값이 int형이므로, 매개변수를 int로 사용.
			return b+b;                                // 매개변수가 있고, 반환값이 있다.
		}
		public static int three() {                    // 매개변수가 없으므로, 전달인자가 없다.
			return 3;                                  // 매개변수가 없고, 반환값이 있다.
		}
		public static void four() {                    // 매개변수가 없고, 반환값이 없다.
			System.out.println("four의 값:4");
		}
		public static void five() {
			int num5 = 6;                              // five 매소드 안에서 중복선언과 동시에 다르게 선언.
			System.out.println("five 매소드의 값:"+num5);  // num5의 값은 같은 매소드 범위 안에서만 유효함.
		}
		public static int six(int d) {                 // 매개변수가 있으므로,int d로 변수 받음.
			if(d==1)
				return 1;                              // 만약 six(1)이면, 1반환하게 설정.
			else
				return d*six(d-1);	                   // 6*six(5)*six(4)*six(3)*six(2)*six(1)
		}                                              // 6팩토리얼을 출력하는 재귀함수이다.
		public static int seven(int e,int f) {         // 매개변수를 여러가지 선언할 수 있다.
			if(f==0)                                
				return 1;                              
			else 
				return e*seven(e,f-1);                 //재귀함수 형식에서 f를 for문처럼, 조건식으로 사용.
		}
}
