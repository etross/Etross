package A1_�������ڷ���;

public class A1_�������ڷ��� {
	public static void main(String[]args) {
		final var num1= 1;                                                     //@@ var = �ڹ� ���� 10���� ���� �ڵ� (variable type) �ڷ���
		                                                                       //@@ ���� ���� ����, int,double,String�� �ڵ����� �ڷ����� ��ȯ���ش�.
		                                                                       //@@ final = ���(������ �ʴ� ��), ���ͷ� ��� = ������ȭ�� ���� ex) 1,2,3
		
		byte num2 = 2;                                                         // byte = 1 byte = 8 bit 
		short num3= 3;                                                    	   // short = 2 byte = 16 bit 
		int num4= 4;														   // int = 4 byte = 32 bit
		long num5= 5L;														   // long = 8 byte = 64 bit / int�� ���� +-2������� L �Ⱥٿ��� �ȴ�.
		
		float num6= 1.6f;                                                      // float = 4 byte = 32 bit / float���� �ڿ� f�� �ٿ���, double�� ����.
		double num7= 0.7;                                                      // double = 8 byte = 64 bit
		
		char num8= 'A';                                                        // char = 2 byte = 16 bit
		char num9= 65;														   // <�ƽ�Ű�ڵ�> A = 65, ���ڸ� ǥ���Ҷ� ''�� ����Ѵ�.
		boolean num10= num1 == num4;
		
		int num11= num2+num3;                                                  // byte���� short���� int������ �����Ͱ� �����Ƿ�, �ڵ����� ����ȯ �ȴ�. 
		int num12= (int)num5 + (int)num5;                                      // int���� ū ���� �����Ҷ���, ���� ����ȯ�� ���ش�. ex) (int)num5 
		float num13= (int)num6 + (int)num7;                                   // �Ǽ��� int������ ����ȯ�� �ϸ�, �Ҽ������ϴ� ��� ��������.
				
		System.out.println("�ڵ� ����ȯ(������ ����ȯ): " + num11);                   
		System.out.println("���� ����ȯ(����� ����ȯ): " + num12);
		System.out.println("�Ǽ��� ���������� ����ȯ: " + num13);
		
		System.out.println("���� ���: " + num8);
		System.out.println("���� ���: " + (int)num9);
		System.out.println("���� ���: " + num10);
		
	}

}
