
public class Circle {
	private double radius;
	private double area;
	
	public Circle(double radius) {
		this.radius = radius;
		area = Math.pow(radius, 2) * Math.PI;
	}
	
	public void setRadius(double r) {
		radius = r;
		setArea(radius);
	}
	
	public void setArea(double r){
		this.area = Math.sqrt(area / Math.PI); 
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return area;
	}
	
}
