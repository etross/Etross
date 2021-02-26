package b5_Scanner;
import java.util.InputMismatchException;
import java.util.Scanner;

class Nomal{
	void nomal() { 
		String str= "3.14 .5a-bv";
		Scanner sc = new Scanner(str).useDelimiter("\\s+");                //  \\s+ = 스페이스바 하나이상을 구분함        
		Scanner sc11 = new Scanner(str).useDelimiter("\\.");               //  \\. = . 으로 구분함
		Scanner sc22 = new Scanner(str).useDelimiter("\\-");  
		
		while(sc.hasNext()) {										       // sc.hasNext()= sc 스캐너에 내용이 있는지 판단 있으면 true, 없으면 false								
			System.out.println("스페이스바구분 문장출력:"+sc.next());                                
			}
		while(sc11.hasNext()) {																		
			System.out.println("'.'구분 문장출력:"+sc11.next());                                 
			}
		while(sc22.hasNext()) {																		
			System.out.println("'-'구분 문장출력:"+sc22.next());                                 
			}
		
		Scanner sc2 = new Scanner(System.in);                              // sc2= 입출력 저장할 변수, system.in= 시스템안에 입력값을 넣을 공간  
		System.out.println("숫자 입력:");
		int str2 = sc2.nextInt();                                          // str2변수에 sc2변수에 입력된 값을 저장
		System.out.println("숫자 출력:"+str2);
		sc2.reset();                                                       // sc2값을 초기화 함.
	}
}

class Exception1{
	void exception() {
		Scanner sc3 = new Scanner(System.in);
		try {                                                                
			System.out.println("숫자를 입력하세요.");
			int num = sc3.nextInt();
			System.out.println("숫자 출력:"+num);
		}
		catch(InputMismatchException e) {                                    // InputMismatchException= 보편적 예외처리방법. (대신 import 필요)
			System.out.println("숫자만 입력하세요.");                             
			e.printStackTrace();                                             // printStackTrace()대신 getMessage()사용 가능
		}
		finally {
			System.out.println("종료");
			sc3.close();                                                      // 스캐너 프로그램의 가장 마지막에 한번 실행해준다 (중간에 하면 에러발생)
		}
	}
}

public class b5_Scanner {
	public static void main(String[]args){
		Nomal no = new Nomal();
		no.nomal();
		
		Exception1 ex = new Exception1();
		ex.exception();
	}
}
