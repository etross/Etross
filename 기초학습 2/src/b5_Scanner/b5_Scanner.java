package b5_Scanner;
import java.util.InputMismatchException;
import java.util.Scanner;

class Nomal{
	void nomal() { 
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�:");
		String str = sc.nextLine();
		System.out.println("���� ���:"+str);

		Scanner sc2 = new Scanner(System.in);
		System.out.println("���� �Է�:");
		int str2 = sc2.nextInt();
		System.out.println("���� ���:"+str2);

	}
}

class Exception1{
	void exception() {
		Scanner sc3 = new Scanner(System.in);
		try {
			System.out.println("���ڸ� �Է��ϼ���.");
			int num = sc3.nextInt();
			System.out.println("���� ���:"+num);
		}
		catch(InputMismatchException e) {
			System.out.println("���ڸ� �Է��ϼ���.");
			e.printStackTrace();
		}
		finally {
			System.out.println("����");
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
