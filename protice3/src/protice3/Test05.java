package protice3;

class Par{
	private int a = 10;
	private int b = 20;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
}
class Son extends Par{
	Par p = new Par();
	private int z =40;
	
	
	public void Son1() {
	
	
	}
}
public class Test05 {

	public static void main(String[] args) {
  Son s = new Son();
   s.Son1();
	}

}
