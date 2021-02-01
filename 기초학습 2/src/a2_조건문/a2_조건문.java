package a2_조건문;

import java.util.Scanner;                     // 키보드 입력하기위한 호출문장.

public class a2_조건문 { public static void main(String[]args) {
	String name;                              // String = 문장 초기화
	byte age;
	double height;
	int score;
	String intro;
	String buffer;                            // 위 라인에 문장이 들어갈 경우 개행문장이 입력되어 자기소개
	                                          // 입력이 불가하므로, 임의의 입력문장을 하나 더 추가하기 위함.
	System.out.println("자기소개서 작성"+"\n");
	
	Scanner sc =new Scanner(System.in);
	System.out.println("이름을 입력하세요.");                // next(); 는 한단어만 입력가능
	name = sc.next();                  
	System.out.println("나이를 입력하세요.");
	age = sc.nextByte();
	System.out.println("키를 입력하세요.");
	height = sc.nextDouble();
	System.out.println("점수를 입력하세요.");
	score = sc.nextInt();
	System.out.println("자기소개를 입력하세요.");
	buffer =sc.nextLine();
	intro = sc.nextLine();
//////////////////////////////////////////////////////////////////////////////	
	System.out.println("이름:"+name+"\n나이:"+age+"\n키:"+height+"\n자기소개:"+intro);
	
	if (1<age && 10>age)                     // if문 최우선 출력
	System.out.println("유아 입니다.");
	else if (10<=age && 20>age)              // else if 차선 출력
	System.out.println("10대 입니다.");
	else if(20 <=age && 30>age)
	System.out.println("20대 입니다.");
	else                                     // else 문에는 조건이 있으면 안된다. 
	System.out.println("어른 입니다.");
//////////////////////////////////////////////////////////////////////////////
	int k;
	k= (int)height;                          // Double형을 int 형으로 변환.
	int m= k/10;                             // height를 10의자리 까지 변환.
	
	switch(m) {                              // switch문은 조건문,실수 사용 불가
	case 15:                                 // string과 char를 활용한 문자도 가능하다.
		   System.out.println("작은 키 입니다.");
		   break;
	case 16:
			System.out.println("조금 작은 키 입니다.");
			break;
	case 17:
			System.out.println("보통 키 입니다.");	
			break;
	case 18:
		System.out.println("조금 큰 키 입니다.");
		    break;
	case 19:
		System.out.println("큰 키 입니다.");
		    break;
	}
//////////////////////////////////////////////////////////////////////////////	
	int i;
	for(i=0;i<=5;i++)
	{
		if(i<5)
			continue;                              // if조건에 한에서 다음 라인을 무시함.
		System.out.println("총 학생수는"+i+"명 입니다.");
	}
//////////////////////////////////////////////////////////////////////////////
	int [] stu= {15,22,31,45};                      // int형 배열 선언
	int r=0;
	int aver=0;
                            // 평균점수의 소수점 출력
	while(r<4) {
		aver += stu[r];
		r++;
	}

	float aver2= (score+aver)/(i-1f);            // 소수점 출력을 위해 변수에 1f로 입력 (또는 1f를 곱한다)
	                                             // for문에서 출력된 i값은 5지만, 다음 라인부턴 6이 출력됨
	String aver3=String.format("%.3f", aver2);   // 소수점자리수를 정하는 공식
	System.out.println("학생들의 평균 점수는"+aver3);   

		}
}
