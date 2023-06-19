package protice2;

public class OverRidingSuperCar extends OverRidingCar{
		public void car() {
			System.out.println("빨리 달린다");
		}
		public void door() {
			System.out.println("문이 2개다");
		}
	
	
	public static void main(String[] args) {
		OverRidingCar car = new OverRidingSuperCar();
	
		car.car();
		car.door();
	}
}
