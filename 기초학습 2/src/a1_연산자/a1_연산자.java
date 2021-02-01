package a1_연산자;

public class a1_연산자 {	public static void main (String args[]) {
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
	System.out.println(_long);    // 끝에 ㅣ표시 안하면, int로 인식 , 8 byte
	System.out.println(_float);   // 끝에 f표시 안하면, double로 인식
	System.out.println(_char);    // 아스키코드는 ''없이,문자 그대로 출력은 ''포함
	System.out.println(_boolean); // 참, 거짓
	System.out.print("\n"+"\n");  // print = 개행 없음, println = 개행 함
	                              // ""+"" 2개의 항목 붙여서 출력  
	
	int A=10,B=20;                // 10,20은 리터럴 상수 (변할 수 있는 값.)
	
	System.out.println("더하기 값="+(A+B)); // 괄호 안을 먼저 계산하여 출력
	System.out.println("빼기 값="+A+-B);   // A와 -B 값이 각각 출력
	System.out.println(A/B);            //int는 정수형 이므로, A가 B보다 작으면 0 출력 
    System.out.println(A%B);            //A가 B 보다 작으면, A값 출력(몫=0,나머지 값=A)
    System.out.println(A*B);
    
    A+=B;
    System.out.println(A);         //A = A+B
    final int C = 10;              //final = 심볼릭상수 (변하지 않는 값.)
                                   // C+=B 같은 C값을 변화시키는 연산은 불가능.
    A/=B;
    System.out.println(A);         // 30나누기20 의 몫은 1 = A 값으로 초기화
    A%=B;
    System.out.println(A);         // A=1,B=20이므로, A 값 1 출력과 동시에 초기화
   
    System.out.println(A<=B);      // A가 B 보다 작거나 같은가? = TRUE(A=1,B=20)
    System.out.println(A==B);      // A가 B와 같은가? = FALSE
    System.out.println(A!=B);      // A가 B와 다른가? = TRUE
    System.out.println(A==1&&B>=A);// A가 1과 같고, B가 A 보다 크거나 같음이 모두 참인가?(AND 연산자)
    System.out.println(A==1||B<=A);// 양 변의 값중 하나라도 참인가? (OR 연산자)
    System.out.println(!(A==B));   // A와B는 같지 않으므로, TRUE (NOT연산자 - 참이면 거짓,거짓이면 참)
    System.out.println(A++);       // 해당 라인 연산이 끝난후, 다음 라인부터 증감됨. 아직 A=1
    System.out.println(++A);       // 해당 라인 연산전에 증감됨. A=2 에서 A=3으로 초기화
    
  		}
}
