package protice2;

public class OverRidingBus {
	
		public static void main(String[] args) {
			OverRidingCar car = new OverRidingSuperCar();
			OverRidingCar car2 = new OverRidingSuperCar();
			
			
			car.car();
			car2.door();
			
		}
}
