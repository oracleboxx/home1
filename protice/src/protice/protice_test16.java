package protice;

import java.util.Scanner;

public class protice_test16 {

	int num ,num1,total;
	
	public void input() {
		Scanner input = new Scanner(System.in);
		this.num = input.nextInt();
		this.num1 = input.nextInt();
	}
	public void plus() {
		int num = this.num;
		int num1 = this.num1;
		this.total = num + num1;
		int total = this.total;
		System.out.println(total);
	}
	public static void main(String[] args) {
		protice_test16 pro = new protice_test16();
		pro.input();
		pro.plus();
	}

}
