package protice2;


class MethodTest03{
	void prn(int a, int b, int c) {
		
		System.out.println(a+":"+b+":"+c);
	}
void prn(int a, int b) {
		
		System.out.println(a+":"+b);
}
void prn(int a) {
	
	System.out.println(a);

}
public class OverRoding {
	

}
	public static void main(String[] args) {
			
		MethodTest03 mt = new  MethodTest03();
		mt.prn(1, 2, 3);
		mt.prn(1, 2);
		mt.prn(1);

}

}
