package A2_������;

public class A2_������ {
	public static void main(String[]args) {	
		int num1= 1;
		int num2= 2;
		
		num1++;                                                   // ++ -- ��ġ�� �յڿ� ��ġ �� �� �ְ�, ���������� ��� �Ѵ�. 
		System.out.println("1����:"+num1);	
	    --num1;
	    System.out.println("1����:"+num1);
		
	    boolean log = (num1=num1+1) > 0 || (num2= num2-3) > 0;    // (num2= num2-3) > 0 �̺κ��� ���� ������(num1�κ�) ���� �����Ͽ�, �ܶ�ȸ���򰡰� �̷������ 
	    System.out.println("num1 ��:"+num1);                       // ���� ������ �̷�������ʰ� num2=2�� ���� �״�� ��µȴ�.(num1������ �̷����)
	    System.out.println("num2 ��:"+num2);                       // ��������: &&(��� �� �϶�, ��),||(���� �ϳ��� ���̿���, ��),!(���̸� ����,�����̸� ��) 
	    
	    int num3= 3;
	    num3 += num2;                                             // +=,*= ���� �����ڸ� ���մ��Կ����� ��� �Ѵ�.
	    System.out.println("num3 ��:"+num3); 
	    num3 -= num2;
	    System.out.println("num3 ��:"+num3); 
	    num3 *= num2;
	    System.out.println("num3 ��:"+num3); 
	    num3 /= num2;
	    System.out.println("num3 ��:"+num3); 
	    num3 %= num2;
	    System.out.println("num3 ��:"+num3); 
	    
	    char logic = (num2 >= num3)? 'T':'F';                     // 3�� ������ , ���ǹ��� =�� ����Ҽ� ������, <= ���� ���迬���ڸ� ��밡���ϴ�. 
	    System.out.println("������ ��:"+logic); 
	    
	    int logic2 = (num2 >= num3)? num3+1 : num3-1 ;            // �������� �������� �ڷ����� ���� �� �ִ�.
	    System.out.println("������ ��:"+logic2);
		                                                          
	}

}
