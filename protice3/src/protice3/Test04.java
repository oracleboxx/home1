package protice3;

public class Test04 {
	public void printnum(int ... num2) {
		for(int numtotal : num2) {
			System.out.println(numtotal);
		}
	}
	public static void main(String[] args) {
		Test04 t = new Test04();
		t.printnum(12);
		t.printnum(23);
		t.printnum(60);
		
	}

}
