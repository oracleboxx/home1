package protice3;
class Point2D{
	private int x=10;
	private int y=20;
	
	public Point2D() {
		
	}
	public Point2D(int x , int y) {
		this.x =x;
		this.y =y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}
class Point3D extends Point2D{
	private int z ;
	public Point3D() {
		
	}
	public int getPoint3D() {
		return z;
	}
	public void setPoint3D(int z) {
		this.z = z;
	}
public Point3D(int x , int y , int z) {
	super(x,y);
	this.z =z;
}
}

public class Test06 {

	public static void main(String[] args) {
		Point3D p = new Point3D();
		p.setX(10);
		p.setY(20);
		p.setPoint3D(30);
		System.out.println(p.getPoint3D()+":"+p.getX()+":"+p.getY());
	}

}
