package 연습장;


public class 연습장 {
	public static void main(String[]args) {
		int arr[]= {7,3,5,6,1,2};
		
	
		for(int i=0; i < 6; i++) {
			if(i == 0) {
				System.out.print("원래상태 정렬 전:"+arr[i]);
			}
			else {
			System.out.print(arr[i]);
			}
		}
		for(int i= 0; i<5; i++) {
			for(int j= i+1; j<6 ;j++) {
				if(arr[i] < arr[j]) {
					int tem = arr[i];
					arr[i]= arr[j];
					arr[j]= tem;
				}
			}
		}
		for(int i=0; i<6; i++) {
			if(i==0) {
				System.out.print("\n" + "내림차순 정렬 후:" + arr[0]);
			}
			else {
				System.out.print(arr[i]);
			}
		}
		for(int i= 0; i<5; i++) {
			for(int j=i+1; j<6; j++) {
				if(arr[i]>arr[j]) {
					int tem= arr[i];
					arr[i]= arr[j];
					arr[j]= tem;
				}
			}
		}
		for(int i=0; i<6; i++) {
			if(i==0) {
				System.out.print("\n" + "오름차순 정렬 후:" + arr[0]);
			}
			else {
				System.out.print(arr[i]);
			}
		}
		
	}
}
