package a1_������;

public class a1_������ {	public static void main (String args[]) {
	byte _byte=-100;
	short _short=-30000;
	int _int=2000000000;
	long _long=4010293810940917l;
	float _float=-32.9231818f;
	char _char='n';
	boolean _boolean=true;
	
	System.out.println(_byte);    // 1 byte = 8 bit
	System.out.println(_short);   // 2 byte = 16 bit
	System.out.println(_int);     // 4 byte = 32 bit
	System.out.println(_long);    // ���� ��ǥ�� ���ϸ�, int�� �ν� , 8 byte
	System.out.println(_float);   // ���� fǥ�� ���ϸ�, double�� �ν�
	System.out.println(_char);    // �ƽ�Ű�ڵ�� ''����,���� �״�� ����� ''����
	System.out.println(_boolean); // ��, ����
	System.out.print("\n"+"\n");  // print = ���� ����, println = ���� ��
	                              // ""+"" 2���� �׸� �ٿ��� ���  
	
	int A=10,B=20;                // 10,20�� ���ͷ� ��� (���� �� �ִ� ��.)
	
	System.out.println("���ϱ� ��="+(A+B)); // ��ȣ ���� ���� ����Ͽ� ���
	System.out.println("���� ��="+A+-B);   // A�� -B ���� ���� ���
	System.out.println(A/B);            //int�� ������ �̹Ƿ�, A�� B���� ������ 0 ��� 
    System.out.println(A%B);            //A�� B ���� ������, A�� ���(��=0,������ ��=A)
    System.out.println(A*B);
    
    A+=B;
    System.out.println(A);         //A = A+B
    final int C = 10;              //final = �ɺ������ (������ �ʴ� ��.)
                                   // C+=B ���� C���� ��ȭ��Ű�� ������ �Ұ���.
    A/=B;
    System.out.println(A);         // 30������20 �� ���� 1 = A ������ �ʱ�ȭ
    A%=B;
    System.out.println(A);         // A=1,B=20�̹Ƿ�, A �� 1 ��°� ���ÿ� �ʱ�ȭ
   
    System.out.println(A<=B);      // A�� B ���� �۰ų� ������? = TRUE(A=1,B=20)
    System.out.println(A==B);      // A�� B�� ������? = FALSE
    System.out.println(A!=B);      // A�� B�� �ٸ���? = TRUE
    System.out.println(A==1&&B>=A);// A�� 1�� ����, B�� A ���� ũ�ų� ������ ��� ���ΰ�?(AND ������)
    System.out.println(A==1||B<=A);// �� ���� ���� �ϳ��� ���ΰ�? (OR ������)
    System.out.println(!(A==B));   // A��B�� ���� �����Ƿ�, TRUE (NOT������ - ���̸� ����,�����̸� ��)
    System.out.println(A++);       // �ش� ���� ������ ������, ���� ���κ��� ������. ���� A=1
    System.out.println(++A);       // �ش� ���� �������� ������. A=2 ���� A=3���� �ʱ�ȭ
    
  		}
}
