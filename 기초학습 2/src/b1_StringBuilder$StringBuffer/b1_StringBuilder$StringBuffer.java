package b1_StringBuilder$StringBuffer;

public class b1_StringBuilder$StringBuffer {
	public static void main(String[]args) {
		StringBuilder sb = new StringBuilder();

		sb.append("Hi, ");                                  // < append > 문자열을 순서대로 입력및 추가 시킨다.
		sb.append("WELCOME TO ");
		sb.append("JAVA WORLD!");
		
		System.out.println(sb);                             // append로 추가된 문자열의 전체 출력
		System.out.println(sb.capacity());                  // < capacity > 문자열을 담는 변수의 용량 표시    
		System.out.println(sb.charAt(4));                   // < charAt > 문자열의 "4"번째를 출력한다.
		System.out.println(sb.delete(11,14));               // < delete > 12~14번쨰 위치한 문자를 삭제
		System.out.println(sb.insert(12,"TO "));            // < insert > 13번째 위치한 곳에 문자 삽입
		System.out.println(sb.length());                    // < length > 문자열 전체 길이를 출력
		System.out.println(sb.replace(0,2,"HELLOW"));       // < replace > 0~1번째 위치한 문자를 HELLOW로 대체
		System.out.println(sb.substring(8,15));             // < substring > 9~15번에 위치한 문자를 출력
		
		StringBuffer str = new StringBuffer();              // StringBuilder와 StringBuffer의 차이는
		str.append("StringBuffer");                         // StringBuffer는 동기화가 된다는 것이다.
		System.out.println(str);                    
		
		String str2= str.toString();                        // < ToString > 객체화 없이 출력가능
		System.out.println(str2);
		
		
	}
}
