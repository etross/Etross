package a9_String;

public class a9_String {

	public static void main(String[]args) {
		String str= "abcdefghijklmnopqrstuvxwyz";
		String str2= "123456789";
		String str3= "안녕";
		String str4= "하세요!";
		
		System.out.println(str.charAt(1));                  // < charAt >str의 1번쨰 문자를 가져온다.
		
		System.out.println(str.compareTo(str2));            // < compareTo > str과 str2가 같으면 int형 0을 반환, str이 크면 int형 양수를 반환, 
		                                                    //  str이 str2보다 작으면 int형 음수를반환 
		System.out.println(str3.concat(str4));              // < concat >str3뒤에 str4를 더해준다.
		
		System.out.println(str3.equals(str4));              // < equals >str3과 str4가 같으면 true를 반환, 다르면 false를 반환.
		
		System.out.println(str3.indexOf('녕'));              // < indexOf >str3의 문자열중 '녕'이 몇 번쨰에 위치한지 알려준다.
		
		System.out.println(str3.isEmpty());                 // < isEmpty >str3의 문자열이 비어있으면,true를 반환 내용이 있으면 false를 반환.
		
		System.out.println(str3.length());                  // < length >str3의 문자길이 값을 반환.
		
		System.out.println(str4.replace('세','시' ));         // < replace >str4의 문자중 모든'세'를 전부'시'로 바꾸어준다.
		
		String str5= str4.replaceAll("세요[!]", "시요?");      // < replaceALL >str4의 1가지 이상 문자열인 모든 "세요!"를 전부 "시요?"로 바꾸어서, str5에 저장한다.
		System.out.println(str5);                            
		
		String str6= "010-0000-0000";
		String[] str7= str6.split("-");                      // < split > str6의 문자열을 "-"단위로 끊어서, str7에 저장한다.
		System.out.println("str6:"+str6);                    // 이때, 0번에는 "010" 1번에는 "0000" 2번에는 "0000"이런 식으로 저장된다.
		
		for(String str8: str7) {                             // < foreach > 생성된 foreach 변수인, String str8에 str7값을 순차적으로 저장한다. 
		System.out.println("str7 & 8:"+str8);                    // 순차적으로 저장된 str7값을 순차적으로 출력해준다.(foreach변수 str8을 출력하므로)
		}         
		
		String str9= "가나다라마바사";
		String str10= str9.substring(1,4);                   // < substring > str9에 저장된 문자열에서 1번부터 3번까지 골라서 저장한다.
		System.out.println(str10);            
		
		String str11= "   aaa   ";
		System.out.println(str11);
		String str12= str11.trim();                          // <trim> str11의 문자열의 앞뒤 공백을 모두 제거하여, str12에 저장한다.
		System.out.println(str12);
		
	}
}
