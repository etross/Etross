package b4_예외처리;

public class b4_예외처리 {
	public static void main(String[]args) {
		try {                                                         // try= 실행문
			int arr[] = {1,2,3};
			System.out.println(arr[0]);
			System.out.println(arr[4]);
		}
		catch(ArrayIndexOutOfBoundsException e){                      // catch= 예외처리문
			System.out.println("배열의 범위를 벗어남.");
			e.printStackTrace();                                      // 오류문구를 출력함.
		}
		try {
			int arr[] = new int[-7];
		}
		catch(NegativeArraySizeException e){
			System.out.println("배열의 크기가 음수임.");
			e.printStackTrace();
		}
		try {
			int num1 = 2;
			int num2 = 0;
			System.out.println((num1/num2));
		}
		catch(ArithmeticException e) {
			System.out.println("나눗셈의 제수가 0(Null)임.");
			e.printStackTrace();
		}
		try {
			StringBuilder a = null;
			a.delete(2, 4);
		}
		catch(NullPointerException e){
			System.out.println("참조변수가 0(Null)임.");
			e.printStackTrace();
		}
		finally {                                                     // finally= 예외처리가 되든 안되든 무조건 실행.
			System.out.println("=== 프로그램이 종료되었습니다. ===");
		}
	}

}
