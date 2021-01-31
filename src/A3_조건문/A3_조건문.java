package A3_조건문;

public class A3_조건문 {
	public static void main(String[]args) {
		int score= 88;
		char grade;
		
		if(score < 60) {                                                 // if문의 우선순위는 if , else if, else 순서이다.
			grade ='F';
			System.out.println(grade + "학점 입니다.");
		}
		else if (score <70) {
			grade ='D';
			System.out.println(grade + "학점 입니다.");
		}
		else if (score <80) {
			grade ='C';
			System.out.println(grade + "학점 입니다.");
		}
		else if (score <90) {
			grade ='B';
			System.out.println(grade + "학점 입니다.");
		}
		else {                                                            // else=  if 또는 else if를 제외한 모든 경우에 실행한다.
			grade ='A';
			System.out.println(grade + "학점 입니다.");
		}
		
		switch(grade) {
		case'A':  System.out.println("최우수 학생입니다.");
			break;                                                        // break를 사용하여 해당 case를 빠져나온다.
		case'B':  System.out.println("우수 학생입니다.");
			break;
		case'C':  System.out.println("학생입니다.");
			break;
		case'D':  System.out.println("조금 부족한 학생입니다.");
			break;
		case'F':  System.out.println("많이 부족한 학생입니다.");
			break;
		default:  System.out.println("잘못 입력하였습니다.");                   // if 문에서 else 와 같은 역할. case 이외의 경우에는 default를 출력한다.
			break;
		}
		
	}

}
