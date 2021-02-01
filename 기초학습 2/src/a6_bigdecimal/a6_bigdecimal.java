//////////////////////////////////////////////////////////////////////////////////////////////
//big1.add(big2); = big1 ���ϱ� big2 (big1 + big2)

//big1.subtract(big2); = big1 ���� big2 (big1 - big2)

//big1.multiply(big2); = big1 ���ϱ� big2 (big1 * big2)

//big1.divide(big2, MathContext.DECIMAL32); = big1 ������ big2 (big1 / big2)
//DECIMAL32 = 7�ڸ� , DECIMAL64 = 16�ڸ� , DECIMAL128 = 34�ڸ� 

//big1.remainder(big2); big1 ������ big2�� ������ (big1 % big2)

//int num1 = big1.intValue(); = big1�� ���� int������ ��ȯ�Ͽ� num1�� ����(�Ҽ��� ���� ����)
//double num2 = big2.doubleValue(); = big2�� ���� double������ ��ȯ�Ͽ� num2�� ����
//float num1 = big1.floatValue(); = big1�� ���� float������ ��ȯ�Ͽ� num1�� ����
//String str = big1.toString(); = big1�� ���� String������ ��ȯ�Ͽ� str�� ����
//////////////////////////////////////////////////////////////////////////////////////////////
package a6_bigdecimal;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class a6_bigdecimal {
	public static void main(String[]args) {
	BigDecimal num1 = new BigDecimal("3.123456789");                 // num1�̶�� �μ��� 1.123456789��� ������ string�������� ����.
	BigDecimal num2 = new BigDecimal("1.141592612");                 // string �����̶� ��Ģ������ �ȵȴ�.
	num1.doubleValue();                                             
	num2.doubleValue();                                              // ��Ģ������ �ǵ��� double�� ����ȯ ��.
	
	System.out.println(num1.add(num2,MathContext.DECIMAL32));        // add= ����, subtract= ����, multiply= ����, divide= ������ 
	System.out.println(num1.subtract(num2,MathContext.DECIMAL64));   // DECIMAL32= ��ü 7�ڸ��� ����, DECIMAL64= 16�ڸ�, DECIMAL128= 32�ڸ�
	System.out.println(num1.multiply(num2,MathContext.DECIMAL128));  // ���Ͽ����� 0���� ǥ��Ǵ� ���� ǥ����� �ʴ´�(���̻� ���ڰ� ���� ��)
	System.out.println(num1.divide(num2,MathContext.DECIMAL64)+"\n");     // MathContext.DECIMAL32�� �������������� ���ѼҼ����϶��� ��� ����.
	
	DecimalFormat set1 = new DecimalFormat("0.#");                 // num�̶�� ������ 0.0000�� �ڸ����� ������.(#= 1�ڸ�, ##= 2�ڸ�)
	DecimalFormat set2 = new DecimalFormat("0.##");   
	DecimalFormat set3 = new DecimalFormat("0.###");

	double num3= 1.123123123;
	double num4= 1.987897987;
	
	set1.setRoundingMode(RoundingMode.HALF_UP);                       // HALF_UP, HALF_DOWN, HALF_EVEN= ��� �ݿø�
	set2.setRoundingMode(RoundingMode.CEILING);                       // CEILING= �ø�
	set3.setRoundingMode(RoundingMode.FLOOR);                         // FLOOR= ���� (���� ����)

	System.out.println(set1.format(num3));
	System.out.println(set2.format(num3));
	System.out.println(set3.format(num3)+"\n");
	
	System.out.println(set1.format(num4));
	System.out.println(set2.format(num4));
	System.out.println(set3.format(num4));

	}
}
