package b1_StringBuilder$StringBuffer;

public class b1_StringBuilder$StringBuffer {
	public static void main(String[]args) {
		StringBuilder sb = new StringBuilder();

		sb.append("Hi, ");                                  // < append > ���ڿ��� ������� �Է¹� �߰� ��Ų��.
		sb.append("WELCOME TO ");
		sb.append("JAVA WORLD!");
		
		System.out.println(sb);                             // append�� �߰��� ���ڿ��� ��ü ���
		System.out.println(sb.capacity());                  // < capacity > ���ڿ��� ��� ������ �뷮 ǥ��    
		System.out.println(sb.charAt(4));                   // < charAt > ���ڿ��� "4"��°�� ����Ѵ�.
		System.out.println(sb.delete(11,14));               // < delete > 12~14���� ��ġ�� ���ڸ� ����
		System.out.println(sb.insert(12,"TO "));            // < insert > 13��° ��ġ�� ���� ���� ����
		System.out.println(sb.length());                    // < length > ���ڿ� ��ü ���̸� ���
		System.out.println(sb.replace(0,2,"HELLOW"));       // < replace > 0~1��° ��ġ�� ���ڸ� HELLOW�� ��ü
		System.out.println(sb.substring(8,15));             // < substring > 9~15���� ��ġ�� ���ڸ� ���
		
		StringBuffer str = new StringBuffer();              // StringBuilder�� StringBuffer�� ���̴�
		str.append("StringBuffer");                         // StringBuffer�� ����ȭ�� �ȴٴ� ���̴�.
		System.out.println(str);                    
		
		String str2= str.toString();                        // < ToString > ��üȭ ���� ��°���
		System.out.println(str2);
		
		
	}
}
