package a7_������Ʈ;

class info{                                                // object��, ��� Ŭ������ �θ�Ŭ�����̴�.
	int a;                                                 // < object �żҵ��� ���� >
	info(int a) {                                          // 1.clone(), 2.equals(Object obj), 3.finalize(), 4.getClass(), 5.hashCode()
		this.a =a;                                         // 6.notify(), 7.notifyAll(), 8.toString(), 9.wait(), 10.wait(long timeout)
	                                                       // 11.wait(long timeout, int nanos)
	}
	public String toString() {return "��:"+ a;}           
}

public class a7_������Ʈ {
	public static void main(String[]args) {
	info aa = new info(1);
	System.out.println(aa);                                // toString()�żҵ带 �������̵��ϴ� ��������, �żҵ带 ȣ������ �ʰ� ��°���. 
	System.out.println(aa.toString());                     // infoŬ������ ȣ���ϸ� �ڵ����� ����(object �żҵ��� Ư¡)
	}                                                      // ��� Ŭ������ �Ѱ� �̻��� �żҵ带 ������ �ְ�, ���� �޼ҵ忡�� ŸŬ������ �żҵ带 ȣǮ �Ҷ� �żҵ带 �׻�  
}                                                          // ����ϹǷ�, object�żҵ�� object�� ������ Ŭ������ ȣ���ϸ� �׻� ��µȴ�.
