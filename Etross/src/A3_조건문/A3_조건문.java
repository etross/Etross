package A3_���ǹ�;

public class A3_���ǹ� {
	public static void main(String[]args) {
		int score= 88;
		char grade;
		
		if(score < 60) {                                                 // if���� �켱������ if , else if, else �����̴�.
			grade ='F';
			System.out.println(grade + "���� �Դϴ�.");
		}
		else if (score <70) {
			grade ='D';
			System.out.println(grade + "���� �Դϴ�.");
		}
		else if (score <80) {
			grade ='C';
			System.out.println(grade + "���� �Դϴ�.");
		}
		else if (score <90) {
			grade ='B';
			System.out.println(grade + "���� �Դϴ�.");
		}
		else {                                                            // else=  if �Ǵ� else if�� ������ ��� ��쿡 �����Ѵ�.
			grade ='A';
			System.out.println(grade + "���� �Դϴ�.");
		}
		
		switch(grade) {
		case'A':  System.out.println("�ֿ�� �л��Դϴ�.");
			break;                                                        // break�� ����Ͽ� �ش� case�� �������´�.
		case'B':  System.out.println("��� �л��Դϴ�.");
			break;
		case'C':  System.out.println("�л��Դϴ�.");
			break;
		case'D':  System.out.println("���� ������ �л��Դϴ�.");
			break;
		case'F':  System.out.println("���� ������ �л��Դϴ�.");
			break;
		default:  System.out.println("�߸� �Է��Ͽ����ϴ�.");                   // if ������ else �� ���� ����. case �̿��� ��쿡�� default�� ����Ѵ�.
			break;
		}
		
	}

}
