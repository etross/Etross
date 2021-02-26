package b5_Scanner;
import java.util.InputMismatchException;
import java.util.Scanner;

class Nomal{
	void nomal() { 
		Scanner sc = new Scanner(System.in);
		System.out.println("문장 입력:");
		String str = sc.nextLine();
		System.out.println("문장 출력:"+str);

		Scanner sc2 = new Scanner(System.in);
		System.out.println("숫자 입력:");
		int str2 = sc2.nextInt();
		System.out.println("숫자 출력:"+str2);

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
		catch(InputMismatchException e) {
			System.out.println("숫자만 입력하세요.");
			e.printStackTrace();
		}
		finally {
			System.out.println("종료");
			sc3.close();
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
