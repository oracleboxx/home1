package protice3;

abstract class Controller{

	public  abstract void init();
	
	public abstract void run();
		
	public abstract void finish();
	
	
	public void every() {
		this.init();
		this.run();
		this.finish();
	}
}
  class FirstController extends Controller{
	  public void init() {
			System.out.println("초기화 하는 코드");
	 }
	 public void run() {
		 System.out.println("별도로 동작하는 코드");
	  }
	 public void finish() {
			System.out.println("마무리 시키는 코드");
	 }
	
  }

 public class Test12 {

	public static void main(String[] args) {
		Controller c1 = new FirstController();
	if(c1 instanceof FirstController) {
		FirstController f1 = (FirstController)c1;
		f1.every();
	}
		
	}

}
