package a9_String;

public class a9_String {

	public static void main(String[]args) {
		String str= "abcdefghijklmnopqrstuvxwyz";
		String str2= "123456789";
		String str3= "�ȳ�";
		String str4= "�ϼ���!";
		
		System.out.println(str.charAt(1));                  // < charAt >str�� 1���� ���ڸ� �����´�.
		
		System.out.println(str.compareTo(str2));            // < compareTo > str�� str2�� ������ int�� 0�� ��ȯ, str�� ũ�� int�� ����� ��ȯ, 
		                                                    //  str�� str2���� ������ int�� ��������ȯ 
		System.out.println(str3.concat(str4));              // < concat >str3�ڿ� str4�� �����ش�.
		
		System.out.println(str3.equals(str4));              // < equals >str3�� str4�� ������ true�� ��ȯ, �ٸ��� false�� ��ȯ.
		
		System.out.println(str3.indexOf('��'));              // < indexOf >str3�� ���ڿ��� '��'�� �� ������ ��ġ���� �˷��ش�.
		
		System.out.println(str3.isEmpty());                 // < isEmpty >str3�� ���ڿ��� ���������,true�� ��ȯ ������ ������ false�� ��ȯ.
		
		System.out.println(str3.length());                  // < length >str3�� ���ڱ��� ���� ��ȯ.
		
		System.out.println(str4.replace('��','��' ));         // < replace >str4�� ������ ���'��'�� ����'��'�� �ٲپ��ش�.
		
		String str5= str4.replaceAll("����[!]", "�ÿ�?");      // < replaceALL >str4�� 1���� �̻� ���ڿ��� ��� "����!"�� ���� "�ÿ�?"�� �ٲپ, str5�� �����Ѵ�.
		System.out.println(str5);                            
		
		String str6= "010-0000-0000";
		String[] str7= str6.split("-");                      // < split > str6�� ���ڿ��� "-"������ ���, str7�� �����Ѵ�.
		System.out.println("str6:"+str6);                    // �̶�, 0������ "010" 1������ "0000" 2������ "0000"�̷� ������ ����ȴ�.
		
		for(String str8: str7) {                             // < foreach > ������ foreach ������, String str8�� str7���� ���������� �����Ѵ�. 
		System.out.println("str7 & 8:"+str8);                    // ���������� ����� str7���� ���������� ������ش�.(foreach���� str8�� ����ϹǷ�)
		}         
		
		String str9= "�����ٶ󸶹ٻ�";
		String str10= str9.substring(1,4);                   // < substring > str9�� ����� ���ڿ����� 1������ 3������ ��� �����Ѵ�.
		System.out.println(str10);            
		
		String str11= "   aaa   ";
		System.out.println(str11);
		String str12= str11.trim();                          // <trim> str11�� ���ڿ��� �յ� ������ ��� �����Ͽ�, str12�� �����Ѵ�.
		System.out.println(str12);
		
	}
}
