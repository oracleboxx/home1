package protice2;

import java.util.Scanner;

public class setget {
	 private String name, grade;
	   private int kor, eng, math, sum;
	   private double avg;
	  public void input() {
		  Scanner input = new Scanner(System.in);
		  this.name = input.next();
		  this.kor = input.nextInt();
		  this.eng = input.nextInt();
		  this.math = input.nextInt();
		  
		  
	  }
	  public void sum() {
		  this.sum = this.kor + this.eng + this.math;
		  

	  }
	  public void avg() {
		  this.avg = this.sum/3 ; 
	  }
	  public void grade() {
		  
		  if(avg>90) {
			  this.grade = "A";
		  }
		  else if(avg >80){
			  this.grade = "B";
			  
		  }
		  else {
			  this.grade = "C";
		  }
		  
	  }
	  public void show() {
		  

			System.out.println("더한 값"+this.sum);
			System.out.println("평균 값 :"+this.avg);
			System.out.println("국어 :"+this.kor);
			System.out.println("영어 :"+this.eng);
			System.out.println("수학 :"+this.math);
			System.out.println("등급 :"+this.grade);
	  }
	  
	public static void main(String[] args) {
			setget sg = new setget();
			sg.input();
			sg.sum();
			sg.avg();
			sg.grade();
			sg.show();
		}
		/*
		TestClass02에서 하는 역할은 set,getter과 연산을 담당하는 역할을 한다
		기본 입출력은 main에서 만든
		입력, 연산, 출력 기능을 만들어 주세요
		입력 : 이름, 국, 영, 수
		연산 : 합을 구하는 기능, 평균을 구하는 기능, 등급 구하는 기능
		출력 : 이름, 국, 영, 수, 합, 평균, 등급
		등급 : 평균이 90이상 A, 80이상 B 나머진 C
		*/
	}


