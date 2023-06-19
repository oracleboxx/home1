package protice2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class setget2 {

	 private String id;
	    private String pwd;

	    public void setId(String id) {
	        this.id = id;
	    }

	    public String getId() {
	        return id;
	    }

	    public void setPwd(String pwd) {
	        this.pwd = pwd;
	    }

	    public String getPwd() {
	        return pwd;
	    }
	    public boolean login() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("아이디를 입력하세요: ");
	        String inputId = scanner.nextLine();
	        System.out.println("비밀번호를 입력하세요: ");
	        String inputPwd = scanner.nextLine();

	        if (inputId.equals(id) && inputPwd.equals(pwd)) {
	            System.out.println("로그인 성공!");
	            return true;
	        } else {
	            System.out.println("로그인 실패!");
	            return false;
	        }
	    }
	    public void signup() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("아이디를 입력하세요: ");
	        String newId = scanner.nextLine();
	        System.out.println("비밀번호를 입력하세요: ");
	        String newPwd = scanner.nextLine();

	        setId(newId);
	        setPwd(newPwd);

	        System.out.println("회원가입이 완료되었습니다.");

	    }
	public static void main(String[] args) {
		
		setget2 sg = new setget2();
		sg.setId("아이디");
		sg.setPwd("비밀번호");
	    Scanner scanner = new Scanner(System.in);
        int choice;
		  do {
	            System.out.println("1. 로그인");
	            System.out.println("2. 회원가입");
	            System.out.println("3. 종료");
	            System.out.println("원하는 작업을 선택하세요: ");
	            choice = scanner.nextInt();
	            scanner.nextLine(); // 버퍼 비우기

	            switch (choice) {
	                case 1:
	                    if (sg.login()) {
	                 
	                    }
	                    break;
	                case 2:sg.signup();
	                    	
	                    break;
	                case 3:
	                    System.out.println("프로그램을 종료합니다.");
	                    break;
	                default:
	                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
	                    break;
	            }
	        } while (choice != 3);
	}
}