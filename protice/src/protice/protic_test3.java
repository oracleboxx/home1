package protice;
import java.util.Scanner;
public class protic_test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gift = 10000;
		float sale = (float)(gift*(0.9));
		System.out.println("선물세트 개수 입력: ");
		int count = sc.nextInt();
		if(count>10) {
			System.out.println("가격은"+count*sale+ "원 입니다");
		}
		else {
			System.out.println("가격은"+count*gift+"원 입니다");
		}
	}

}
