package a5_import;                                 // import할 패키지


public class a5_import  {                          // import할 클래스  
	
	public static class Add{                       // 매소드에 인자를 주고받는경우 static을 추가해준다.
		int a1;                                 
		int b1;
		public Add(int a,int b){          
			a1=a;
			b1=b;
		}
		public int get() {                   
			return a1+b1;
		}

	}
	public static void main(String[]args) {
	}
}

