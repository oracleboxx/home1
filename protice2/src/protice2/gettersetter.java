package protice2;

public class gettersetter {
	
	 int power , dex , intel;
	 public int getpower() {
		 return power; 
	 }
	 public void setpower(int power) {
		 if(power<0) {
			 this.power=0;
		 }
		 else {
			 this.power = power;
		 }
	 }
	 public int getdex() {
		 return dex ;	
	 }
	 public void setdex(int dex) {
		 this.dex = dex;
		 if(dex<0) {
			 this.dex = 0;
		 }
		 else {
			 this.dex = dex;
		 }
	 }
	 
	 public int getintel() {
		 return intel;
	 }
	 public void setintel(int intel) {
		 this.intel = intel;
		 if(intel<0) {
			 this.intel = 0;
			 
		 }
		 else {
			 this.intel = intel;
		 }
	 }
	public static void main(String[] args) {
		gettersetter stat = new gettersetter();
	
		stat.setpower(50);
		stat.setdex(10);
		stat.setintel(40);
		System.out.println("나의 힘"+stat.getpower());
		System.out.println("나의 민첩"+stat.getdex());
		System.out.println("나의 지능"+stat.getdex());
		
		
	}

}
