package a7_오버로딩;

import java.math.BigDecimal;
import java.math.MathContext;

class Cal{                                                     // 오버로딩 = 과적함
	int add(int num1,int num2) {                               // 똑같은 add매소드에 앞에 int와 double로 오버로딩
		return num1 + num2; 
	}
	double add(double num1,double num2) {
		return num1 + num2;
	}
	int min(int num1,int num2) {                               // 똑같은 add매소드에 앞에 int와 double로 오버로딩
		return num1 - num2;
	}
	double min(double num1,double num2) {
		return num1 -num2;
	}
}
class info{
	String name1; int age1; String se1; String na1;
	void man(String name, int age, String se, String na) {
		name1= name;
		age1= age;
		se1= se;
		na1= na;
	}
	void man(String name, int age, String se) {
		name1= name;
		age1= age;
		se1= se;	
	}
	void  print() {
		System.out.println("===정보===");
		System.out.println("이름:"+name1);
		System.out.println("나이:"+age1);
		System.out.println("성별:"+se1);
		if (na1 == null)
			System.out.println("사는곳:없음");
		else 
			System.out.println("사는곳:"+na1);
	}
}
public class a7_오버로딩 {
	public static void main(String[]args) {
		int num1= 1; int num2= 2;
		BigDecimal num3= new BigDecimal("1.123");
		BigDecimal num4= new BigDecimal("2.41235");
		double num33 =num3.doubleValue();                       // 강제 형변환은 됬지만, new Cal().add(num33,num44)과
		double num44 =num4.doubleValue();                       // 같이, 매소드 인자로 사용하기 위해 한번 더 치환해야 한다.
		                                                        // 이유- 형변환은 됐지만, 변수 생성은 안됬으므로 (?)
		System.out.println("값:"+ new Cal().add(num1,num2)); 
		System.out.println("값:"+ new Cal().add(num33,num44));   // 형식에 맞게 출력됨. (int add,double add)
		System.out.println("값:"+ new Cal().min(num1,num2));
		System.out.println("값:"+ new Cal().min(num33,num44));
		
		info man1 = new info();
		man1.man("임현섭",31,"남","천안");
		info man2 = new info();
		man2.man("아무개",20,"남");
		
		man1.print();
		man2.print();
	}
}
