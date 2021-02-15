package b4_����ó��;

class Exception1 {                                                   // �͸� Ŭ����
	  void exception1(){                                             // Exception()= ��ü �������� ���� ���Ұ�, void exception()= ��ü���� ���� ���� ��� ����
		try {                                                       // try= ���๮
			int arr[] = {1,2,3};
			System.out.println(arr[0]);
			System.out.println(arr[4]);
		}
		catch(ArrayIndexOutOfBoundsException a){                    // catch= ����ó����
			System.out.println("�迭�� ������ ���.");
			a.printStackTrace();                                    // ���������� �����.
		}
		try {
			int arr[] = new int[-7];
		}
		catch(NegativeArraySizeException b){
			System.out.println("�迭�� ũ�Ⱑ ������.");
			b.printStackTrace();
		}
		try {
			int num1 = 2;
			int num2 = 0;
			System.out.println((num1/num2));
		}
		catch(ArithmeticException c) {
			System.out.println("�������� ������ 0(Null)��.");
			c.printStackTrace();
		}
		try {
			StringBuilder a = null;
			a.delete(2, 4);
		}
		catch(NullPointerException d){
			System.out.println("���������� 0(Null)��.");
			d.printStackTrace();
		}
		finally {                                                    // finally= ����ó���� �ǵ� �ȵǵ� ������ ����.
			System.out.println("=== ���α׷��� ����Ǿ����ϴ�. ===");
		}
	}
}

public class b4_����ó�� {                                             // ���� ���� �� �ϳ��� �����̸��� Ŭ������ ������ �� �ִ�.
	
	static class Exception2 extends Exception{                      // extends Exception= ����ó���� ��ӹ޴� Ŭ������ �����.(��������� ����ó��Ŭ����)
																	// ���� ��øŬ����= "public class b4_����ó��"��� ���� Ŭ�����ȿ� ���� Ŭ�����̹Ƿ�
															        // ���� Ŭ���� �ȿ����� ����ó�� ��������, Ŭ�����ȿ� �޼ҵ带 �ٸ� �޼ҵ忡�� �ҷ��ö���
		                                                            // �ν��Ͻ��� �����Ͽ� ����ϹǷ�(heap�޸𸮿���) static�� ����Ͽ� ���ø޸��� ������ ������ ��
		Exception2() {
			super("�Է°��� ���� �Դϴ�.");                               // �żҵ���� Ŭ������� ���� ������ �׻� super�� ���.
		}
	}
	
	public static void main(String[]args) {                         // ����Ŭ���� �ȿ� ���� �żҵ�
		
		Exception1 ex = new Exception1();                           // �͸� Ŭ������ �ν��Ͻ������� ���������� ���ÿ� ����
		ex.exception1();                                            // ������ ������ �ν��Ͻ��� �żҵ� ����
		
		try {                                                       // ����ó���� �ϴ� �żҵ带 ����Ҷ��� ���� �°� try~catch�ȿ��� ���
			int num = -3;
			if (num < 0) {
				throw new Exception2();                             // throw= ����ó�� �żҵ带 �ҷ����� ����.
			}
		}
		catch(Exception2 a){
			a.printStackTrace();
		}
	}
}

