package a2_���ǹ�;

import java.util.Scanner;                     // Ű���� �Է��ϱ����� ȣ�⹮��.

public class a2_���ǹ� { public static void main(String[]args) {
	String name;                              // String = ���� �ʱ�ȭ
	byte age;
	double height;
	int score;
	String intro;
	String buffer;                            // �� ���ο� ������ �� ��� ���๮���� �ԷµǾ� �ڱ�Ұ�
	                                          // �Է��� �Ұ��ϹǷ�, ������ �Է¹����� �ϳ� �� �߰��ϱ� ����.
	System.out.println("�ڱ�Ұ��� �ۼ�"+"\n");
	
	Scanner sc =new Scanner(System.in);
	System.out.println("�̸��� �Է��ϼ���.");                // next(); �� �Ѵܾ �Է°���
	name = sc.next();                  
	System.out.println("���̸� �Է��ϼ���.");
	age = sc.nextByte();
	System.out.println("Ű�� �Է��ϼ���.");
	height = sc.nextDouble();
	System.out.println("������ �Է��ϼ���.");
	score = sc.nextInt();
	System.out.println("�ڱ�Ұ��� �Է��ϼ���.");
	buffer =sc.nextLine();
	intro = sc.nextLine();
//////////////////////////////////////////////////////////////////////////////	
	System.out.println("�̸�:"+name+"\n����:"+age+"\nŰ:"+height+"\n�ڱ�Ұ�:"+intro);
	
	if (1<age && 10>age)                     // if�� �ֿ켱 ���
	System.out.println("���� �Դϴ�.");
	else if (10<=age && 20>age)              // else if ���� ���
	System.out.println("10�� �Դϴ�.");
	else if(20 <=age && 30>age)
	System.out.println("20�� �Դϴ�.");
	else                                     // else ������ ������ ������ �ȵȴ�. 
	System.out.println("� �Դϴ�.");
//////////////////////////////////////////////////////////////////////////////
	int k;
	k= (int)height;                          // Double���� int ������ ��ȯ.
	int m= k/10;                             // height�� 10���ڸ� ���� ��ȯ.
	
	switch(m) {                              // switch���� ���ǹ�,�Ǽ� ��� �Ұ�
	case 15:                                 // string�� char�� Ȱ���� ���ڵ� �����ϴ�.
		   System.out.println("���� Ű �Դϴ�.");
		   break;
	case 16:
			System.out.println("���� ���� Ű �Դϴ�.");
			break;
	case 17:
			System.out.println("���� Ű �Դϴ�.");	
			break;
	case 18:
		System.out.println("���� ū Ű �Դϴ�.");
		    break;
	case 19:
		System.out.println("ū Ű �Դϴ�.");
		    break;
	}
//////////////////////////////////////////////////////////////////////////////	
	int i;
	for(i=0;i<=5;i++)
	{
		if(i<5)
			continue;                              // if���ǿ� �ѿ��� ���� ������ ������.
		System.out.println("�� �л�����"+i+"�� �Դϴ�.");
	}
//////////////////////////////////////////////////////////////////////////////
	int [] stu= {15,22,31,45};                      // int�� �迭 ����
	int r=0;
	int aver=0;
                            // ��������� �Ҽ��� ���
	while(r<4) {
		aver += stu[r];
		r++;
	}

	float aver2= (score+aver)/(i-1f);            // �Ҽ��� ����� ���� ������ 1f�� �Է� (�Ǵ� 1f�� ���Ѵ�)
	                                             // for������ ��µ� i���� 5����, ���� ���κ��� 6�� ��µ�
	String aver3=String.format("%.3f", aver2);   // �Ҽ����ڸ����� ���ϴ� ����
	System.out.println("�л����� ��� ������"+aver3);   

		}
}
