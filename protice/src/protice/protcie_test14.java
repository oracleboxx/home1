package protice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class protcie_test14 {
public static void main(String[] args) {
	HashMap<String, String> map = new HashMap<>();
	Scanner input = new Scanner(System.in);
	while(true) {
		System.out.println("1.아이디 비밀번호 등록");
		System.out.println("2.등록 확인");
		System.out.println("3.수정 삭제 ");
		System.out.println("4. 종료");
		int num = input.nextInt();
		String ID =null , PW=null;
		switch(num) {
		case 1 : System.out.println("아이디 비밀번호 입력");
		 	 	  ID = input.next();
		 	 	  if(!map.containsKey(ID)) {
		 	 		  PW =input.next();
		 	 		  map.put(ID, PW);
		 	 		  System.out.println("회원 등록되었습니다");
		 	 	  }
		 	 	  else {
		 	 		  System.out.println("회원 등록이 안되었습니다");
		 	 	  }
		 	 	  
				break;
		case 2 :Set<String> key = map.keySet();
				Iterator<String> I = key.iterator();
				while(I.hasNext()) {
					       String dex = I.next();
					       System.out.println(dex+"정보:"+map.get(dex)); 
				}
				
				break;
		case 3 : System.out.println("1.수정");
		 		 System.out.println("2.수정");
		 		 num =input.nextInt();
		 		 if(num == 1) {
		 			 System.out.println("수정할 정보 입력해주세요");
		 			 ID = input.next();
		 			 if(map.containsKey(ID)) {
		 				 PW=input.next();
		 				 map.put(ID, PW);
		 				 System.err.println("수정완료");
		 			 }
		 			 else {
		 				 System.out.println("수정이 안됬습니다");
		 			 }
		 		 }
		 		 else if(num == 2) {
		 			 System.out.println("삭제할 정보 입력해주세요");
		 			 ID = input.next();
		 			 if(map.containsKey(ID)) {
		 				 map.remove(ID);
		 				 map.remove(PW);
		 				 System.out.println("삭제 완료");
		 			 }
		 			 else {
		 				 System.out.println("삭제하지 못했습니다");
		 			 }
		 		 }
			
				break;
		case 4 : 	
				return;
		
		}
	}

}
}
