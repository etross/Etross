package 연습장;

class Under {
	private int x;
	Under(int x1){
		x=x1;
	}
	void print_x(){
		System.out.println("가로:"+x);
	}
}
class Side {
	private int y;
	Side(int y1){
		y=y1;
	}
	void print_y(){
		System.out.println("세로:"+y);
	}
}
class Hight {
	private int z;
	Hight(int z1){
		z=z1;
	}
	void print_z(){
		System.out.println("높이:"+z);
	}
}
class Area {
	private int k;
	Area(int k1,int k2,int k3){
		k=k1*k2*k3;
	}
	void print_k(){
		System.out.println("높이:"+k);
	}
}
class Interview {
	private Under x2;
	private Side y2;
	private Hight z2;
	private Area k2;
	Interview(int a,int b,int c){
		x2= new Under(a);
		y2= new Side(b);
		z2= new Hight(c);
		k2= new Area(a,b,c);
	}
	void in_print() {
		x2.print_x();
		y2.print_y();
		z2.print_z();
		k2.print_k();
	}
}
class Math{
	void math(Interview view){
		view.in_print();
	}
}
public class 연습장 {
	public static void main(String[]args) {
		Math ma= new Math();
		ma.math(new Interview(3,4,5));
	}
}
