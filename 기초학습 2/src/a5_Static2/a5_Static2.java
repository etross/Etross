package a5_Static2;
import a5_Add.*;
                                                       // import Add*;   << Add��Ű���� ��� Ŭ���� ������.
public class a5_Static2 {
	public static void main(String[]args) {
		int num1= 5;
		int num2= 10;
		System.out.println("��:"+new a5_Add(num1,num2).get());  
	}
}