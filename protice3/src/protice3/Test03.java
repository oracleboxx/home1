package protice3;
class Method{

	public  Method(int a , int b){
	System.out.println(a + b);
		
	}
	public  Method(int a , int b , int c){
	System.out.println(a+b+c);
	}
	
}
public class Test03 {

	public static void main(String[] args) {
		Method  mt = new Method(1,2);
		Method  mt2 = new Method(1,2,3);
		
		
		
	}

}
