package protice;

import java.util.ArrayList;
import java.util.Scanner;

public class protice_test7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> phone = new ArrayList<>();
		int num = 0 , result =0;
		String inputname = null, inputPhone = null;
		while (true) {
			System.out.println("1.연락처 등록");
			System.out.println("2.연락처 보기");
			System.out.println("3.연락처 삭제");
			
			System.out.println("4.종료");
			num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.println("연락처 등록하기");
				inputname = sc.next();
				if ((name.indexOf(inputname) == -1)) {
					inputPhone = sc.next();
					name.add(inputname);
					phone.add(inputPhone);
					System.out.println("연락처 등록");
				} else {
					System.out.println("등록 실패");
				}

				break;
			case 2:
					System.out.println("연락처 보기"); 
					inputname = sc.next();
					
					if(name.contains(inputname) ) {
						int dex = name.indexOf(inputname);
						System.out.println(name.get(dex));
						System.out.println(phone.get(dex));
						
					}
					else {
						System.out.println("검색못햇습니다");
					}
				break;
			case 3 :
					System.out.println("연락처 삭제");
					inputname =sc .next();
					if(name.contains(inputname)) {
						int dex = name.indexOf(inputname);
						name.remove(dex);
						phone.remove(dex);
					}
					break;
			case 4 :
					return; 
			}
			
		}
	}
}
