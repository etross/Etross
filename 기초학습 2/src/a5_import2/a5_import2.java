package a5_import2;

import a5_import.a5_import.Add;                                     // import ��Ű����.Ŭ������; = Ư�� Ŭ������ �ҷ���
import a5_import.a5_import.*;                                       // import ��Ű����.Ŭ����* = �ش� public Ŭ������ ��� Ŭ���� ������.

public class a5_import2 {

	public static void main(String[]args) {
		int num1= 5;
		int num2= 10;
		 
		Add add = new Add(num1,num2);                                
		System.out.println("��:"+add.get());  
		
	}
}