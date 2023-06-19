package protice2;

public class overiding2 {
	public void sumfuns(int n1, int n2) {
		int sum = n1 +n2;
		System.out.println(sum);
	
	}
	public void sumfuns(String s1, String s2) {
		String sum = s1 + s2;
		System.out.println(sum);
	}
public static void main(String[] args) {

	overiding2 over = new overiding2();
	int n1 =20 , n2 =30;
	String s1 = "test", s2 = "안녕";
	over.sumfuns(n1, n2);
	over.sumfuns(s1, s2);

}
}
