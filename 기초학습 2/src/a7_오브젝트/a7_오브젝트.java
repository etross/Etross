package a7_오브젝트;

class info{                                                // object란, 모든 클래스의 부모클래스이다.
	int a;                                                 // < object 매소드의 종류 >
	info(int a) {                                          // 1.clone(), 2.equals(Object obj), 3.finalize(), 4.getClass(), 5.hashCode()
		this.a =a;                                         // 6.notify(), 7.notifyAll(), 8.toString(), 9.wait(), 10.wait(long timeout)
	                                                       // 11.wait(long timeout, int nanos)
	}
	public String toString() {return "값:"+ a;}           
}

public class a7_오브젝트 {
	public static void main(String[]args) {
	info aa = new info(1);
	System.out.println(aa);                                // toString()매소드를 오버라이딩하는 형식으로, 매소드를 호출하지 않고 출력가능. 
	System.out.println(aa.toString());                     // info클래스를 호출하면 자동으로 실행(object 매소드의 특징)
	}                                                      // 모든 클래스는 한개 이상의 매소드를 가지고 있고, 메인 메소드에서 타클래스의 매소드를 호풀 할때 매소드를 항상  
}                                                          // 사용하므로, object매소드는 object를 포함한 클래스를 호출하면 항상 출력된다.
