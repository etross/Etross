package b3_ArrayList;

import java.util.ArrayList;


class arraylist{
	void info(){
		System.out.print("arr: ");
		
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i= 0; i<11; i++) {
			arr.add(i);
		}
		for(int i : arr) {
			if(i <= 9) {
				System.out.print(i+",");
			}
			else {
				System.out.print(i);
			}
		}
		System.out.print("\n");
		System.out.println("arr�� 5��° ��: "+arr.get(5));
		System.out.println("arr�� size: "+arr.size());
		System.out.println("< arr�� Index " + arr.remove(5) + " ���� >");
		System.out.println("arr�� ������ intdex 5�� �ִ��� ����: "+arr.contains(5));
		System.out.println("4�� ������ Index ��ȯ(������ -1): "+arr.indexOf(4));
		
		System.out.println("< arr�� 10�ڿ� 11�� �߰� >");
		arr.add(10,11);
		System.out.println("arr�� �߰��� 11�� �ִ��� ����: "+arr.contains(11));
		arr.set(0,7);
		System.out.println("< arr�� 0��° ��ġ�� 7�� ���� >");
		System.out.println("arr�� 0��° ��: "+arr.get(0));
	}
}
public class b3_ArrayList {
	public static void main(String[]args) {
		arraylist in =new arraylist();
		in.info();
	}
}