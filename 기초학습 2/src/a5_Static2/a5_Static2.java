package a5_Static2;
import a5_Add.*;
                                                       // import Add*;   << Add패키지의 모든 클래스 가져옴.
public class a5_Static2 {
	public static void main(String[]args) {
		int num1= 5;
		int num2= 10;
		System.out.println("값:"+new a5_Add(num1,num2).get());  
	}
}