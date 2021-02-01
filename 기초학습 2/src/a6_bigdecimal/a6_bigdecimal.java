//////////////////////////////////////////////////////////////////////////////////////////////
//big1.add(big2); = big1 더하기 big2 (big1 + big2)

//big1.subtract(big2); = big1 뺴기 big2 (big1 - big2)

//big1.multiply(big2); = big1 곱하기 big2 (big1 * big2)

//big1.divide(big2, MathContext.DECIMAL32); = big1 나누기 big2 (big1 / big2)
//DECIMAL32 = 7자리 , DECIMAL64 = 16자리 , DECIMAL128 = 34자리 

//big1.remainder(big2); big1 나누기 big2의 나머지 (big1 % big2)

//int num1 = big1.intValue(); = big1의 값을 int형으로 변환하여 num1에 저장(소수점 이하 제거)
//double num2 = big2.doubleValue(); = big2의 값을 double형으로 변환하여 num2에 저장
//float num1 = big1.floatValue(); = big1의 값을 float형으로 변환하여 num1에 저장
//String str = big1.toString(); = big1의 값을 String형으로 변환하여 str에 저장
//////////////////////////////////////////////////////////////////////////////////////////////
package a6_bigdecimal;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class a6_bigdecimal {
	public static void main(String[]args) {
	BigDecimal num1 = new BigDecimal("3.123456789");                 // num1이라는 인수에 1.123456789라는 변수를 string형식으로 저장.
	BigDecimal num2 = new BigDecimal("1.141592612");                 // string 형식이라서 사칙연산이 안된다.
	num1.doubleValue();                                             
	num2.doubleValue();                                              // 사칙연산이 되도록 double로 형변환 함.
	
	System.out.println(num1.add(num2,MathContext.DECIMAL32));        // add= 덧셈, subtract= 뺄셈, multiply= 곱셈, divide= 나눗셈 
	System.out.println(num1.subtract(num2,MathContext.DECIMAL64));   // DECIMAL32= 전체 7자리로 고정, DECIMAL64= 16자리, DECIMAL128= 32자리
	System.out.println(num1.multiply(num2,MathContext.DECIMAL128));  // 제일오른쪽 0으로 표기되는 것은 표기되지 않는다(더이상 숫자가 없을 때)
	System.out.println(num1.divide(num2,MathContext.DECIMAL64)+"\n");     // MathContext.DECIMAL32는 생략가능하지만 무한소수점일때는 사용 권장.
	
	DecimalFormat set1 = new DecimalFormat("0.#");                 // num이라는 변수에 0.0000의 자리수로 포맷함.(#= 1자리, ##= 2자리)
	DecimalFormat set2 = new DecimalFormat("0.##");   
	DecimalFormat set3 = new DecimalFormat("0.###");

	double num3= 1.123123123;
	double num4= 1.987897987;
	
	set1.setRoundingMode(RoundingMode.HALF_UP);                       // HALF_UP, HALF_DOWN, HALF_EVEN= 모두 반올림
	set2.setRoundingMode(RoundingMode.CEILING);                       // CEILING= 올림
	set3.setRoundingMode(RoundingMode.FLOOR);                         // FLOOR= 내림 (이하 절삭)

	System.out.println(set1.format(num3));
	System.out.println(set2.format(num3));
	System.out.println(set3.format(num3)+"\n");
	
	System.out.println(set1.format(num4));
	System.out.println(set2.format(num4));
	System.out.println(set3.format(num4));

	}
}
