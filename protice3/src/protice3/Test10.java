package protice3;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물은 움직입니다");
	}
	
}
class Human extends Animal{
	public void move() {
		System.out.println("사람은 두발로 걸어다닙니다");
	}
	public void read() {
		System.out.println("책을 읽습니다");
	}
}
class Tigger extends Animal{
	public void move() {
		System.out.println("호랑이 뛰어 다닙니다");
	}
	public void tiggereat() {
		System.out.println("호랑이는 먹이를 먹습니다");
	}
	
}
class Pigeon extends Animal {
	public void move() {
		System.out.println("비둘기는 움직입니다");
	}
	public void pigeonfly() {
		System.out.println("비둘기는 날아다닙니다");
	}
}
public class Test10 {
	ArrayList<Animal> aniList =new ArrayList<Animal>() ;
	public static void main(String[] args) {
		Test10 aniTest = new Test10();
		aniTest.addAnimal();
		aniTest.testCasting();
	}
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tigger());
		aniList.add(new Pigeon());
		for(Animal ani : aniList) {
			ani.move();
		}
	
	}
	public void testCasting() {
		for(int i =0 ; i<aniList.size(); i++) {
			Animal ani = aniList.get(i);
			if(ani instanceof Human) {
				System.out.println("다운 캐스팅 가능");
				Human h = (Human)ani;
			}
			else if(ani instanceof Tigger) {
				Tigger t = (Tigger)ani;
			}
			else if(ani instanceof Pigeon) {
				Pigeon p = (Pigeon)ani;
			}
			else {
				System.out.println("지원이 안된다");
			}
		}
	}
}

