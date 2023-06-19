package protice;
import java.util.Scanner;
public class protice_test4 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int time =sc.nextInt();
		int money = sc.nextInt();
		int poss =500;
		int total =0;
		
		if(time==30) {
			total = time ;
		}
		else if(time<=31 && time<=40) {
			total =(time +10)+ poss;
		}
		else if(time>=41 && time<=50) {
			total = (time + 10) + poss;
		}
		else {
			System.out.println("입력을 한번만 해주세요");
		}
		System.out.println("");
	}

}
