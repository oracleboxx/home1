package protice2;



public class overiding {
	int age = 10;
	public void over( ) {
		this.age=age +10;
		System.out.println(age);
	}
	public void over2() {
	      this.age = age + 10;
	       System.out.println(age);
	}
	public static void main(String[] args) {
		overiding ov = new overiding();
		ov.over();
		ov.over2();
		
	}

}
