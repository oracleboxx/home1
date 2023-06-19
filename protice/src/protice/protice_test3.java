package protice;
import java.util.Scanner;
public class protice_test3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int coca =800;
	int change =0;
	int pepsi =500;
	int zero =1000;
	System.out.println("금액 : ");
	int money = sc.nextInt();
	System.out.println("메뉴를 골라주세요 ");
	System.out.println("============== ");
	System.out.println("1.코카콜라(800) 2.펩시콜라(500) 3.제로콜라(1000)");
	int menu = sc.nextInt();
	
	if(menu==1) {
	change =	money - coca;
	}
	else if(menu==2) {
		change=	money - pepsi;
	}
	else if(menu==3) {
		change=	money - zero;
	}
	System.out.println("잔돈 값: "+change);
}
}
