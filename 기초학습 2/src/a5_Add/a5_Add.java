package a5_Add;                          // import할 패키지

public class a5_Add {                    // import할 클래스     (public 필수)
	int a1;                           // Add클래스전체 포함되는 변수
	int b1;
	public a5_Add(int a,int b){          // import할 클래스와 매소드명이 반드시 동일할것 (public 필수)
		a1=a;
		b1=b;
	}
	public int get() {                   
		return a1+b1;
	}
	
}

