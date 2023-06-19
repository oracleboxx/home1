package protice3;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month = 0;
		month = scan.nextInt();
		
		if(month == 3 || month == 4 || month == 5   ) {
			System.out.println("봄 입니다");
		}
		else if (month == 6 || month == 7 || month == 8 ) {
			System.out.println("여름 입니다");
		}
		else if (month ==9 || month ==10 || month == 11 ) {
			System.out.println("가을 입니다");
		}
		else {
			System.out.println("겨울입니다");
		}
	}

}
