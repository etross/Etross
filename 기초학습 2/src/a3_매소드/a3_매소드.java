package a3_�żҵ�;

public class a3_�żҵ� {
	public static void main (String[]args) {           // public= �������� ������(���� ����) 
	                                                   // static= ��������, void= �Ű�����, main= �żҵ�  
		one(1);                                        // �Ű����� ����.
		
		int num2 = two(1);                             // �Ű����� ����.
		System.out.println("two�� ��:"+num2);           
		
		int num3= three();                             // �Ű����� ����.
		System.out.println("three�� ��:"+num3);
		
		four();                                        // �Ű����� ����.
		
		int num5= 5;                                   // main �żҵ�ȿ��� �ߺ����� ��.
		System.out.println("main �żҵ��� ��:"+num5);
		five();
		
		System.out.println("6!�� ��: "+six(6));
		
		System.out.println("7�� 4���� ��:"+seven(7,4));
		
		
	}
		public static void one(int a) {                // ��ȯ���� �����Ƿ� void�� ���. a�� ������ ����.
			System.out.println("one�� ��:"+ a);          // �Ű������� �ְ�, ��ȯ���� ����.
		}
		public static int two(int b) {                 // ��ȯ���� int���̹Ƿ�, �Ű������� int�� ���.
			return b+b;                                // �Ű������� �ְ�, ��ȯ���� �ִ�.
		}
		public static int three() {                    // �Ű������� �����Ƿ�, �������ڰ� ����.
			return 3;                                  // �Ű������� ����, ��ȯ���� �ִ�.
		}
		public static void four() {                    // �Ű������� ����, ��ȯ���� ����.
			System.out.println("four�� ��:4");
		}
		public static void five() {
			int num5 = 6;                              // five �żҵ� �ȿ��� �ߺ������ ���ÿ� �ٸ��� ����.
			System.out.println("five �żҵ��� ��:"+num5);  // num5�� ���� ���� �żҵ� ���� �ȿ����� ��ȿ��.
		}
		public static int six(int d) {                 // �Ű������� �����Ƿ�,int d�� ���� ����.
			if(d==1)
				return 1;                              // ���� six(1)�̸�, 1��ȯ�ϰ� ����.
			else
				return d*six(d-1);	                   // 6*six(5)*six(4)*six(3)*six(2)*six(1)
		}                                              // 6���丮���� ����ϴ� ����Լ��̴�.
		public static int seven(int e,int f) {         // �Ű������� �������� ������ �� �ִ�.
			if(f==0)                                
				return 1;                              
			else 
				return e*seven(e,f-1);                 //����Լ� ���Ŀ��� f�� for��ó��, ���ǽ����� ���.
		}
}
