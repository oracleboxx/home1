package protice;
import java.util.Scanner;
public class protice_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		
		System.out.print("국어 점수 입력: ");
		int kor = sc.nextInt();
		 System.out.print("수학 점수 입력: ");
		int mat = sc.nextInt();
		System.out.print("영어 점수 입력: ");
		int eng = sc.nextInt();
		
		int sum = kor + mat + eng;
		System.out.println("총점: "+sum);
		double avg = sum / 3.0 ;
		System.out.printf("평균 점수:%.2f ",avg);
		
		
		
		if(avg >= 90) {
			System.out.println("A등급");
		}else if(avg >= 80) {
			System.out.println("B등급");
		}else if(avg >= 70) {
			System.out.println("C등급");
		}else if(avg >= 60) {
			System.out.println("D등급");
		}else {
			System.out.println("F등급");
		}
		
	}

}
