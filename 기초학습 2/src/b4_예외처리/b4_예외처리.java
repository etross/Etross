package b4_����ó��;

public class b4_����ó�� {
	public static void main(String[]args) {
		try {                                                         // try= ���๮
			int arr[] = {1,2,3};
			System.out.println(arr[0]);
			System.out.println(arr[4]);
		}
		catch(ArrayIndexOutOfBoundsException e){                      // catch= ����ó����
			System.out.println("�迭�� ������ ���.");
			e.printStackTrace();                                      // ���������� �����.
		}
		try {
			int arr[] = new int[-7];
		}
		catch(NegativeArraySizeException e){
			System.out.println("�迭�� ũ�Ⱑ ������.");
			e.printStackTrace();
		}
		try {
			int num1 = 2;
			int num2 = 0;
			System.out.println((num1/num2));
		}
		catch(ArithmeticException e) {
			System.out.println("�������� ������ 0(Null)��.");
			e.printStackTrace();
		}
		try {
			StringBuilder a = null;
			a.delete(2, 4);
		}
		catch(NullPointerException e){
			System.out.println("���������� 0(Null)��.");
			e.printStackTrace();
		}
		finally {                                                     // finally= ����ó���� �ǵ� �ȵǵ� ������ ����.
			System.out.println("=== ���α׷��� ����Ǿ����ϴ�. ===");
		}
	}

}
