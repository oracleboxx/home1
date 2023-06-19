package protice;
import java.util.Scanner;
public class protice_test2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("숫자 입력 : ");
		int num2 = sc.nextInt();
		
		if(num>=65 && num<=122 ) {
			System.out.println("num은 정상범위 입니다");
		}
		else {
			System.out.println("정상범위를 넘어갔습니다");
		}
		if(num2>=65 && num2<=122 ) {
			System.out.println("num2은 정상범위 입니다");
		}
		else {
			System.out.println("정상범위를 넘어갔습니다");
		}
		System.out.println("결과 값: "+(char)num+(char)num2);
		}
	}


