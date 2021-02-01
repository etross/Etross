package a7_�������̵�2;

class national{
	void na_print(){
		System.out.println("�ڿ���");
	}                                                        // class A {}
}                                                            // class B extends A{}
class integer extends national{                              // A a = new B(); >> ��� �����ϴ�. ������  object ����.
	void in_print(){                                         // B�� A�� ����ϸ鼭, A�� B�� object�� ���� ��ӹ޴� �����̱⶧����, ������ ���� �ʴ´�.
		System.out.println("����");                           // A ���� B�� object ����ϱ� ���ؼ�.
	}
}
class rational extends integer{                              // public Ŭ������ �ϳ��� ��Ű���� �ϳ��� ���� 
	void ra_print(){
		System.out.println("������");
	}
}

public class a7_�������̵�2 {
	public static void main(String[]args) {                  // static = static ������ ����  = ���α׷��� ����ɶ����� �������� �ʰ� ���� �ִ� ������ = �������� 
		national na = new national();                        // national na = heap ������ ����
		integer in = new integer();                          // heap���� = reperence type�� (��������)������ ���� , ��ü (�ν��Ͻ�),��ü���� ,object Ÿ��(String ���)
		rational ra = new rational();                        // ex) national na = new national()
		                                                     // stack ���� = ����Ÿ��(int,long,char���)�� �⺻ �ڷ����� �ش��ϴ� �������� ex) int k 
		System.out.println("==�߸��� ����==");                   // stack ������ ���������� �żҵ尡 ȣ��ɶ� �����ǰ� ����Ǹ� �������.
		instanceofcheck(na);                                 // heap������ ���������� �ּ��������� ����Ǹ�(����������), stack�� �������� ��ȯ�ϴ� ������ �Ѵ�.  
		instanceofcheck(in);                                 // heap�� ����� �����Ͱ� �� �̻� ���ʿ��ϴٰ� JVM(�ڹ� ����ӽ�)�� �Ǵ��ϸ�, ������ �÷���(GC,���������) 
		instanceofcheck(ra);                                 // �� ���� �����ȴ�.
		
		System.out.println("==�ùٸ� ����==");                   // ��� ������� �� stack ������ ����, �����尡 ���������� �ϳ��� heap������ ���´�.
		instanceofcheck2(na);
		instanceofcheck2(in);
		instanceofcheck2(ra);
}
	public static void instanceofcheck(national nn) {         // A instanceof B= B�� A�� ����ϸ� TRUE �ƴϸ�, FAULSE
			if(nn instanceof integer) {
				((integer)nn).in_print();                     // ((integer)nn) = nn�� integer Ŭ������ ����ȯ
			}                                                 //   >>integer�� nnŬ������ ����Ͽ�, �θ�Ŭ����(nn)��
			else if (nn instanceof rational) {                //     �ڽ�Ŭ����(integer)�� ����ȯ�� �����ϴ�.
				((rational)nn).ra_print();                 
			}
			else                                              // if���� ������ ���� ������ �߻��Ѵ�.
				nn.na_print();                                // rational�� integer�� ����ϹǷ�
	}                                                         // rational�� "if(nn instanceof integer)"��
	                                                          // ���ǹ��� �����ϰԵǾ�, integer���� ��ȯ�ϰ� �ȴ�. = rationalŬ������ integer Ŭ������ �����Ѵ�.
	public static void instanceofcheck2(national nn) {        // instanceofcheck2 �żҵ� ���ڷ� national Ŭ������ ��ü (��������)nn�� �����ϰڴٴ� �ǹ�.
		if(nn instanceof rational) {
			((rational)nn).ra_print();                        // ���� ������ �ڽ�Ŭ������ rational�� ���� ���� (����)��ġ ��Ŵ���ν�,
		}                                                     // national�� integer Ŭ������ ���Ǹ����� �ߺ��� ����.
		else if (nn instanceof integer) {
			((integer)nn).in_print();
		}
		else 
			nn.na_print();
	}
}

	


