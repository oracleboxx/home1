package protice;

import java.util.Scanner;

public class protice_test6 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	int total =0, money=0;
	String putname1=null,putname = null;
		while(true) {
			System.out.println("1.계좌 개설");
			System.out.println("2.계좌 조회");
			System.out.println("3.계좌 입출금 오픈");
			System.out.println("4.종료");
			
			
			int num = sc.nextInt();
			
			switch(num) {
			case 1: 
					System.out.println("이름을 입력해주세요");
					putname =sc.next();
					
					System.out.println("이름을 저장했습니다");
					break;
			case 2: 
					System.out.println("등록된 계좌 이름:"+putname);
					break;
			case 3:
					System.out.println("1.입금");
					System.out.println("2.출금");
					System.out.println("3.종료");
					 num =sc.nextInt();
					if(num == 1) {
						System.out.println("입금할 금액");
						 money = sc.nextInt();
						System.out.println("입금할 금액:"+money);
					
					}
				
					else if(num == 2) {
						total =sc.nextInt();
						 money -= total; 
						System.out.println("출금할 금액:"+money);
					}
					
				
					else if(num == 3) {
						
						 return;
					 }
					
					
					break;
				
			case 4: 
					break;
			
			}
		}
	}
}
