package 연습장;

public class 연습장 {
	public static void main(String[]args) {
		String star = "* ";
		String star2 = "* ";
		String n ="  ";
		int count=1;
		int count2=3;
		
		for(int num1=1;num1<8;num1++) {	
			if (num1 < 5) {
				for(int num2=4-count; num2>0; num2--) {
					System.out.printf(n);
				}
				System.out.println(star);
				star += "* * ";
				count += 1;
			}
			else if(num1>=5) {
				
				for(int num3= count2; num3>0 && num3 <= 3; num3++) {
					System.out.printf(n);
				}
				for(int num4= count2;num4>0;num4--) {
					System.out.println(star2);
				}
				count2 -= 1;
			}
		}		
	}

}
