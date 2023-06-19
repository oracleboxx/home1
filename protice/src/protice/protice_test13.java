package protice;

import java.util.ArrayList;
import java.util.Scanner;

public class protice_test13 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num =0;
		String inputname = null , inputphone =null;
		ArrayList<String> name = new ArrayList<>();
		ArrayList<Integer> phone = new ArrayList<>();
		while(true) {
			System.out.println("1.연락처 등록");
			System.out.println("2.연락처 보기");
			System.out.println("3.연락처 삭제");
			System.out.println("4.모든 연락처 보기");
			
			num = sc.nextInt();
			switch(num) {
			case 1: 	System.out.println("연락처 등록");
					inputname = sc.next();
					inputphone =sc.next();
					if(!name.contains(name)) {
						name.add(inputname);
						name.add(inputphone);
						System.out.println("연락처 등록");
					}
					else {
						System.out.println("연락처 등록 실패");
					}
			
					break;
			case 2: System.out.println("연락처 보기");
					inputname = sc.next();
					if(name.contains(inputname)){
						int dex = name.indexOf(inputname);
						
						
						System.out.println(name.get(dex));
						System.out.println(phone.get(dex));
						
					}
					else {
						
					}
					break;
			case 3: break;
			case 4: break;
			
			}
		}
				
	}

}

