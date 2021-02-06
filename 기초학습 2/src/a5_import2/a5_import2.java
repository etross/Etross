package a5_import2;

import a5_import.a5_import.Add;                                     // import 패키지명.클래스명; = 특정 클래스만 불러옴
import a5_import.a5_import.*;                                       // import 패키지명.클래스* = 해당 public 클래스의 모든 클래스 가져옴.

public class a5_import2 {

	public static void main(String[]args) {
		int num1= 5;
		int num2= 10;
		 
		Add add = new Add(num1,num2);                                
		System.out.println("값:"+add.get());  
		
	}
}