package protice3;

class Employee{
	public String name;
	public String grade;
	
	public Employee(String name ) {
		this.name = name;
		
	}
}
public class Test11 {

	public static void main(String[] args) {
		Employee e = new Employee("lee");
		System.out.println(e.name);
	}

}
