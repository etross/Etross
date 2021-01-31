package A1_변수와자료형;

public class A1_변수와자료형 {
	public static void main(String[]args) {
		final var num1= 1;                                                     //@@ var = 자바 버전 10부터 생긴 자동 (variable type) 자료형
		                                                                       //@@ 대입 값에 따라서, int,double,String등 자동으로 자료형을 변환해준다.
		                                                                       //@@ final = 상수(변하지 않는 값), 리터럴 상수 = 데이터화된 숫자 ex) 1,2,3
		
		byte num2 = 2;                                                         // byte = 1 byte = 8 bit 
		short num3= 3;                                                    	   // short = 2 byte = 16 bit 
		int num4= 4;														   // int = 4 byte = 32 bit
		long num5= 5L;														   // long = 8 byte = 64 bit / int형 범위 +-2억까지는 L 안붙여도 된다.
		
		float num6= 1.6f;                                                      // float = 4 byte = 32 bit / float형은 뒤에 f를 붙여서, double과 구별.
		double num7= 0.7;                                                      // double = 8 byte = 64 bit
		
		char num8= 'A';                                                        // char = 2 byte = 16 bit
		char num9= 65;														   // <아스키코드> A = 65, 문자를 표현할때 ''를 사용한다.
		boolean num10= num1 == num4;
		
		int num11= num2+num3;                                                  // byte형과 short형은 int형보다 데이터가 작으므로, 자동으로 형변환 된다. 
		int num12= (int)num5 + (int)num5;                                      // int보다 큰 값을 대입할때는, 강제 형변환을 해준다. ex) (int)num5 
		float num13= (int)num6 + (int)num7;                                   // 실수를 int형으로 형변환을 하면, 소수점이하는 모두 버려진다.
				
		System.out.println("자동 형변환(묵시적 형변환): " + num11);                   
		System.out.println("강제 형변환(명시적 형변환): " + num12);
		System.out.println("실수를 정수형으로 형변환: " + num13);
		
		System.out.println("문자 출력: " + num8);
		System.out.println("숫자 출력: " + (int)num9);
		System.out.println("논리형 출력: " + num10);
		
	}

}
