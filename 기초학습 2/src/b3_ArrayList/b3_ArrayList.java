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
		System.out.println("arr의 5번째 값: "+arr.get(5));
		System.out.println("arr의 size: "+arr.size());
		System.out.println("< arr의 Index " + arr.remove(5) + " 제거 >");
		System.out.println("arr의 삭제된 intdex 5가 있는지 여부: "+arr.contains(5));
		System.out.println("4를 포함한 Index 반환(없으면 -1): "+arr.indexOf(4));
		
		System.out.println("< arr의 10뒤에 11을 추가 >");
		arr.add(10,11);
		System.out.println("arr에 추가된 11이 있는지 여부: "+arr.contains(11));
		arr.set(0,7);
		System.out.println("< arr의 0번째 위치에 7로 변경 >");
		System.out.println("arr의 0번째 값: "+arr.get(0));
	}
}
public class b3_ArrayList {
	public static void main(String[]args) {
		arraylist in =new arraylist();
		in.info();
	}
}