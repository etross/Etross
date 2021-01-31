package A2_연산자;

public class A2_연산자 {
	public static void main(String[]args) {	
		int num1= 1;
		int num2= 2;
		
		num1++;                                                   // ++ -- 위치는 앞뒤에 위치 할 수 있고, 증감연산자 라고 한다. 
		System.out.println("1증가:"+num1);	
	    --num1;
	    System.out.println("1감소:"+num1);
		
	    boolean log = (num1=num1+1) > 0 || (num2= num2-3) > 0;    // (num2= num2-3) > 0 이부분은 앞의 조건이(num1부분) 먼저 만족하여, 단락회로평가가 이루어져서 
	    System.out.println("num1 값:"+num1);                       // 실제 연산이 이루어지지않고 num2=2의 값이 그대로 출력된다.(num1연산은 이루어짐)
	    System.out.println("num2 값:"+num2);                       // 논리연산자: &&(모두 참 일때, 참),||(둘중 하나만 참이여도, 참),!(참이면 거짓,거짓이면 참) 
	    
	    int num3= 3;
	    num3 += num2;                                             // +=,*= 같은 연산자를 복합대입연산자 라고 한다.
	    System.out.println("num3 값:"+num3); 
	    num3 -= num2;
	    System.out.println("num3 값:"+num3); 
	    num3 *= num2;
	    System.out.println("num3 값:"+num3); 
	    num3 /= num2;
	    System.out.println("num3 값:"+num3); 
	    num3 %= num2;
	    System.out.println("num3 값:"+num3); 
	    
	    char logic = (num2 >= num3)? 'T':'F';                     // 3항 연산자 , 조건문에 =은 사용할수 없으며, <= 같은 관계연산자만 사용가능하다. 
	    System.out.println("참거짓 값:"+logic); 
	    
	    int logic2 = (num2 >= num3)? num3+1 : num3-1 ;            // 변수에는 여러가지 자료형이 사용될 수 있다.
	    System.out.println("참거짓 값:"+logic2);
		                                                          
	}

}
