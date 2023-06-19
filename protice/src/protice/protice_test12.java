package protice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class protice_test12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> menu =new HashMap<>();
		int num=0;
		String inputfood =null , inputprice = null;
		while(true) {
			System.out.println("1.메뉴 등록");
			System.out.println("2.메뉴별 가격 보기");
			System.out.println("3.종료");
			 num = sc.nextInt();
			
			switch(num) {
			case 1: 	System.out.println("메뉴 등록해주세요");
			 			 inputfood = sc.next();
			 			if(!menu.containsKey(inputfood)) {
			 				inputprice = sc.next();
			 				menu.put(inputfood, inputprice);
			 				System.out.println("등록했습니다");
			 			}
			 			else {
			 				System.out.println("등록이 안돼씁니다");
			 			}
			
					break;
			case 2: Set<String> key = menu.keySet();
					Iterator<String> k = key.iterator();
			   		while(k.hasNext()) {
			   			String it = k.next();
			   			System.out.println(inputfood+" : "+menu.get(it));
			   			
			   			
			   		}
			   		System.out.println("1.수정");
			   		System.out.println("2.삭제");
			   		System.out.println("3.종료");
			   		int num2 = sc.nextInt();
			   		if(num2 == 1) {
			   			System.out.println("수정할 메뉴와 가격 선택해주세요");
			   			inputfood = sc.next();
			   			if(menu.containsKey(inputfood)) {
			   				
			   				inputprice = sc.next();
			   				menu.put(inputfood, inputprice);
			   				System.out.println("수정 완료");
			   			}
			   			else {
			   				System.out.println("수정 실패");
			   			}
			   		}
			   		else if(num2 == 2) {
			   			System.out.println("삭제 할 메뉴선택");
			   			inputfood = sc.next();
			   			if(menu.containsKey(inputfood)) {
			   				menu.remove(key);
			   				System.out.println("삭제 완료");
			   			}
			   			else {
			   				
			   			}
			   		}
			   		else {
			   			continue;
			   		}
			   		
			   		
			   		
					break;
			case 3:
					return;
					
			
			}
		}
	}

}
