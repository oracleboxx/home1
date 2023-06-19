package protice;

import java.util.Scanner;

public class protice_test15 {
private	String name ,grade;
private	int kor, eng,math,sum;
private double avg;
		public void input() {
			Scanner input = new Scanner(System.in);
			System.out.println("이름 , 국어 , 영어 , 수학 입력");
			this.name = input.next();
			this.kor = input.nextInt();
			this.eng = input.nextInt();
			this.math = input.nextInt();
		}
			public void sum() {
				String name =this.name;
				int kor = this.kor;
				int eng =this.eng;
				int math = this.math;
				this.sum = kor + eng + math ;
			
			
		}
			public void avg() {
				int kor = this.kor;
				int eng =this.eng;
				int math = this.math;
				int sum = this.sum;
				 this.avg = sum /3;
			}
			public void show() {
				System.out.println("이름"+this.name);
				System.out.println("국어"+this.kor);
				System.out.println("영어"+this.eng);
				System.out.println("수학"+this.math);
				System.out.println("합"+this.sum);
				System.out.println("평균"+this.avg);
				System.out.println("등급: "+this.grade);
			}
			public void Grade() {
				 double avg =this.avg;
				if(avg >= 90) {
					this.grade = "A";
				}
				else if (avg >= 80) {
					this.grade = "B";
					
				}
				else {
					this.grade = "C";
				}
				
			}
	public static void main(String[] args) {
		protice_test15 pro = new protice_test15();
		pro.input();
		pro.sum();
		pro.avg();
	
		pro.Grade();
		pro.show();
	}

}
