package A4_���ǹ�;

class times{
	int num1;
	int num2;
	int num3;
	
	times(){
		for(num1=2;num1<10;num1++){                                            // for(�ʱ�ȭ ��; ���ǹ�; ���� & ���� ����)
			
			num2=1;                                                            // do~while�������� �ʱ�ȭ���� �Է¶��� �����Ƿ�, ó�� �������� �ٽ� �����Ϸ���
			do {                                                               // �������忡 num2 = 1 ó��, ���� ����� �Ѵ�.
				num3= num1*num2;                                               // do~while���� ù ������ ���ǰ� ������� ������ ����ȴ�.
				if(num3<10) {                            
					System.out.printf(num1+"x"+num2+"="+num3+"  ");            // �ܼ�â�� ĭ�� �°� �����ϱ����� if���� ����Ͽ�, �ڸ����� ����
					num2++;                                                       
				}
				else if(num3>=10) {
					System.out.printf(num1+"x"+num2+"="+num3+" ");             
					num2++;         
				}
			}while(num2<10);
			System.out.printf("\n");                                       		// 2��,3�� ������ �ٳѱ�� ����.
		}
	}
	void wall() { System.out.println("===================================================================="); }
}

class even {
	even(){
		int total=0;
		for(int num= 1; ; num++)
		{
			if(num >= 10)                                                       // < break >        
				break;                                                          // break�� �����ϴ� �߰�ȣ���� ������ �������� �ʰ� ������.
			if(num % 2 == 0) {
				System.out.printf(num+"= ¦�� ");
				
			}
			else if (num % 2 != 0){
				System.out.printf(num+"= Ȧ�� ");                                // < continue >
				continue;                                 					    // Ȧ���� ���, ���� ���� total++�� �������� �ʰ� num++�� ����. 
			}
			total++;	
		}
		System.out.println("\n"+"¦���� ����= " + total);
	}
}

public class A4_���ǹ� {
	public static void main(String[]args) {
		new times().wall();
		new even();
	}
}
