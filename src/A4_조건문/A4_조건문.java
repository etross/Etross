package A4_조건문;

class times{
	int num1;
	int num2;
	int num3;
	
	times(){
		for(num1=2;num1<10;num1++){                                            // for(초기화 값; 조건문; 증감 & 감소 연산)
			
			num2=1;                                                            // do~while문에서는 초기화조건 입력란이 없으므로, 처음 조건으로 다시 시작하려면
			do {                                                               // 상위문장에 num2 = 1 처럼, 따로 적어야 한다.
				num3= num1*num2;                                               // do~while문의 첫 실행은 조건과 상관없이 무조건 실행된다.
				if(num3<10) {                            
					System.out.printf(num1+"x"+num2+"="+num3+"  ");            // 콘솔창에 칸에 맞게 정렬하기위해 if문을 사용하여, 자릿수를 맞춤
					num2++;                                                       
				}
				else if(num3>=10) {
					System.out.printf(num1+"x"+num2+"="+num3+" ");             
					num2++;         
				}
			}while(num2<10);
			System.out.printf("\n");                                       		// 2단,3단 단위로 줄넘기기 실행.
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
				break;                                                          // break를 포함하는 중괄호안의 내용을 실행하지 않고 나간다.
			if(num % 2 == 0) {
				System.out.printf(num+"= 짝수 ");
				
			}
			else if (num % 2 != 0){
				System.out.printf(num+"= 홀수 ");                                // < continue >
				continue;                                 					    // 홀수의 경우, 다음 문장 total++을 실행하지 않고 num++을 실행. 
			}
			total++;	
		}
		System.out.println("\n"+"짝수의 갯수= " + total);
	}
}

public class A4_조건문 {
	public static void main(String[]args) {
		new times().wall();
		new even();
	}
}
