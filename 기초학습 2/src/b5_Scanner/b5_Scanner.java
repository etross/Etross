package b5_Scanner;
import java.util.InputMismatchException;
import java.util.Scanner;

class Nomal{
	void nomal() { 
		String str= "3.14 .5a-bv";
		Scanner sc = new Scanner(str).useDelimiter("\\s+");                //  \\s+ = �����̽��� �ϳ��̻��� ������        
		Scanner sc11 = new Scanner(str).useDelimiter("\\.");               //  \\. = . ���� ������
		Scanner sc22 = new Scanner(str).useDelimiter("\\-");  
		
		while(sc.hasNext()) {										       // sc.hasNext()= sc ��ĳ�ʿ� ������ �ִ��� �Ǵ� ������ true, ������ false								
			System.out.println("�����̽��ٱ��� �������:"+sc.next());                                
			}
		while(sc11.hasNext()) {																		
			System.out.println("'.'���� �������:"+sc11.next());                                 
			}
		while(sc22.hasNext()) {																		
			System.out.println("'-'���� �������:"+sc22.next());                                 
			}
		
		Scanner sc2 = new Scanner(System.in);                              // sc2= ����� ������ ����, system.in= �ý��۾ȿ� �Է°��� ���� ����  
		System.out.println("���� �Է�:");
		int str2 = sc2.nextInt();                                          // str2������ sc2������ �Էµ� ���� ����
		System.out.println("���� ���:"+str2);
		sc2.reset();                                                       // sc2���� �ʱ�ȭ ��.
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
		catch(InputMismatchException e) {                                    // InputMismatchException= ������ ����ó�����. (��� import �ʿ�)
			System.out.println("���ڸ� �Է��ϼ���.");                             
			e.printStackTrace();                                             // printStackTrace()��� getMessage()��� ����
		}
		finally {
			System.out.println("����");
			sc3.close();                                                      // ��ĳ�� ���α׷��� ���� �������� �ѹ� �������ش� (�߰��� �ϸ� �����߻�)
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
