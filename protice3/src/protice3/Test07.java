package protice3;

class Parent{
	public void prn() {
		System.out.println("부모 클래스");
	}
}
class Child extends Parent{
	private  int x ;
	public void prn() {
		System.out.println("자식 클래스");
	}
	public void prn(int x) {
		this.x =x;
	}
	public int getX() {
		return x;
	}
}
public class Test07 {

	public static void main(String[] args) {
		Child ch =new Child();
		ch.prn(10);
		System.out.println(ch.getX());
	}

}
